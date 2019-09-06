<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show reservation</title>
<script src="/ceit1302spring4/js/jquery-3.4.1.js"></script>
</head>
<body>
	<div id="header">
		<h2>Welcome</h2>
		<jsp:include page="../inc/menu-inc.jsp"></jsp:include>
		<hr />
	</div>
	<div id="main">
		<a href="javascript:void(0);" onclick="getData();">see reservation
			result</a>
		<div id="resdata"></div>
	</div>
	<div id="footer"></div>
	


	<script>
		function getData() {
			//alert("ok");

			$.ajax({
				type : "get",
				dataType : "json",
				url : "/ceit1302spring4/demo/resdata",
				success : function(msg) {
					var firstName = msg.firstName;
					var lastName = msg.lastName;
					var str = firstName + " " + lastName;
					resdata.innerHTML = str;
				},
				error : function() {
					alert("error");
				}
			});

		}
	</script>
</body>
</html>