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
    </head>
    <body >
        ${message}
        <form method="post" action="ValidatingServlet">
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
        </form>
       
    </body>
</html>
