<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thi thử B2</title>
<link
	href="<c:url value='template/client/vendor/bootstrap/css/bootstrap.min.css' />"
	type="text/css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Custom styles for this template -->
<link href="<c:url value='template/client/css/blog-home.css' />"
	type="text/css" rel="stylesheet">

</head>
<body id="">

<%@ include file="/WEB-INF/views/client/header.jsp" %>

	<dec:body />
	
<%@ include file="/WEB-INF/views/client/footer.jsp" %>

	<script
		src="<c:url value='/template/client/vendor/jquery/jquery.min.js'/> "></script>
	<script
		src="<c:url value='template/client/vendor/bootstrap/js/bootstrap.bundle.min.js'/> "></script>
	<script src="<c:url value='template/client/js/jquery-2.1.1.min.js'/> "></script>
	<script src="<c:url value='template/client/js/main.js'/> "></script>
</body>
</html>