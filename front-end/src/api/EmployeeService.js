import axiosClient from "./axiosClient";

export default {
  addEmployee(employee) {
    return axiosClient.post("/employee/add", employee);
  },

  getAllEmployees() {
    return axiosClient.get("/employee/all");
  },

  deleteById(employeeId) {
    return axiosClient.delete(`/employee/${employeeId}/delete`);
  },

  getById(employeeId) {
    return axiosClient.get(`/employee/${employeeId}`);
  },

  updateEmployee(employee) {
    return axiosClient.put("/employee/update", employee);
  }
};
