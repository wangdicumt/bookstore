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

	<div id="header">
			<div class="headerNav">
				 <a class="logo" href="">标志</a> 
				<ul class="nav">
					<li style="color:#ddd">当前在线${sessionScope.num }人</li>
					<li style="color:#ddd">欢迎${sessionScope.name}登录</li>
					<li><a href="${pageContext.request.contextPath }/favoriteList">收藏夹</a></li>
					<li><a href="${pageContext.request.contextPath }/showOrder">购物车</a></li>
					<li><a href="loginForm">退出</a></li>
				</ul>
			</div>
	</div>
	<h1 >欢迎进入商品购买页面</h1>
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
				  <td>操作</td>
				  <td></td>
				</tr>
				<c:forEach items="${requestScope.book}" var="good" varStatus="status">
					<tr id="data_${stat.index}" align="center" class="main_trbg" onMouseOver="move(this);" onMouseOut="out(this);">
						<td>
							<img src="./images/${good.image}" width=100 height=60/>
						</td>
						<td>${good.name}</td>
						<td>${good.price}</td>
						<td>${good.count}</td>
						<td>${good.factory}</td>
						<td><a href="${pageContext.request.contextPath }/orderlist/${good.id}">加入购物车</a></td>
						<td><a href="${pageContext.request.contextPath }/favorite/${good.id}">添加到收藏夹</a></td>
					</tr>
				</c:forEach>
			  </table>
			</td>
		  </tr>
		</table>
</body>
</html>