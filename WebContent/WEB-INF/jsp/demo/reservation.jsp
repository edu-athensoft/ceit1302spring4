<%@ page language="java" contentType="text/html; charset=utf-8"     pageEncoding="utf-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="/ceit1302spring4/js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<div id="header">
		<h2>Reservation</h2>
		<jsp:include page="../inc/menu-inc.jsp"></jsp:include>
		<hr />
	</div>
	<div id="main">
		<a href="javascript:void(0);" onclick="getData();">Reservation</a>
		<div id="resdata"></div>
	</div>
	<div id="footer"></div>
	

<script>
function getData(){
	
	//alert("ok");
	$.ajax({
		type: 		"get",
		dataType: 	"json",
		url: 		"/ceit1302spring4/demo/resdata",
		// data: {  
		//   hotelSeq: hotelSeq,  
		//  orderNo: orderNo,  
		//   sortFiled: sortFiled,  
		//   checkDate: checkDate  
		//},  
		success: function (msg) {
			var firstName = msg.firstName;
			var lastName = msg.lastName;
			var str = firstName + " " + lastName;
				resdata.innerHTML = str;
		    },
		    error: function () {
		       alert("error");
		      }
		   });
	}
</script>	
	
</body>
</html>