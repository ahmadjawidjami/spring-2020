import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import Employees from "../views/Employees.vue";
import EditEmployee from "../views/EditEmployee";
import Signup from "../views/Signup";
import Login from "../views/Login";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home
  },
  {
    path: "/employee/add",
    name: "About",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/AddEmployee.vue")
  },
  {
    path: "/employee/all",
    name: "Employees",
    component: Employees,
    meta: { authentication: true }
  },
  {
    path: "/employee/:id/edit",
    name: "EditEmployee",
    component: EditEmployee
  },
  {
    path: "/user/register",
    name: "Signup",
    component: Signup
  },
  {
    path: "/login",
    name: "Login",
    component: Login
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});


router.beforeEach((to, from, next) => {
  const loggedIn = localStorage.getItem("user");
  if (to.matched.some(item => item.meta.authentication) && !loggedIn) {
    next("/");
  } else {
    next();
  }


})

export default router;
