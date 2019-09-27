
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin | Member</title>
</head>
<body>
<div id="header">
		<h2>Welcome Admin for Member Management</h2>
		<jsp:include page="../inc/menu-inc.jsp"></jsp:include>
		<hr/>
	</div>
	<div id="main">here is the member list<br/><br/></div>
	
	<c:forEach items="${memberList}" var="member">
		${member.memberId},${member.userName},${member.password}<br/>
	</c:forEach>
	
	
	<div id="footer"></div>
	
<br/><br/>
<a href="logout">logout</a>

</body>
</html>