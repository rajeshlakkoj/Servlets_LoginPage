<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yahoo!!!!!!</title>
</head>
<%-- <%
//Any java code can go into this scriplet--But shdnot use in any 
//real world application as it is a very bad practice
%>

<body>
<%
Date date = new Date(); 
%>
<div>
 Current Date is <%=date%>
</div> --%>

<!-- JSP File by ${names} and password is ${password} -->
 <form action = "/loginApplication/login.do" method = "POST">
 <p><font color = "red"> ${ErroMessage}</font></p>
 Enter your name: 
 <input type ="text" name = "name"/>
 Enter your Password:
 <input type ="password" name = "password"/>
 Please Submit Enter:
 <input type = "submit" value = "submit"/>
 </form>
</body>
</html>