<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<title>图书购物系统</title> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script src="js/jquery.cookie.js"  type="text/javascript"></script>
<link href="css/login2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
    $(document).ready(function () {
        if ($.cookie("remember-me") == "true") {
        $("#remember-me").attr("checked", true);
        $("#inputText3").val($.cookie("username"));
        $("#inputPassword3").val($.cookie("password"));
        }
      });
     
      //记住用户名密码
      function Save() {
        if ($("#remember-me:checked").length==1) {
          var str_username = $("#inputText3").val();
          var str_password = $("#inputPassword3").val();
          $.cookie("remember-me", "true", { expires: 7 }); //存储一个带7天期限的cookie
          $.cookie("name", str_username, { expires: 7 });
          $.cookie("password", str_password, { expires: 7 });
        }
        else {
          $.cookie("remember-me", "false", { expire: -1 });
          $.cookie("name", "", { expires: -1 });
          $.cookie("password", "", { expires: -1 });
        }
      };
 </script>			
</head>
<body>
<h1>图书购物系统<sup>V2017</sup></h1>
<h1>登录页面</h1>
<div class="login" style="margin-top:50px;">
    
   
    
    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 300px;">    

            <!--登录-->
	<div class="web_login" id="web_login">
               
               
        <div class="login-box">
			<div class="login_form">
				<h2>${requestScope.message }</h2>
				<h2>${requestScope.success }</h2>
				<form action="customerLogin" name="form1" accept-charset="utf-8" id="login_form" class="loginForm" method="post"><input type="hidden" name="did" value="0"/>
	                <input type="hidden" name="to" value="log"/>
	                <div class="uinArea" id="uinArea">
		                  <label class="input-tips" for="u">帐号：</label>
		                <div class="inputOuter" id="uArea">
		                    <input type="text" id="inputText3" name="name" class="inputstyle"/>
		                </div>

	                </div>
	                
	                <div class="pwdArea" id="pwdArea">
               			<label class="input-tips" for="p">密码：</label> 
			           	<div class="inputOuter" id="pArea">
			                <input type="password" id="inputPassword3" name="password" class="inputstyle"/>
			            </div>
         
	                </div>
	                
	                <label for="remember-me"><input id="remember-me" type="checkbox" >记住密码</label>
	                
	                <div style="padding-left:50px;margin-top:20px;"><input type="submit" value="登 录" style="width:150px;" class="button_blue"/></div>
	               	<a href="${pageContext.request.contextPath}/registerForm" style="font-size:20px">注册</a><br/>
	               
              </form>
              
           </div>
           
        </div>
	</div>
		  <a href="findPassword " style="font-size:15px">找回密码</a>
          <div style="padding-left:250px;margin-top:20px;"><a href="${pageContext.request.contextPath}/userLoginForm" style="font-size:15px">管理员登录</a></div>
           
           <!--登录end-->
  </div>

 
</div>
<div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>
</body></html>