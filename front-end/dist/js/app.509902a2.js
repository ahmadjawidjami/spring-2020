(function(e){function t(t){for(var a,l,s=t[0],u=t[1],c=t[2],i=0,d=[];i<s.length;i++)l=s[i],Object.prototype.hasOwnProperty.call(r,l)&&r[l]&&d.push(r[l][0]),r[l]=0;for(a in u)Object.prototype.hasOwnProperty.call(u,a)&&(e[a]=u[a]);m&&m(t);while(d.length)d.shift()();return o.push.apply(o,c||[]),n()}function n(){for(var e,t=0;t<o.length;t++){for(var n=o[t],a=!0,l=1;l<n.length;l++){var u=n[l];0!==r[u]&&(a=!1)}a&&(o.splice(t--,1),e=s(s.s=n[0]))}return e}var a={},r={app:0},o=[];function l(e){return s.p+"js/"+({about:"about"}[e]||e)+"."+{about:"874a55c7"}[e]+".js"}function s(t){if(a[t])return a[t].exports;var n=a[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,s),n.l=!0,n.exports}s.e=function(e){var t=[],n=r[e];if(0!==n)if(n)t.push(n[2]);else{var a=new Promise((function(t,a){n=r[e]=[t,a]}));t.push(n[2]=a);var o,u=document.createElement("script");u.charset="utf-8",u.timeout=120,s.nc&&u.setAttribute("nonce",s.nc),u.src=l(e);var c=new Error;o=function(t){u.onerror=u.onload=null,clearTimeout(i);var n=r[e];if(0!==n){if(n){var a=t&&("load"===t.type?"missing":t.type),o=t&&t.target&&t.target.src;c.message="Loading chunk "+e+" failed.\n("+a+": "+o+")",c.name="ChunkLoadError",c.type=a,c.request=o,n[1](c)}r[e]=void 0}};var i=setTimeout((function(){o({type:"timeout",target:u})}),12e4);u.onerror=u.onload=o,document.head.appendChild(u)}return Promise.all(t)},s.m=e,s.c=a,s.d=function(e,t,n){s.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},s.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},s.t=function(e,t){if(1&t&&(e=s(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(s.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var a in e)s.d(n,a,function(t){return e[t]}.bind(null,a));return n},s.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return s.d(t,"a",t),t},s.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},s.p="/",s.oe=function(e){throw console.error(e),e};var u=window["webpackJsonp"]=window["webpackJsonp"]||[],c=u.push.bind(u);u.push=t,u=u.slice();for(var i=0;i<u.length;i++)t(u[i]);var m=c;o.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"0dde":function(e,t,n){"use strict";var a=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"about"},[n("v-row",[n("v-col",{staticClass:"mx-auto",attrs:{cols:"12",sm:"6"}},[n("v-text-field",{attrs:{label:"First Name",outlined:""},model:{value:e.firstName,callback:function(t){e.firstName=t},expression:"firstName"}})],1)],1),n("v-row",[n("v-col",{staticClass:"mx-auto",attrs:{cols:"12",sm:"6"}},[n("v-text-field",{attrs:{label:"Last Name",outlined:""},model:{value:e.lastName,callback:function(t){e.lastName=t},expression:"lastName"}})],1)],1),n("v-row",[n("v-col",{staticClass:"mx-auto",attrs:{cols:"12",sm:"6"}},[n("v-select",{attrs:{items:e.items,label:"Gender",outlined:""},model:{value:e.gender,callback:function(t){e.gender=t},expression:"gender"}})],1)],1),n("v-row",[n("v-col",{staticClass:"mx-auto",attrs:{cols:"12",sm:"6"}},[n("v-text-field",{attrs:{label:"Salary",outlined:""},model:{value:e.salary,callback:function(t){e.salary=t},expression:"salary"}})],1)],1),n("v-row",[n("v-col",{staticClass:"mx-auto",attrs:{cols:"12",sm:"6"}},[e.employeeId?n("v-btn",{attrs:{color:"info"},on:{click:e.updateEmployee}},[e._v("Update")]):n("v-btn",{attrs:{color:"info"},on:{click:e.saveEmployee}},[e._v("Save")])],1)],1)],1)},r=[],o=(n("96cf"),n("1da1")),l=n("7b36"),s=n("56d7"),u={props:["employeeId"],components:{},data:function(){return{firstName:null,lastName:null,gender:null,salary:null,items:["Male","Female"]}},methods:{saveEmployee:function(){var e=this;return Object(o["a"])(regeneratorRuntime.mark((function t(){var n,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return n={firstName:e.firstName,lastName:e.lastName,gender:e.gender,salary:e.salary},t.next=3,l["a"].addEmployee(n);case 3:a=t.sent,console.log(a),e.resetForm(),s["eventBus"].$emit("employeeSaved",!0);case 7:case"end":return t.stop()}}),t)})))()},resetForm:function(){this.firstName=null,this.lastName=null,this.gender=null,this.salary=null},updateEmployee:function(){var e=this;return Object(o["a"])(regeneratorRuntime.mark((function t(){var n,a,r;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return n={_id:e.employeeId,firstName:e.firstName,lastName:e.lastName,gender:e.gender,salary:e.salary},t.next=3,l["a"].updateEmployee(n);case 3:a=t.sent,r=a.data,s["eventBus"].$emit("employeeSaved",!0),setTimeout((function(){e.$router.push("/employee/all")}),2e3),console.log(r);case 8:case"end":return t.stop()}}),t)})))()}},created:function(){var e=this;return Object(o["a"])(regeneratorRuntime.mark((function t(){var n,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!e.employeeId){t.next=9;break}return t.next=3,l["a"].getById(e.employeeId);case 3:n=t.sent,a=n.data,e.firstName=a.firstName,e.lastName=a.lastName,e.gender=a.gender,e.salary=a.salary;case 9:case"end":return t.stop()}}),t)})))()}},c=u,i=n("2877"),m=n("6544"),d=n.n(m),p=n("8336"),f=n("62ad"),v=n("0fd9"),y=n("b974"),b=n("8654"),h=Object(i["a"])(c,a,r,!1,null,null,null);t["a"]=h.exports;d()(h,{VBtn:p["a"],VCol:f["a"],VRow:v["a"],VSelect:y["a"],VTextField:b["a"]})},"56d7":function(e,t,n){"use strict";n.r(t),n.d(t,"eventBus",(function(){return Z}));n("e260"),n("e6cf"),n("cca6"),n("a79d");var a=n("2b0e"),r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-app",[n("router-link",{attrs:{to:"/"}},[e._v("Home")]),n("router-link",{attrs:{to:"/employee/add"}},[e._v("Add Employee")]),n("router-link",{attrs:{to:"/employee/all"}},[e._v("Employees")]),n("v-container",[n("router-view")],1)],1)},o=[],l={name:"App",data:function(){return{}}},s=l,u=n("2877"),c=n("6544"),i=n.n(c),m=n("7496"),d=n("a523"),p=Object(u["a"])(s,r,o,!1,null,null,null),f=p.exports;i()(p,{VApp:m["a"],VContainer:d["a"]});n("d3b7");var v=n("8c4f"),y=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"home"},[n("HelloWorld",{attrs:{msg:"Welcome to Your Vue.js App"}})],1)},b=[],h=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-container",[e._v(" "+e._s(e.msg)+" ")])},_=[],g={name:"HelloWorld",props:["msg"],data:function(){return{hello:"Hello World"}}},x=g,w=Object(u["a"])(x,h,_,!1,null,null,null),k=w.exports;i()(w,{VContainer:d["a"]});var E={name:"Home",components:{HelloWorld:k}},N=E,j=Object(u["a"])(N,y,b,!1,null,null,null),O=j.exports,C=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("v-simple-table",{scopedSlots:e._u([{key:"default",fn:function(){return[n("thead",[n("tr",[n("th",{staticClass:"text-left"},[e._v("First Name")]),n("th",{staticClass:"text-left"},[e._v("Last Name")]),n("th",{staticClass:"text-left"},[e._v("Gender")]),n("th",{staticClass:"text-left"},[e._v("Salary")]),n("th",{staticClass:"text-left"},[e._v("Action")])])]),n("tbody",e._l(e.employees,(function(t){return n("tr",{key:t._id},[n("td",[e._v(e._s(t.firstName))]),n("td",[e._v(e._s(t.lastName))]),n("td",[e._v(e._s(t.gender))]),n("td",[e._v(e._s(t.salary))]),n("td",[n("v-btn",{staticClass:"mr-2",attrs:{to:{name:"EditEmployee",params:{id:t._id}},small:"",color:"warning"}},[e._v("Edit")]),n("v-btn",{attrs:{small:"",color:"error"},on:{click:function(n){return e.deleteEmployee(t._id)}}},[e._v("Delete")])],1)])})),0)]},proxy:!0}])})],1)},S=[],V=(n("4de4"),n("96cf"),n("1da1")),R=n("7b36"),$={data:function(){return{employees:[]}},methods:{deleteEmployee:function(e){var t=this;return Object(V["a"])(regeneratorRuntime.mark((function n(){var a,r;return regeneratorRuntime.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(a=confirm("Do you really want to delete this employee?"),!a){n.next=7;break}return n.next=4,R["a"].deleteById(e);case 4:r=n.sent,console.log(r.data),t.employees=t.employees.filter((function(t){return t._id!==e}));case 7:case"end":return n.stop()}}),n)})))()}},mounted:function(){var e=this;return Object(V["a"])(regeneratorRuntime.mark((function t(){var n;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,R["a"].getAllEmployees();case 2:n=t.sent,e.employees=n.data;case 4:case"end":return t.stop()}}),t)})))()}},I=$,B=(n("8f46"),n("8336")),A=n("1f4f"),P=Object(u["a"])(I,C,S,!1,null,null,null),F=P.exports;i()(P,{VBtn:B["a"],VSimpleTable:A["a"]});var T=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("v-row",[n("v-col",{staticClass:"mx-auto dark--text",attrs:{cols:"12",sm:"6"}},[n("h1",[e._v("Edit employee")])])],1),n("EmployeeForm",{attrs:{employeeId:e.employeeId}}),n("MySnackbar",{attrs:{text:"Employeed updated successfully"}})],1)},H=[],M=n("0dde"),L=n("e550"),W={components:{EmployeeForm:M["a"],MySnackbar:L["a"]},data:function(){return{employeeId:this.$route.params.id}}},D=W,G=n("62ad"),J=n("0fd9"),U=Object(u["a"])(D,T,H,!1,null,null,null),q=U.exports;i()(U,{VCol:G["a"],VRow:J["a"]}),a["a"].use(v["a"]);var Y=[{path:"/",name:"Home",component:O},{path:"/employee/add",name:"About",component:function(){return n.e("about").then(n.bind(null,"a81c"))}},{path:"/employee/all",name:"Employees",component:F},{path:"/employee/:id/edit",name:"EditEmployee",component:q}],z=new v["a"]({mode:"history",base:"/",routes:Y}),K=z,Q=n("f309");a["a"].use(Q["a"]);var X=new Q["a"]({});a["a"].config.productionTip=!1;var Z=new a["a"];new a["a"]({router:K,vuetify:X,render:function(e){return e(f)}}).$mount("#app")},"7b36":function(e,t,n){"use strict";var a=n("bc3a"),r=n.n(a),o=r.a.create({baseURL:"http://localhost:3000"});t["a"]={addEmployee:function(e){return o.post("/employee/add",e)},getAllEmployees:function(){return o.get("/employee/all")},deleteById:function(e){return o.delete("/employee/".concat(e,"/delete"))},getById:function(e){return o.get("/employee/".concat(e))},updateEmployee:function(e){return o.put("/employee/update",e)}}},84183:function(e,t,n){},"8f46":function(e,t,n){"use strict";var a=n("84183"),r=n.n(a);r.a},e550:function(e,t,n){"use strict";var a=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"text-center ma-2"},[n("v-snackbar",{attrs:{color:"success",right:""},scopedSlots:e._u([{key:"action",fn:function(t){var a=t.attrs;return[n("v-btn",e._b({attrs:{color:"white",text:""},on:{click:function(t){e.snackbar=!1}}},"v-btn",a,!1),[e._v("Close")])]}}]),model:{value:e.snackbar,callback:function(t){e.snackbar=t},expression:"snackbar"}},[e._v(" "+e._s(e.text)+" ")])],1)},r=[],o=n("56d7"),l={props:["text"],data:function(){return{snackbar:!1}},created:function(){var e=this;o["eventBus"].$on("employeeSaved",(function(t){e.snackbar=t}))}},s=l,u=n("2877"),c=n("6544"),i=n.n(c),m=n("8336"),d=n("2db4"),p=Object(u["a"])(s,a,r,!1,null,null,null);t["a"]=p.exports;i()(p,{VBtn:m["a"],VSnackbar:d["a"]})}});
//# sourceMappingURL=app.509902a2.js.map