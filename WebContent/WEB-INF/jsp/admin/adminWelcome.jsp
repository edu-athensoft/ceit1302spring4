<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminWelcome</title>
</head>
<body>
<div id="header">
		<h2>Welcome Admin</h2>
		<jsp:include page="../inc/menu-inc.jsp"></jsp:include>
		<hr/>
	</div>
	<div id="main">here is your profile.<br/><br/></div>
	
	admin:${userName};<br/>
	password:${userPassword};<br/>
	
	
	<div id="footer"></div>
	
<br/><br/>
<a href="logout">logout</a>
</body>
</html>