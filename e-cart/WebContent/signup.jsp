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
	<c:if test="${errmsg!=null}">
		<div class="alert alert-warning" role="alert">
			<c:out value="${errmsg}" />

		</div>
	</c:if>

	<div class="container mt-5">
		<form action="/e-cart/userSignup" method="post">
			<div id="row" class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">First Name</label> <input type="text"
						class="form-control" id="inputEmail4" placeholder="firstName"
						name="fname">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Last Name</label> <input type="text"
						class="form-control" id="inputPassword4" placeholder="lastName"
						name="lname">
				</div>

			</div>
			<div id="row" class="form-row">
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

			</div>

			<button type="submit" class="btn btn-primary">Signup</button>

		</form>
	</div>

</body>
</html>