<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>商品展示</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
	<link href="themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
</head>


<body>
	<h1 >欢迎进入商品管理页面</h1>
	<div id="header">
		<div class="headerNav">
			<a class="logo" href="http://j-ui.com">标志</a> 
			<ul class="nav">
				<li style="color:#ddd">欢迎${sessionScope.user.loginname}登录</li>
				<li><a href="changepassword"  width="600">修改密码</a></li>
				<li><a href="goodmanage">商品管理</a></li>
				<li><a href="loginForm">退出</a></li>
			</ul>
		</div>
	</div>
	
	<form action="${pageContext.request.contextPath }/addGoods" method="post" enctype="multipart/form-data">
		<table width="100%" height="90%" border="0" cellpadding="5" cellspacing="0" class="main_tabbor">
		<!-- 数据展示区 -->
			<tr valign="top">
				<td height="20">
					<table width="100%" border="1" cellpadding="5" cellspacing="0" style="border:#c2c6cc 1px solid; border-collapse:collapse;">
						<tr class="main_trbg_tit" align="center">
							<td>商品图片</td>
							<td>商品名称</td>
							<td>商品价格</td>
							<td>商品数量</td>
							<td>商品产地</td>
							<td></td>
						</tr >
						<tr class="main_trbg_tit" align="center">
							<td><input type="file" name="picture"></td>
						  <td><input type="text" name="name"></td>
						  <td><input type="text" name="price"></td>
						  <td><input type="text" name="count"></td>
						  <td><input type="text" name="factory"></td>
						  <td><input type="submit" value="添加"></td>
						</tr>
				  </table>
			</td>
		  </tr>
		</table>
	</form>
</body>
</html>