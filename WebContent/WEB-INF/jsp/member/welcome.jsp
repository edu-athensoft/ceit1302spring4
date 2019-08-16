<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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