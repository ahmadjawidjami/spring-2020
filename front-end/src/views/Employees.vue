<template>
  <div>
    <v-simple-table>
      <template v-slot:default>
        <thead>
          <tr>
            <th class="text-left">First Name</th>
            <th class="text-left">Last Name</th>
            <th class="text-left">Gender</th>
            <th class="text-left">Salary</th>
            <th class="text-left">Action</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="employee in employees" :key="employee._id">
            <td>{{ employee.firstName }}</td>
            <td>{{ employee.lastName }}</td>
            <td>{{ employee.gender }}</td>
            <td>{{ employee.salary }}</td>
            <td>
              <v-btn
                :to="{
                  name: 'EditEmployee',
                  params: {
                    id: employee._id
                  }
                }"
                small
                color="warning"
                class="mr-2"
              >Edit</v-btn>
              <v-btn small color="error" @click="deleteEmployee(employee._id)">Delete</v-btn>
            </td>
          </tr>
        </tbody>
      </template>
    </v-simple-table>
  </div>
</template>

<script>
import EmployeeService from "../api/EmployeeService";
export default {
  data() {
    return {
      employees: []
    };
  },

  methods: {
    async deleteEmployee(employeeId) {
      const conf = confirm("Do you really want to delete this employee?");
      if (conf) {
        const response = await EmployeeService.deleteById(employeeId);
        console.log(response.data);
        this.employees = this.employees.filter(employee => {
          return employee._id !== employeeId;
        });
      }
    }
  },

  async mounted() {
    const response = await EmployeeService.getAllEmployees();
    this.employees = response.data;
  }
};
</script>

<style>
th,
td {
  border: 1px solid grey;
}
</style>
