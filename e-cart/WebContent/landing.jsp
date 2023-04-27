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

	<div class="container">
		<div class="card-header m-3">All Products</div>

		<div class="row">

			<div class="row">

				<c:forEach var="product" items="${productList}">

					<div class="col-md-3 my-3">

						<div class="card w-100">
							<img class="card-img-top"
								src="product-image/${product.getImage()}" alt="Card image cap">
							<div class="card-body">
								<h5 class="card-title">${product.getName()}</h5>
								<h6 class="price">Price: $ ${product.getPrice()}</h6>
								<h6 class="category">Category: ${product.getCategory()}</h6>
								<div class="mt-3 d-flex justify-content-between">
									<a class="btn btn-dark"
										href="add-to-cart?id=${product.getId()}">Add to Cart</a> <a
										class="btn btn-primary"
										href="order-now?quantity=1&id=${product.getId()}">Buy Now</a>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
</body>
</html>