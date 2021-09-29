<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
<h1>Welcome to Languages</h1>
<hr>
<table>
	<thead>
	<tr>
		<td>Name</td>
		<td>Creator</td>
		<td>Version</td>
		<td>Action</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${allLanguages}" var="lang"/>
	<tr>
	<td><a href="/show/${lang.name}"></a></td>
	<td>${lang.creator}</td>
	<td>${lang.currentVersion}</td>
	<td><a href="/edit/${lang.id}">Edit</a> | <a href="/delete/${lang.id}">Delete</a></td>
	</tr>
	</tbody>
</table>

<h3>Make new Language here</h3>

<form:form action="/" method="POST" modelAttribute="Language">
	<p>
		<form:label path="name">Name:</form:label>
		<form:errors path="name"></form:errors>
		<form:input path="name"></form:input>
	</p>
	<p>
		<form:label path="creator">Creator:</form:label>
		<form:errors path="creator"></form:errors>
		<form:input path="creator"></form:input>
	</p>
	<p>
		<form:label path="currentVersion">Current Version:</form:label>
		<form:errors path="currentVersion"></form:errors>
		<form:input path="currentVersion"></form:input>
	</p>
	<button>Submit</button>
</form:form>


</body>
</html>