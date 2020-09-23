package beanpackage;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginController")
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String pword = request.getParameter("pword");
        

// Connect to mysql(mariadb) and verify username password

        try {
            Class.forName("com.mysql.jdbc.Driver");
// loads driver
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); // gets a new connection
            ResultSet rs;
            Statement st=c.createStatement();
            rs=st.executeQuery("select uname,pword from seller" );  
            
           

           

            while (rs.next()) { 
               
               
               if(rs.getString("uname").equals(uname) )
               {
                  
                   request.setAttribute("uname", uname);
                   RequestDispatcher rd=request.getRequestDispatcher("sellerjsp.jsp");
                   rd.forward(request, response);
               }
               
            } 
            
        } catch (ClassNotFoundException | SQLException e) {
            response.sendRedirect("error.jsp");
            return;
        }
    }

}