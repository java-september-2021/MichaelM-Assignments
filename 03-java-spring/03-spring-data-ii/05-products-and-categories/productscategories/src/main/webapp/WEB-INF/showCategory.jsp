<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Details</title>
</head>
<body>
<h1><c:out value="${category.name}"/></h1>
<hr>
<h2>Products</h2>
<ul>
	<c:forEach items="${category.products}" var="products">
		<li>${products.name} | ${products.description} | ${products.price}</li>
	</c:forEach>
</ul>

<form method="POST" action="/addProductToCategory/${category.id}">
	<select name="prod">
		<c:forEach items="${notInCat}" var="prod">
		<option value="${prod.id}">${prod.name}</option>
		</c:forEach>		
	</select>
	<button>Add Product</button>
</form>
</body>
</html>