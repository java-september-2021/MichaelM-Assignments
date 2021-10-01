<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New License</title>
</head>
<body>
<h1>Create New License</h1>
<hr>
<form:form method="POST" action="/newlicense" modelAttribute="license">
	<p>
		<form:label path="person">Select Person</form:label>
		<form:errors path="person"/>
		<form:select path="person">
		<c:forEach items="${people}" var="people">
		<option value="${people.id}">${people.firstName} ${people.lastName}</option> 	
		</c:forEach>
		</form:select>	
	</p>
	<p>
		<form:label path="experationDate">Expiration Date</form:label>
		<form:errors path="experationDate"/>
		<form:input type="date" path="experationDate"/>
	</p>
	<p>
		<form:label path="state">State</form:label>
		<form:errors path="state"/>
		<form:input path="state"/>
	</p>
	<button>Add License</button>
</form:form>
</body>
</html>