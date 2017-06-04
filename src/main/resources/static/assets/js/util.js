/**
 * Created by Raindrops on 2017/5/10.
 * 谢谢云姐姐帮忙^.^
 * 封装 $.ajax 命令
 *
 */
(function(global,$,undefined){
    'use strict';
    var statusCode = {
        401: function() {
            // 清除sessionStorage
            sessionStorage.removeItem('token');
            location.href = 'login.html';
        },
        403: function(){
            // 清除sessionStorage
            sessionStorage.removeItem('token');
            location.href = 'login.html';
        },
        404: function() {
            location.href = '404.html';
        },
        500: function(){
            // 最好是微提示
           // alert(err || err.message || '服务器异常');
        }
    };
    var request = function(options){
        return $.ajax({
            url: options.url,
            data:options.data,
            headers:{
                token: sessionStorage.getItem('token') || ''
            },
            type: options.type || 'get',
            // 文件上传请去掉contentType
            contentType: options.contentType || 'application/x-www-form-urlencoded',
            statusCode: statusCode,
            beforeSend: function() {
                // 显示加载的loading...
            },
            complete:function(){
                // 关闭loading...
            },
            success:function(data, textStatus, jqXHR){
                // 2xx~3xx
                options.successCallBack(data);
            },
            error: function(xhr,statusText,err){
                // 4xx~5xx
            }
        });
    };
    var $_ajax = {
        get: function(url,data,extra){
            var opt = {url:url,data:data,type:'get'};
            if(extra && extra.successCallBack) opt.successCallBack = extra.successCallBack;
            if(extra && extra.headers) opt.headers = extra.headers;
            return request(opt);
        },
        post: function(url,data,extra){
            var opt = {url:url,data:data,type:'post'};
            if(extra && extra.successCallBack) opt.successCallBack = extra.successCallBack;
            if(extra && extra.headers) opt.headers = extra.headers;
            return request(opt);
        },
        put: function(url,data,extra){
            var opt = {url:url,data:data,type:'put'};
            if(extra && extra.successCallBack) opt.successCallBack = extra.successCallBack;
            if(extra && extra.headers) opt.headers = extra.headers;
            return request(opt);
        },
        delete: function(url,data,extra){
            var opt = {url:url,data:data,type:'delete'};
            if(extra && extra.successCallBack) opt.successCallBack = extra.successCallBack;
            if(extra && extra.headers) opt.headers = extra.headers;
            return request(opt);
        },
        test: function(){
            alert("test");
        }
    };
    global.$_ajax = $_ajax;
})(window, jQuery);
