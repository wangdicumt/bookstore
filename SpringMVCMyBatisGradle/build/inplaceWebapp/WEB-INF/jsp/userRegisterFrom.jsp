<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/login2.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<h1>注册</h1>
<form:form method="post" action="register" modelAttribute="user">
	<table>
		<tr>
			<td>登录名：</td>
			<td><form:input path="loginname"/></td>
			<td><form:errors path="loginname" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><form:password path="password"/></td>
			<td><form:errors path="password" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><form:input path="username"/></td>
			<td><form:errors path="username" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td>电话：</td>
			<td><form:input path="phone"/></td>
			<td><form:errors path="phone" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td>地址：</td>
			<td><form:input path="address"/></td>
			<td><form:errors path="address" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册"/></td>
		</tr>
	</table>

</form:form>
</body>
</html>