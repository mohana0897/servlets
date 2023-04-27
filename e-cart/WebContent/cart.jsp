<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="/includes/head.jsp"%>
<title>E-Commerce Cart</title>
<style type="text/css">
.table tbody td {
	vertical-align: middle;
}

.btn-incre, .btn-decre {
	box-shadow: none;
	font-size: 25px;
}
</style>
</head>
<body>
	<%@include file="/includes/navbar.jsp"%>

	<div class="container my-3">
		<div class="d-flex py-5">
			<h3>
				Total Price: $ <span>${toatlPrice}</span>
			</h3>
			<a class="mx-3 btn btn-primary" href="cart-check-out">Check Out</a>
		</div>
		<table class="table table-light">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Category</th>
					<th scope="col">Price</th>
					<th scope="col">Buy Now</th>
					<th scope="col">Cancel</th>
				</tr>
			</thead>
			<tbody>


				<c:forEach var="product" items="${old_list}">

					<tr>
						<td>${product.getName()}</td>
						<td>${product.getCategory()}</td>
						<td>${product.getPrice()}</td>
						<td>${product.getQuantity()}</td>

						<td>
							<form action="order-now" method="post" class="form-inline">
								<input type="hidden" name="id" value="${product.getId()}"
									class="form-input">
								<div class="form-group d-flex justify-content-between">
									<a class="btn bnt-sm btn-incre"
										href="quantity-inc-dec?action=inc&id=${product.getId()}"><i
										class="fas fa-plus-square"></i></a> <input type="text"
										name="quantity" class="form-control"
										value="${product.getQuantity()}" readonly> <a
										class="btn btn-sm btn-decre"
										href="quantity-inc-dec?action=dec&id=${product.getId()}"><i
										class="fas fa-minus-square"></i></a>
								</div>
								<button type="submit" class="btn btn-primary btn-sm">Buy</button>
							</form>
						</td>





						<td><a href="remove-from-cart?id=${product.getId()}"
							class="btn btn-sm btn-danger">Remove</a></td>
					</tr>
				</c:forEach>


			</tbody>
		</table>
	</div>

	<%@include file="/includes/footer.jsp"%>
</body>
</html>