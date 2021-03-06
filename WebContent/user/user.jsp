<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp</title>

<style>
	#userList tr {cursor: pointer;}
</style>

<%@ include file="/commonJsp/jquery.jsp" %>
<%@ include file="/commonJsp/bootstrap.jsp" %>

<link href="/css/dashboard.css" rel="stylesheet">
<link href="/css/blog.css" rel="stylesheet">

<script>
$(document).ready(function(){

	//사용자 클릭시 상세 조회 화면 이동
	$("#userList").on("click", "tr", function(){
		
		/*"data-productId"  translates to "productid"
		"data-product-id" translates to "productId"
		"data-PRODUCT-ID" translates to "productId"
		"data-ProDUctId"  translates to "productid"*/
		//html 속성 규칙(소문자)에 의해 대문자로 작성한 data 속성도 소문자로 변경됨. 주의
		var userId = $(this).data("userid");
		
		$(location).attr("href", "<%=request.getContextPath()%>/user/getUser?userId=" + userId);
	});
});
</script>
</head>

<body>
	<jsp:include page="/commonJsp/header.jsp" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<jsp:include page="/commonJsp/leftMenu.jsp" />
			</div>
			
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<jsp:include page="/user/userContent.jsp" />
			</div>
		</div>			
	</div>	
</body>
</html>
