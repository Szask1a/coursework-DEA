<%-- 
    Document   : loginform
    Created on : 22-Sep-2020, 11:08:23
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
        <form method="post" action="LoginValidateServlet">
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
        </form>
    </body>
</html>