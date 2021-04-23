<template>
  <div>
    <v-row>
      <v-col cols="12" sm="6" class="mx-auto dark--text">
        <h1>Edit employee</h1>
      </v-col>
    </v-row>
    <EmployeeForm :employeeId="employeeId" />
    <MySnackbar
      ><template slot="text">
        <span>Employee update successfully</span
        ><span>. Redirecting...</span></template
      ></MySnackbar
    >
  </div>
</template>

<script>
import EmployeeForm from "../components/EmployeeForm";
import MySnackbar from "../components/MySnackbar";
export default {
  components: {
    EmployeeForm: EmployeeForm,
    MySnackbar: MySnackbar
  },

  data() {
    return {
      employeeId: this.$route.params.id
    };
  }
};
</script>

<style></style>
