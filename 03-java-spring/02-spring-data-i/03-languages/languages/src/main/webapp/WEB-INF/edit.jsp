<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Make new Language here</h3>

<form:form action="/edit/${language.id}" method="POST" modelAttribute="Language">
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
	<input type="hidden" name="_method" value="put">
	<button>Edit</button>
</form:form>

</body>
</html>