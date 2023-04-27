<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="includes/head.jsp"%>

<style>
#row {
	baground-color: green;
}
</style>

</head>
<body>
	<%@include file="includes/navbar.jsp"%>

	<div class="alert alert-warning" role="alert">Already The Product In Cart</div>
	<a href="allproducts" class="link-success">GoToProducts</a>

</body>
</html>