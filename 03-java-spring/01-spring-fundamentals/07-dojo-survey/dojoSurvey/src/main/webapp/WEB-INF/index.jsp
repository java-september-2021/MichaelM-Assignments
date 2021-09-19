<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<h1>Dojo Survey</h1>
<form method="post" action="/survey">
	<p>
	<label>Name</label>
	<input type="text" name="name">
	</p>
	<p>
	<label>Location</label>
	<select name="location">
		<option value="San Jose">San Jose</option>
		<option value="Seattle">Seattle</option>
		<option value="Oakland">Oakland</option>
		<option value="Online">Online</option>
	</select></p>
	<p>
	<label>Coding Language</label>
	<select name="language">
		<option value="Python">Python</option>
		<option value="JavaScript">JavaScript</option>
		<option value="Ruby">Ruby</option>
		<option value="Java">Java</option>
	</select></p>
	<p>
	<label>Comments (Optional)</label>
	<textarea name="comment" rows="3" cols="5"></textarea>	
	</p>
	<button>Submit</button>
</form>

</body>
</html>