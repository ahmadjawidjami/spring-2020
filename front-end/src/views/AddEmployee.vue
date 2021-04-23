<template>
  <div>
    <v-row>
      <v-col cols="12" sm="6" class="mx-auto dark--text">
        <h1>Add employee</h1>
      </v-col>
    </v-row>
    <EmployeeForm />
    <MySnackbar
      ><template slot="text">
        <span>Employee added successfully</span
        ><span>. You can close now</span></template
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
  }
};
</script>

<style></style>
