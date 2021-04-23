<template>
  <div class="about">
    <v-form ref="form">
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field v-model="username" label="Username" outlined></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field type="password" v-model="password" label="Password" outlined></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-btn color="info" @click="login">Login</v-btn>
        </v-col>
      </v-row>
    </v-form>
  </div>
</template>

<script>
export default {
  props: ["employeeId"],
  components: {},
  data() {
    return {
      username: null,
      password: null
    };
  },

  methods: {
    async login() {
      const user = {
        username: this.username,
        password: this.password
      };

      await this.$store.dispatch("login", user);
      this.$router.push("/employee/all");
    }
  }
};
</script>

<style></style>
