<%-- 
    Document   : mainpage
    Created on : 08-Aug-2020, 20:24:55
    Author     : Rishxn
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .nav {
                background-color: #FAFAD2;
            }  
            span.b {
            display: inline-block;
            width: 100px;
            height: 100px;
            padding: 5px;
            margin-left: 50px;   
             
            }
            
        </style>
        
    </head>
    <body>
        
        <div class="nav">
            <b>Site</b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input typre="text" ><input type="submit" value="search">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp | &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <a><b>SignUp</b></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp | &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <a><b>Shopping Cart</b></a>
            
        </div>
        <h4>All Items</h4>
        
        <table>
            <%
                        
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet resultSet = null;
                        
                        try{
                           Class.forName("com.mysql.jdbc.Driver");
                           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
                           statement = connection.createStatement();
                           String qry = "select * from seller";
                           resultSet = statement.executeQuery(qry);
                           while(resultSet.next()){ 
                    %>
                  
                    <span class="b">
                        <form action="cartServlet" method="post">
                            <img src="<%=resultSet.getString(4)%> " width="150" height="150">
                            <b><%=resultSet.getString(5)%></b><br>
                            <b>$ <%=resultSet.getString(6)%></b><br>
                            <b>Quantity:<input type="text" name="qty" size="2"></b><br><br>
                            <input type="hidden" name="image" value="<%=resultSet.getString(4)%>">
                            <input type="hidden" name="name" value="<%=resultSet.getString(5)%>">
                            <input type="hidden" name="price" value="<%=resultSet.getString(6)%>">
                            <input type="submit" value="Add to cart">
                        </form>
                    </span>&nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp       
                        
                    
                    <%
                      }
                       
                      } catch (Exception e) {}
                        
                       
                    %>
    </body> 
</html>
