<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
	<c:if test="${isUserCread==true}">
		<div class="alert alert-success" role="alert">
			<c:out value="${errmsg}" />

		</div>
	</c:if>
	
		<c:if test="${isLoggedIn==true}">
		<div class="alert alert-success" role="alert">
			<h3> Bad Credientials....</h3>

		</div>
	</c:if>

	<div class="container mt-5">
		<form action="/e-cart/login" method="post">

			
				<div class="form-group col-md-6">
					<label for="inputEmail4">Email</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Email"
						name="email">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Password</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Password"
						name="password">
				</div>

		

			<button type="submit" class="btn btn-primary">Login</button>

		</form>
	</div>

</body>
</html>