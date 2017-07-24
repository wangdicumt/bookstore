<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<title>图书购物系统</title> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<link href="css/login2.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>图书购物系统<sup>V2017</sup></h1>
<h1>注册</h1>
<div class="login" style="margin-top:50px;">
    
   
    
    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 500px;">    

           <div class="web_login">
    	<form name="form2" id="regUser" accept-charset="utf-8"  action="customerRegister" method="post">
	    	<input type="hidden" name="to" value="reg"/>
		    <input type="hidden" name="did" value="0"/>
        	<ul class="reg_form" id="reg-ul">
        		<div id="userCue" class="cue">快速注册请注意格式</div>
             	<li>
                    <label for="user"  class="input-tips2">用户名：</label>
                    <div class="inputOuter2">
                        <input type="text" id="user" name="name" maxlength="16" class="inputstyle2"/>
                    </div>
                </li>
                
                <li>
                <label for="passwd" class="input-tips2">密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd"  name="pass" maxlength="16" class="inputstyle2"/>
                    </div>
                </li>
                
                <li>
                <label for="passwd2" class="input-tips2">确认密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd2" name="password" maxlength="16" class="inputstyle2" />
                    </div>
                    
                </li>
                
                <li>
                 <label for="qq" class="input-tips2">QQ：</label>
                    <div class="inputOuter2">
                        <input type="text" id="qq" name="qq" maxlength="10" class="inputstyle2"/>
                    </div>
                </li>
                
                <li>
                    <div class="inputArea">
                        <input type="button" id="reg"  style="margin-top:10px;margin-left:145px;" class="button_blue" value="注册"/> 
                    </div>
                </li><div class="cl"></div>
            </ul>
         </form>
           
    </div>
	
  </div>

  <!--注册-->
  <div class="qlogin" id="qlogin" style="display: none; ">
   
    
   
    
    </div>
    <!--注册end-->
</div>
<div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>
</body></html>