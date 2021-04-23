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
          <v-select :rules="[required]" v-model="gender" :items="items" label="Gender" outlined></v-select>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-text-field :rules="[required]" type="number" v-model="salary" label="Salary" outlined></v-text-field>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12" sm="6" class="mx-auto">
          <v-btn v-if="employeeId" color="info" @click="updateEmployee">Update</v-btn>
          <v-btn v-else color="info" @click="saveEmployee">Save</v-btn>
        </v-col>
      </v-row>
    </v-form>
  </div>
</template>

<script>
import EmployeeService from "../api/EmployeeService";
export default {
  props: ["employeeId"],
  components: {},
  data() {
    return {
      firstName: null,
      lastName: null,
      gender: null,
      salary: null,
      items: ["Male", "Female"],
      required: value => !!value || "This field is required"
    };
  },

  methods: {
    async saveEmployee() {
      if (this.$refs.form.validate()) {
        const employee = {
          firstName: this.firstName,
          lastName: this.lastName,
          gender: this.gender,
          salary: this.salary
        };

        const savedEmployee = await EmployeeService.addEmployee(employee);
        console.log(savedEmployee);
        this.resetForm();
        this.$store.dispatch("updateSnackbar", {
          snackbar: true,
          text: "Employeed saved successfully",
          timeout: 5000
        });
      } else {
        console.log("Form is not valid");
      }

      // this.$router.push("/employee/all");
    },
    resetForm() {
      this.$refs.form.reset();
    },
    async updateEmployee() {
      const employee = {
        _id: this.employeeId,
        firstName: this.firstName,
        lastName: this.lastName,
        gender: this.gender,
        salary: this.salary
      };

      const response = await EmployeeService.updateEmployee(employee);
      const updingEmployee = response.data;
      this.$store.dispatch("updateSnackbar", {
        snackbar: true,
        text: "Employeed updated successfully",
        timeout: 1000
      });
      setTimeout(() => {
        this.$router.push("/employee/all");
      }, 2000);
      console.log(updingEmployee);
    }
  },

  async created() {
    if (this.employeeId) {
      const response = await EmployeeService.getById(this.employeeId);
      const employee = response.data;
      this.firstName = employee.firstName;
      this.lastName = employee.lastName;
      this.gender = employee.gender;
      this.salary = employee.salary;
    }
  }
};
</script>

<style></style>
