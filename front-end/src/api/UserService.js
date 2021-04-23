import axiosClient from "./axiosClient";

export default {
  signup(user) {
    return axiosClient.post("/register", user);
  },

  login(user) {
    return axiosClient.post("/authenticate", user);
  },

  addAuthorizationHeader(token) {
    axiosClient.defaults.headers.common['Authorization'] = `Bearer ${token}`;
  }
}

