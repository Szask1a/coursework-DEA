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
        <link rel="stylesheet" href="stylesheet.css">
        <link href='//fonts.googleapis.com/css?family=Roboto:700,400&subset=latin' rel='stylesheet' type='text/css'>
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
                        <a >Contact Us</a>     
                    </li>
                    <li>
                        <a href="castNew.jsp">Shopping Cart</a>
                    </li>
                    <li>
                        <a href="index.html">Logout</a>
                    </li>
                </ul>
            </nav>
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
                            <img src="<%=resultSet.getString(4)%> " width="100" height="150">
                            <b><%=resultSet.getString(5)%></b><br>
                            <b>$ <%=resultSet.getString(6)%></b><br>
                            <b>Quantity:<input type="text" name="qty" size="2"></b><br><br>
                            <input type="hidden" name="image" value="<%=resultSet.getString(4)%>">
                            <input type="hidden" name="name" value="<%=resultSet.getString(5)%>">
                            <input type="hidden" name="price" value="<%=resultSet.getString(6)%>">
                            <input type="submit" value="Add to cart"><br><br>
                        </form>
                    </span>&nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp         
                        
                    
                    <%
                      }
                       
                      } catch (Exception e) {}
                        
                       
                    %>
               <div class="footer">
            Made for <a class="footer-text" href="https://github.com/Szask1a/coursework-DEA">DEA PROJECT 2020</a>
        </div>
        
        <script src="stylescript.js"></script>
    </body> 
</html>
