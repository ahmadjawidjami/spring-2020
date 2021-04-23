<template>
  <v-app>
    <router-link to="/">Home</router-link>
    <router-link to="/employee/add">Add Employee</router-link>
    <router-link v-if="loggedIn" to="/employee/all">Employees</router-link>
    <span v-if="!loggedIn">
      <router-link to="/user/register">Signup</router-link>
      <br />
      <router-link to="/login">Login</router-link>
    </span>
    <span v-else>
      <v-btn color="primary" @click="logout">Logout</v-btn>
    </span>

    <v-container>
      <router-view></router-view>
    </v-container>
  </v-app>
</template>

<script>
export default {
  name: "App",

  data: () => ({
    //
  }),

  methods: {
    logout() {
      this.$store.dispatch("logout");
    }
  },
  computed: {
    loggedIn() {
      return this.$store.getters.loggedIn;
    }
  }
};
</script>
