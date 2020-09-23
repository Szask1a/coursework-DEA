<%-- 
    Document   : shoppingCart
    Created on : Sep 19, 2020, 10:34:41 AM
    Author     : ASUS
--%>

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

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
    </head>
    <body>
        <h1>Add Checkout</h1>
        
        <table border="1">
            <tr>
                <td>Product Name</td>
                <td>Image</td>
                <td>Quantity</td>
                <td>Price</td>
            </tr>
            <%
            try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/website", "root", "");
            Statement statement = connection.createStatement();
            String sql ="select * from sellertbl where keyword='"+id+"'";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            %>
            <tr>
                <td><%=resultSet.getInt("id") %></td>
                <td><%=resultSet.getString("image") %></td>
                <td><%=resultSet.getString("name") %></td>
                <td><%=resultSet.getInt("price") %></td>
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
