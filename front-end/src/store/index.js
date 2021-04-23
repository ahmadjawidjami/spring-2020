import Vue from "vue";
import Vuex from "vuex";
import UserService from "../api/UserService";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    text: "Hello",
    timeout: 6000,
    user: null
  },
  mutations: {
    SET_SNACKBAR: (state, payload) => {
      state.text = payload.text,
        state.timeout = payload.timeout
    },

    SET_USER: (state, userData) => {
      state.user = userData;
      localStorage.setItem("user", JSON.stringify(userData));
      UserService.addAuthorizationHeader(userData.token);
    },
    CLEAR_USER: (() => {
      location.reload();
      localStorage.removeItem("user");
    })
  },
  actions: {
    updateSnackbar({ commit }, payload) {
      commit("SET_SNACKBAR", payload);
    },
    async signup({ commit }, user) {
      const response = await UserService.signup(user);

      commit("SET_USER", response.data);
    },
    async login({ commit }, user) {
      const response = await UserService.login(user);
      commit("SET_USER", response.data);
    },

    logout({ commit }) {
      commit("CLEAR_USER");
    }
  },

  getters: {
    loggedIn(state) {
      return !!state.user;
    }
  },

  modules: {}
});
