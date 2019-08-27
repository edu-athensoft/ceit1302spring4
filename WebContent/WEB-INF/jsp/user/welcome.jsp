<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
<div id="header">
		<h2>Welcome</h2>
		<jsp:include page="../inc/menu-inc.jsp"></jsp:include>
		<hr/>
	</div>
	<div id="main">here is your profile.<br/><br/></div>
	
	userName:${userName};<br/>
	userPassword:${userPassword};<br/>
	
	<div id="footer"></div>
	
<br/><br/>
<a href="logout">logout</a>


</body>
</html>