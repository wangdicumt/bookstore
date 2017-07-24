<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>购物车</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
	<link href="themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>

</head>


<body>

	<div id="header">
			<div class="headerNav">
				 <a class="logo" href="http://j-ui.com">标志</a> 
				<ul class="nav">
					<li style="color:#ddd">当前在线${sessionScope.num }人</li>
					<li style="color:#ddd">欢迎${sessionScope.name}登录</li>
					<li><a href="${pageContext.request.contextPath }/showgood">商品展示页面</a></li>
					<li><a href="${pageContext.request.contextPath }/showOrderForm">查看订单</a></li>
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
				  <td>商品名称</td>
				  <td>购买数量</td>
				  <td>总价</td>
				  <td>修改订单</td>
				  <td>删除订单</td>
				  <td>购买</td>
				</tr>
				<c:forEach items="${requestScope.orderList}" var="good" varStatus="status">
					<form action="addOrderTable" method="post">
						<tr id="data_${stat.index}" align="center" class="main_trbg" onMouseOver="move(this);" onMouseOut="out(this);">
							<td>${good.goodsname}</td>
							<td>${good.count}</td>
							<td>${good.total}</td>
							<input type="hidden" value="${good.id }" name="id">
							<input type="hidden" value="${good.goodsname }" name="goodsname">
							<input type="hidden" value="${good.price }" name="price">
							<input type="hidden" value="${good.count }" name="count">
							<input type="hidden" value="${good.total }" name="total">
							<td><a href="${pageContext.request.contextPath }/goToeditOrder/${good.id}">修改订单</a></td>
							<td><a href="${pageContext.request.contextPath }/deleteOrder/${good.id}">删除订单</a></td>
							
							<td><input type="submit" value="购买"></td>
						</tr>
						</form>
					</c:forEach>
			  </table>
			</td>
		  </tr>
		</table>
	
</body>
</html>