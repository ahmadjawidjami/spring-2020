<template>
  <div class="about">
    <v-form ref="form">
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field :rules="[required]" v-model="firstName" label="First Name" outlined></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field :rules="[required]" v-model="lastName" label="Last Name" outlined></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field :rules="[required]" v-model="username" label="Username" outlined></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field :rules="[required]" v-model="email" label="Email" outlined></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field
            :rules="[required]"
            type="password"
            v-model="password"
            label="Password"
            outlined
          ></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-btn color="info" @click="signup">Signup</v-btn>
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
      firstName: null,
      lastName: null,
      username: null,
      email: null,
      password: null,
      required: value => !!value || "This field is required"
    };
  },

  methods: {
    async signup() {
      if (this.$refs.form.validate()) {
        const user = {
          firstName: this.firstName,
          lastName: this.lastName,
          username: this.username,
          email: this.email,
          password: this.password
        };

        await this.$store.dispatch("signup", user);
        this.$router.push("/employee/all");
      } else {
        console.log("Form is not valid");
      }
    }
  }
};
</script>

<style></style>
