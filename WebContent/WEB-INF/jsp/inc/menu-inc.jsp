<%@ page language="java" contentType="text/html; charset=utf-8"%>

<%@ page pageEncoding="utf-8"%>

<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:set var="webapp_name"  value="/ceit1302spring4/"/>



<html>
<head>
<style>
body {
	margin: 0;
	padding: 0
}

ul {
	list-style-type: none;
}

li {
	display: inline;
}
</style>
</head>
<div id="main-menu">
			<ul id="menu">
				<li><a href="${webapp_name}index">HOME</a> &nbsp;&nbsp;|&nbsp;&nbsp;</li>
				<li><a href="${webapp_name}about">ABOUT US</a> &nbsp;&nbsp;|&nbsp;&nbsp;</li>
				<li><a href="${webapp_name}contact">CONTACT US</a>&nbsp;&nbsp;|&nbsp;&nbsp;</li>
				<li><a href="${webapp_name}login">LOG IN</a><li>
			</ul>
		</div>
</html>