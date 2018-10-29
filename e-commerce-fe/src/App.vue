<template>
  <div id="app">
    <h1>Hello World</h1>
    <h1>Hellow World : {{subject}}</h1>
    <a href="http://localhost:3000/login">OK</a>
    <div>
      <b-button @click="loginFacebook()" style="background-color:rgb(59,89,152)">Facebook Login</b-button>
    </div>
  </div>
</template>


<script>
import axios from "axios";

export default {
  name: "App",
  data() {
    return {
      subject: "Default"
    };
  },
  mounted() {
    //this.getSubject();
  },
  methods: {
    getSubject: async function() {
      let subject = await axios.get("http://localhost:3000/test/1");
      this.subject = subject.data.word;
      console.log(this.subject);
    },
    loginFacebook: function() {
      axios.get('http://localhost:3000/login/facebook')
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
