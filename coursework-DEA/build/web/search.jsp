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
<link rel="stylesheet" href="stylesheet.css">
<body>
    <div id="header">
            <div class="logo">
                &nbsp &nbsp &nbsp<img src="Logo.png.png" width="80" height="80">
            </div>  
            <nav>
                <form class="search" method="get" action="search.jsp"> 
                    <input name="id" placeholder="Search..." type="search">
                </form>
                <ul>
                   
                    <li>
                        <a href="mainpage.jsp">Shop</a>    
                    </li>
                    <li class="dropdown">
                        <a href="">Contact Us</a>     
                    </li>
                    <li>
                        <a href="castNew.jjsp">Shopping Cart</a>
                    </li>
                    <li>
                        <a href="">Logout</a>
                    </li>
                </ul>
            </nav>
        </div>
<h1>Search Results</h1>
<table border="0" class="table">
<!--<tr>
<td>Id</td>
<td>Image</td>
<td>Name</td>
<td>Price</td>
</tr>-->
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
<td><img src="<%=resultSet.getString("image") %>" width="100" height="100"></td>
<!--<td><img src="data:image/jpg;base64,${book.base64Image}" width="240" height="300"/></td>-->
<td><%=resultSet.getString("name") %></td>
<td>LKR &nbsp<%=resultSet.getDouble("price") %></td>
<td>
    <form action="mainpage.jsp">
        <button type="submit" class="button">View</button>
    </form>
</td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>


<div class="footer">
    Made for <a class="footer-text" href="https://github.com/Szask1a/coursework-DEA">DEA PROJECT 2020</a>
</div>
<script src="stylescript.js"></script>
</body>
</html>