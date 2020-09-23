<%-- 
    Document   : loginform
    Created on : Aug 16, 2020, 10:39:10 PM
    Author     : MANULA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stylesheet.css">
        <link href='//fonts.googleapis.com/css?family=Roboto:700,400&subset=latin' rel='stylesheet' type='text/css'>
        <title>JSP Page</title>
    </head>
    <body>
        
        <div id="header">
            <div class="logo">
                &nbsp &nbsp &nbsp<img src="Logo.png.png" width="80" height="80">
            </div>  
           
        </div>
        
        <div class="login-page">
            <div class="form">
                <form class="login-form" method="post" action="LoginValidateServlet">
                    <input type="text" placeholder="Username" name="name" id="name"/>
                    <input type="password" placeholder="Password" name="password" id="password"/>
                    <button name="submit" id="submit" type="submit">login</button>
                    <p class="message">Not registered? <a href="signupform.jsp">Create an account</a></p>
                </form>
            </div>
        </div>
        
<!--        <form method="post" action="LoginValidateServlet">
            <table>
                <tr>
                    <td>username</td>
                    <td><input type="text" name="name" id="name"></td>
                </tr>
                <tr>
                    <td>password</td>
                     <td><input type="password" name="password" id="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit" name="submit" id="submit"></td>
                     <td><input type="reset" value="reset" name="reset" id="reset"></td>
                </tr>
            </table>
        </form>-->
    
        <div class="footer">
            Made for <a class="footer-text" href="https://github.com/Szask1a/coursework-DEA">DEA PROJECT 2020</a>
        </div>
        
        <script src="stylescript.js"></script>
    </body>
</html>
