<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Persons and Licenses</title>
</head>
<body>
<h1>Persons and Licenses</h1>
<hr>
<a href="/persons/new">Create Person</a> | <a href="/license/create">Create License</a>
<hr>
<table>
	<tr>
		<th>id</th>
		<th>first name</th>
		<th>last name</th>
	</tr>
	<tbody>
		<c:forEach items="${persons}" var="person">
			<tr>
				<td>${person.id}</td>
				<td>${person.firstName}</td>
				<td>${person.lastName}</td>				
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>