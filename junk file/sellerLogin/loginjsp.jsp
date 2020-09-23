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
        <title>JSP Page</title>
    </head>
    <body>
        <form action="loginServlet" method="POST">
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
        </form>
    </body>
</html>
