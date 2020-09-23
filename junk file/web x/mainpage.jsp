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
             .quantity-field {
                background-color: #ccc;
                border: 1px solid #aaa;
                border-radius: 4px;
                font-size: 0.625rem;
                padding: 2px;
                width: 3.75rem;
            }

        </style>
        
    </head>
    <body>
        
        <div class="nav">
            <b>Site</b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="text" ><input type="submit" value="search">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp | &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
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
                           String qry = "select * from sellertbl";
                           resultSet = statement.executeQuery(qry);
                           while(resultSet.next()){ 
                    %>
                  
                    <td colspan="100">
                        <form action="cartServlet1" method="post">
                            <img src="<%=resultSet.getString(4)%> " width="100" height="150"><br>
                            <b><%=resultSet.getString(5)%></b><br>
                            <b>$ <%=resultSet.getString(6)%></b><br>
                            
                          <b>Quantity:  <input type="number" name="qty" min="1" max=""  size="2" class="quantity-field">
                          
                            </b><br><br>
                            <input type="hidden" name="image" value="<%=resultSet.getString(4)%>">
                            <input type="hidden" name="name" value="<%=resultSet.getString(5)%>">
                            <input type="hidden" name="price" value="<%=resultSet.getString(6)%>">
                            <input type="submit" value="Add to cart">
                        </form>
                    </td>       
                       
                    
                  
          
        </div>                    
                    
                    
                    
                    <%
                      }
                       
                      } catch (Exception e) {}
                        
                       
                    %>
    </body> 
</html>
