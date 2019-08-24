<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<h2>Confirm</h2>
		<jsp:include page="../inc/menu-inc.jsp"></jsp:include>
		<hr />
	</div>
	<div id="main">
		<p>Your reservation is confirmed successfully. Please, re-check the details.</p>  
First Name : ${reservation.firstName} <br>  
Last Name : ${reservation.lastName}  
	</div>
	<div id="footer"></div>
</body>
</html>