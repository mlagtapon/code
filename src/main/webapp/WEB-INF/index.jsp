<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Code</title>
</head>
<body>
	<c:if test="${name != 'code' && name != null}">
		<h3><c:out value="${wrong}"/></h3>
	</c:if>

	<c:if test="${name == 'code' && name != null}">
		<h3><a href="/code">Correct</a></h3>
	</c:if>
	
	<h1>What is the code?</h1>
	
	<form method="POST" action="/submit">
	<input type="text" name="name" />
	<br>
	<button>Try Code</button>
	</form>
	
	<h3>Your guess: <c:out value="${name}"/></h3>
	<h3><a href="/clearsession">Clear</a></h3>
</body>
</html>