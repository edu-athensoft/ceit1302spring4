<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:set var="webapp_name" value="/ceit1302spring4/"/>



<!doctype html>
<html>
<head>
<style>
	ul {
		list-style-type: none;
	}
	li {
	  display: inline;
	}
</style>
</head>

<body>
<div id="main-menu">
	<ul id="menu">
		<li><a href="${webapp_name}index"> HOME</a>  &nbsp;&nbsp;|&nbsp;&nbsp;</li>
		<li><a href="${webapp_name}about">ABOUT</a>  &nbsp;&nbsp;|&nbsp;&nbsp;</li>
		<li><a href="${webapp_name}contact">CONTACT US</a> </li>
	</ul>
</div>
</body>
</html>