<%-- 
    Document   : sellerjsp
    Created on : 10-Aug-2020, 10:04:57
    Author     : Rishxn
--%>


<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.lang.String"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
         <title>Admin Panel css html</title>

    <script type="text/javascript">
        $(document).ready(function(){
  $("a.mobile").click(function(){
    $(".sidebar").slideToggle('fast');
  });
  window.resize = function(event){
    if($(window).width() > 320){
      $(".sidebar").show();
    }
  };
});
    </script>

   <style type="text/css">
       
       * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

html,body {
  font-family: 'Open Sans';
  height: 100%;
}

a {
  text-decoration: none;
}

div#header {
  width: 100%;
  height: 8%;
  background-color: #2c3e50; 
  margin: 0 auto;
}

.logo{
  float: left;
  margin-top: .2ex; 
  margin-left: 10px;
}

.logo a {
  font-size: 1.6em;
  color: #fff;
}

.logo a span {
  font-weight: 300;
}

div#container {
  height: 92%;
  width: 100%;
  margin: 0 auto;
}


.sidebar {
  width: 250px;
  height: 80px;
  background:#171717;
  float: left; 
}

ul#nav{

}

ul#nav li {
    list-style: none;
  height:10px;
    /*background-image: url("../images/success.png");*/
    
}
ul#nav li span{
  position:relative;
}
ul#nav li span img {
    float: left;
  display: block;
  margin-left: 1px;
  margin-top: 2px;
}
ul#nav li a {
    color: #ccc;
    display: block;
    padding: 10px;
    font-size: 0.8em;
    width: 85%;
    float: right;
    border-bottom: 1px solid #444;
    -webkit-transition: all 0.2s ease;  
    -moz-transition: all 0.2s ease;
    -ms-transition: all 0.2s ease;
    -o-transition: all 0.2s ease;
    transition: all 0.2s ease;
}

ul#nav li a:hover {
  background: #030303;
  color: #fff;
}

ul#nav li a.selected{
  background: #030303;
  color:#fff;
}


.content {
  width: auto;
  height: 100%;
  background: #95a5a6;
  margin-left: 250px;
  padding: 15px;
}

.content p {
  color: #424242;
  fonnt-size: 0.8em;
}

div#box {
  margin-top: 15px;
}

div#box .box-top {
  color: #fff;
  text-shadow: 0 1px #000;
  background: #2980b9;
  padding: 5px;
  padding-left: 15px;
  font-weight: 300;
} 

div#box .box-panel {
  padding: 15px;
  background: #fff;
  color: #333;
}



@media only screen and (max-width: 480px) {

  a.mobile {
    display: block;
    color: #fff;
    background: #000;
    text-align: center;
    padding: 7px; 
    cursor: pointer;
  }

  a.mobile:active{
    background: #474747;
  }


  .sidebar {
    width: 100%;
    display: none;
    height: auto;
  }

  .content {
    margin-left: 0;
  }


}



@media only screen and (min-width: 480px) {
  .sidebar {
    height: 92%;
    left: 0;
    display: block;
    position: absolute;
  }
  a.mobile {
    display: none;
  }
}
   </style>
        
    </head>
    <body>
          
        
        <div id="header">
        <div class="logo">
            <h1>Account</h1>
        </div>

    </div>


    <a class="mobile">MENU</a>


    <div id="container">

        <div class="sidebar">
            <ul id="nav">
                <li>
                    <span>
          
        </span>
                    <a class="selected" href="sellitem.jsp">sell items</a>
                </li>
               
               
                </li>
                <li>
                    <span>
          
        </span><a href="mainpage.jsp">Back to Home</a>
                </li>
            </ul>

        </div>

                  
                    
        <div class="content">
            <h2>Hi  <%=request.getAttribute("uname") %>  &nbsp&nbsp&nbsp&nbsp<img src="admin.jpg" width="32" height="32" ></h2>
            <p>Online Store</p><br>

            <div id="box">
                <div class="box-top">Selling Items</div>
                <div class="box-panel">
                	
                	
                
                <table>
                    <%
                        String uname = (String)request.getAttribute("uname");
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet resultSet = null;
                      
                        try{
                           Class.forName("com.mysql.jdbc.Driver");
                           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
                           statement = connection.createStatement();
                           String qry = "select * from seller where uname='"+uname+"'";
                           resultSet = statement.executeQuery(qry);
                           while(resultSet.next()){ 
                    %>
                  
                    <tr border="1">
                        <td>
                            <img src="<%=resultSet.getString(4)%> " width="100" height="150">
                        </td>
                        <td>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                        <td>
                            <b> Item :-<%=resultSet.getString(5)%> </b><br> 
                            <b> Price :- $ <%= resultSet.getString(6) %> </b>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                    </tr>
                    <%
                      }
                       
                      } catch (Exception e) {}
                        
                       
                    %>
                </table>
                
                        
                                 
                
                    
                </div>
            </div>

            


        </div>


    </div>
        
    </body>
</html>
