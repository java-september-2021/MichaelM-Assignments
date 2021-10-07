<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Product</title>
</head>
<body>
<form method= "POST" action="/newProduct">
<p>
<label for="name">Name</label>
<input type="text" name="product">
</p>
<p>
<label for="description">Description</label>
<textarea name="description"></textarea>
</p>
<p>
<label for="price">Price</label>
<input type="number" name="price" step="0.01">
</p>
<button>Create Product</button>
</form>

</body>
</html>