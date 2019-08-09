<%@ page language="java" contentType="text/html; charset=utf-8"%>

<%@ page pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Site| log in</title>
</head>
<body>
<div id="header">
		<h2>Login Page</h2>
		<jsp:include page="inc/menu-inc.jsp"></jsp:include>
		<hr/>
	</div>
	<div id="main">please input your information<br/><br/></div>
	<div id="footer"></div>
	<form action="<%= request.getContextPath() %>/welcome"
		method="post" name="loginForm">
		user name: <input type="text" name="name" /> <br/><br/>
		password: <input type="password" name="password" /> <br/>
		<br/>
		<br/>
		<input type="submit" value="submit" /> 
		<input type="reset" value="reset" />
	</form>
</body>
</html>