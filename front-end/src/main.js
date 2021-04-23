import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import vuetify from "./plugins/vuetify";
import store from "./store";
import axiosClient from "./api/axiosClient";

Vue.config.productionTip = false;

export const eventBus = new Vue();

new Vue({
  router,
  vuetify,
  store,
  created() {
    const userData = localStorage.getItem("user");
    if (userData) {
      this.$store.commit("SET_USER", JSON.parse(userData));
    }


    axiosClient.interceptors.response.use(
      response => response,
      error => {
        if (error.response.status === 403) {
          this.$store.dispatch("logout");
        }

        return Promise.reject(error);
      }
    )
  },
  render: h => h(App)
}).$mount("#app");
