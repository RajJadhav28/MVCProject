<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<%

String errmsg=(String)request.getAttribute("errmsg");

%>
<h3><%=errmsg %></h3>
<form action="LoginServ" method="post">

<table class="table table-success">
<tr>
<th>emailId:</th>
<td><input type="text" name="emailId" class="form-control"></td>
</tr>

<tr>
<th>password:</th>
<td><input type="password" name="password" class="form-control"></td>
</tr>
<tr>
<td><input type="submit" value="Login" class="btn btn-success"></td>
<td><input type="reset" value="Clear" class="btn btn-warning"></td>
</tr>
</table>
</form>
</body>
</html>