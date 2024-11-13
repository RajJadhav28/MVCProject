<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String msg=(String)request.getAttribute("msg");


%>
<h3><%=msg %></h3>

<h3>I am on index page</h3>
<a href="Register.jsp">Register here</a><br>
<a href="Login.jsp">Login here</a>

</body>
</html>