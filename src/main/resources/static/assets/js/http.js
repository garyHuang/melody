/**
 * Created by Raindrops on 2017/5/10.
 * 封装全站的http请求
 */
$(function () {
    //登录的请求
    $('#login-btn').click(function () {
        $_http.login();
    });
    //注册的请求
    $('#register-btn').click(function () {
        var data = $('#register-form').serialize();
        $_http.register(data);
    });

})

var $_http = {
    servicePath: 'http://localhost:9090',
    //登录的请求
    login: function () {
        var url = this.servicePath + '/password/login';
        var data = {username:$('#username').val(),password:$('#password').val()};
        $_ajax.post(url,data,{successCallBack:$_response.authentication});
    },
    register: function(data){
        var url = this.servicePath +　'/password/register';
        $_ajax.post(url,data,{successCallBack:$_response.register})
    }
}

var $_response={
    //登录的响应
    authentication: function (data) {
        console.log(data);
        if (data.status == 200){
            sessionStorage.setItem("token",data.data.token);
            sessionStorage.setItem("user",data.data);
            sessionStorage.setItem("account",data.data);
            window.location.href="../public/main.html";
        }else {
            console.log(data.message)
            $('#form-tip').html(data.message);
        }
    },
    register: function (data) {
        console.log(data);
        if (data.status == 200){
            window.location.href="../public/login.html";
        }else {
            console.log(data.message)
            $('#form-tip').html(data.message);
        }
    }
}