<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core " prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt " prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions " prefix="fn" %>
<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Source code generated using layoutit.com 

">
     <meta name="author" content="LayoutIt!">
 	 <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

    <title>登录界面</title>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.min.js"  type="text/javascript"></script>
<script src="js/jquery.cookie.js"  type="text/javascript"></script>
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
          $.cookie("username", str_username, { expires: 7 });
          $.cookie("password", str_password, { expires: 7 });
        }
        else {
          $.cookie("remember-me", "false", { expire: -1 });
          $.cookie("username", "", { expires: -1 });
          $.cookie("password", "", { expires: -1 });
        }
      };
 </script>			
</head>
  <body>

  <div class="container-fluid">
	  <div class="row">
		  <div class="col-md-12">
			  <h3>
				  ZL.COM 

			  </h3>
		  </div>
	  </div>
	  <div class="row">
		  <div class="col-md-12">
			  <form action="userLogin" method="post" form-horizontal role="form">
				  <div class="form-group">

					  <label for="inputText" class="col-sm-2 control-label">
						  用户名：
					  </label>
					  <div class="col-sm-10">
						  <input type="text" name="username" class="form-control" id="inputText3">
					  </div>
				  </div>
				  <div class="form-group">

					  <label for="inputPassword3" class="col-sm-2 control-label">
						  密码：
					  </label>
					  <div class="col-sm-10">
						  <input type="password" name="password" class="form-control" id="inputPassword3">
					  </div>
				  </div>
				  <div class="form-group">
					  <div class="col-sm-offset-2 col-sm-10">
						  <div class="checkbox">

							  <label for="remember-me"><input id="remember-me" type="checkbox" >记住密码</label>
							  <a href="fpassword">忘记密码</a> &nbsp;<a href=upassword>修改密码</a>
						  </div>
					  </div>
				  </div>
				  <div class="form-group">
					  <div class="col-sm-offset-2 col-sm-10">

						  <input  type="submit" value="登录"  onclick="Save()" class="btn btn-default">
					  </div>
				  </div>
			  </form>



		  </div>
	  </div>
  </div>

  <script src="js/scripts.js"></script>
  </body>
</html>
