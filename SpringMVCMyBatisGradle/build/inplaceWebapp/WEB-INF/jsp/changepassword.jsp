<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<title>图书管理系统</title> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="images/login.js"></script>
<link href="css/login2.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>图书管理系统<sup>V2017</sup></h1>
<h1>修改密码页面</h1>
<div class="login" style="margin-top:50px;">
    
   
    
    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 300px; width:500px">    

	<div class="web_login" id="web_login">
               
               
        <div class="login-box">
			<div class="login_form">
				<form action="changePassword/${sessionScope.user.id}" name="customerLogin" accept-charset="utf-8" id="login_form" class="loginForm" method="post"><input type="hidden" name="did" value="0"/>
	                <input type="hidden" name="id" value=""/>
	                <div class="uinArea" id="uinArea">
		                <label class="input-tips" for="u">登录：</label>
		                <div class="inputOuter" id="uArea">
		                    <input type="text" id="u" name="name" class="inputstyle" disabled="disabled" placeholder="${sessionScope.user.loginname}"/>
		                </div>
	                </div>
	                
	               			 <div class="uinArea" id="uinArea">
		               		 <label class="input-tips" for="u">原密：</label>
		                		<div class="inputOuter" id="uArea">
		                   		 <input type="text" id="u" name="name" class="inputstyle" disabled="disabled" placeholder="${sessionScope.user.password}"/>
		                		</div>
	                		</div>
	                
	                		<div class="pwdArea" id="pwdArea">
		              			<label class="input-tips" for="p">新密：</label> 
		               			<div class="inputOuter" id="pArea">
		                   			 <input type="password" id="p" name="password" class="inputstyle"/>
		               			 </div>
	                		</div>
	                	<div style="padding-left:50px;margin-top:20px;"><input type="submit" value="修改" style="width:150px;" class="button_blue"/></div>
             		 </form>
           			</div>
       			 </div>
			</div>
 		 </div>
	</div>
	<div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>
</body>
</html>
