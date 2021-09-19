<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<p>Name: <c:out value="${name}"/></p>
<p>Location: <c:out value="${location}"/></p>
<p>Language: <c:out value="${language}"/></p>
<p>Comment: <c:out value="${comment}"/></p>
</body>
</html>