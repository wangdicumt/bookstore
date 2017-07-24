<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>商品展示</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>


<body style="background-color:#e5f0ff;">
	<h1 >欢迎进入商品购买页面</h1>
	<form action="${pageContext.request.contextPath }/addShopCar" method="post">
		<input type="hidden" value="${requestScope.book.id }" name="id">
		<input type="hidden" value="${requestScope.book.name }" name="name">
		<input type="hidden" value="${requestScope.book.price }" name="price">
		 <table width="100%" border="1" cellpadding="5" cellspacing="0" style="border:#c2c6cc 1px solid; border-collapse:collapse;">
			    <tr class="main_trbg_tit" align="center">
				  <td>商品名称</td>
				  <td>商品价格</td>
				  <td>商品产地</td>
				  <td>购买数量</td>
				  <td>购买</td>
				</tr>
					<tr id="data_${stat.index}" align="center" class="main_trbg" onMouseOver="move(this);" onMouseOut="out(this);">
						<td>${requestScope.book.name}</td>
						<td>${requestScope.book.price}</td>
						<td>${requestScope.book.factory}</td>
						<td><input type="text" value="${requestScope.book.count}" name="count"></td>
						<td><input type="submit" value="加入购物车"></td>
					</tr>
			  </table>
	</form>
</body>
</html>