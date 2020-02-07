<template>
    <div class="box">
        <h1>Wellcome to Master Mind!</h1>
        <p style="text-align: center;">
        <img src="~/assets/logo.png" width="130"></p>
        <button v-on:click='submit' class="myButton" >To Play</button>
    </div>
</template>

<script>


export default {
  components: {},
  methods: {
    submit() {
      console.log('LLamando a Dario ......')
    }
  }
}
</script>

<style>
.box{
    height: 350px;
    width:480px;
    padding: 40px;
    margin: 0 auto;
    border: 2px solid #87CEEB;
    border-radius: 40px;
    margin-top: 100px;
    background-color: #6F7B80;
}
.myButton {
    margin-top: 60px;
    display: flex;
    justify-content: center;
    align-items: 20px;
    margin-bottom: -100;
    background-color: #74B3CC;
    border-radius:42px;
    cursor:pointer;
    color:#ffffff;
    font-family:Arial;
    font-size:28px;
    padding:27px 68px;
    text-decoration:none;
    text-shadow:0px -1px 3px #91E0FF;
    position: relative;
}
.myButton:hover {
    background-color: #91E0FF;
} 
.myButton:active {
    position:relative;
    top:1px;
}
h1 {
    display: flex;
    justify-content: center;
    color: aqua;
    font-family: Arial, Helvetica, sans-serif;
    color: #87CEEB;
}
</style>
