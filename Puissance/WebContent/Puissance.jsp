<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="web.Puissance" %>
    <% Puissance p=(Puissance)request.getAttribute("x");  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Puissance</title>
</head>
<body>
	<div>
	<form action="controle" method="post">
	<table>
	<tr><td>a:</td><td> <input type="text" name="a" value="<%=p.getA()%>"></td></tr>
	<tr><td>b:</td><td> <input type="text" name="b" value="<%=p.getB()%>"></td></tr>
	<tr><td><input type="submit" value="calculer"></td></tr>
	</table>
	</form>
	</div>
	<div>
	<table>
	<tr><td> la puissance: </td><td><%=p.getP() %></td></tr>
	</table>
	</div>
</body>
</html>