<%-- 
    Document   : loginjsp
    Created on : 20-Aug-2020, 19:14:08
    Author     : Rishxn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="stylesheet.css">
        <link href='//fonts.googleapis.com/css?family=Roboto:700,400&subset=latin' rel='stylesheet' type='text/css'>
    </head>
    <body>
        
        <div id="header">
            <div class="logo">
                <a href="#">E-Shop</a>
            </div>  
            <nav>
<!--                <form class="search" method="get" action="search.jsp"> 
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
                </ul>-->
            </nav>
        </div>
        
        <div class="login-page">
            <div class="form">
                <form class="login-form" action="loginServlet" method="POST">
                    <input type="text" placeholder="Username" name="uname" id="name"/>
                    <input type="password" placeholder="Password" name="pword" id="password"/>
                    <button name="submit" id="submit" type="submit">login</button>
                    <p class="message">Not registered? <a href="sellerjsp.jsp">Create an account</a></p>
                </form>
            </div>
        </div>
        
<!--        <form action="loginServlet" method="POST">
            <table>
                <tr>
                    <td>user name</td>
                    <td><input type="text" name="uname"></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input type="password" name="pword"></td>
                </tr>
            </table>
           
            <input type="submit" value="Login">
        </form>-->

        <div class="footer">
            Made for <a class="footer-text" href="https://github.com/Szask1a/coursework-DEA">DEA PROJECT 2020</a>
        </div>

        <script src="stylescript.js"></script>
    </body>
</html>
