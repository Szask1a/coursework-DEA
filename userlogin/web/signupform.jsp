<%-- 
    Document   : loginform
    Created on : Aug 7, 2020, 8:15:03 AM
    Author     : MANULA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="stylesheet.css">
        <link href='//fonts.googleapis.com/css?family=Roboto:700,400&subset=latin' rel='stylesheet' type='text/css'>
    </head>
    <body >

        <div id="header">
            <div class="logo">
                <a href="#">E-Shop</a>
            </div>  
            <nav>
                <form class="search" method="get" action="search.jsp"> 
                    <input name="id" placeholder="Search..." type="search">
                </form>
                <ul>
                    <li>
                        <a href="">Home</a>
                    </li>
                    <li>
                        <a href="">Shop</a>    
                    </li>
                    <li class="dropdown">
                        <a href="">Contact Us</a>      
                    </li>
                    <li>
                        <a href="">Shopping Cart</a>
                    </li>
                    <li>
                        <a href="">My Profile</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        ${message}
        
        <div class="login-page" method="post" action="ValidatingServlet">
            <div class="form">
                <form class="login-form">
                    <input type="text" placeholder="Name" value='${usernameset}' id="username" name="username"/>
                    <input type="password" placeholder="Password" name="password"/>
                    <input type="password" placeholder="Re-type password" name="repassword"/>
                    <input type="text" placeholder="Email address" value='${emailset}' name="email"/>
                    <button type="submit" name="register">Create</button>
                    <p class="message">Already registered? <a href="loginform.jsp">Sign In</a></p>
                </form>
            </div>
        </div>
    
        <div class="footer">
            Made for <a class="footer-text" href="https://github.com/Szask1a/coursework-DEA">DEA PROJECT 2020</a>
        </div>
        
        <script src="stylescript.js"></script>
        
<!--        <form method="post" action="ValidatingServlet">
            <table>
                <tr>
                    <td>UserName:</td>
                    <td><input type="text" value='${usernameset}' id="username" name="username"  ></td>
                </tr>
                 <tr>
                    <td>E-mail:</td>
                    <td><input type="text" value='${emailset}' name="email"></td>
                </tr>
                 <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                 <tr>
                    <td>Re-type Password</td>
                    <td><input type="password"  name="repassword"></td>
                </tr>
                
            </table>
            <input type="reset" value="reset" name="reset">
            <input type="submit" value="register" name="register">
        </form>-->
       
    </body>
</html>
