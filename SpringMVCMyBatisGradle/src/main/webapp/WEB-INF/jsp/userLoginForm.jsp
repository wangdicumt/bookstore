<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/login2.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<h1>登录页面</h1>
<h2>${requestScope.message }</h2>
  <div class="login-box">
<form method="post" action="login">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="loginname"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="password"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="登录"/></td>
		</tr>
	</table>
</form>
<a href="${pageContext.request.contextPath}/register">注册</a>	
</div>
</body>
</html>