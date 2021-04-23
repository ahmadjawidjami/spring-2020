<template>
  <div class="text-center ma-2">
    <v-snackbar color="success" right v-model="snackbar" :timeout="timeout">
      {{ text }}
      <template v-slot:action="{ attrs }">
        <v-btn color="white" text v-bind="attrs" @click="snackbar = false"
          >Close</v-btn
        >
      </template>
    </v-snackbar>
  </div>
</template>

<script>
import { mapState } from "vuex";
export default {
  data() {
    return {
      snackbar: false
    };
  },

  computed: {
    someComputed() {
      return "something";
    },
    ...mapState(["text", "timeout"])
  },

  created() {
    this.$store.subscribe(mutation => {
      if (mutation.type == "SET_SNACKBAR") {
        this.snackbar = true;
      }
    });
  }
};
</script>

<style></style>
