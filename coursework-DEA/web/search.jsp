<%-- 
    Document   : shoppingCart
    Created on : Sep 19, 2020, 10:34:41 AM
    Author     : ASUS
--%>

<%@page import="com.mysql.jdbc.Blob"%>
<%@page import="com.beans.ProductImage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id=request.getParameter("id");
Connection connection = null;
ResultSet resultSet = null;
%>

<html>
<head>
<title>searching a Table</title>
</head>
<body>
<h1>Search Data</h1>
<table border="1">
<tr>
<td>Id</td>
<td>Image</td>
<td>Name</td>
<td>Price</td>
</tr>
<%   
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
Statement statement = connection.createStatement();
String sql ="select * from seller where keyword='"+id+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getInt("id") %></td>
<td><%=resultSet.getString("image") %></td>
<!--<td><img src="data:image/jpg;base64,${book.base64Image}" width="240" height="300"/></td>-->
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getDouble("price") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>