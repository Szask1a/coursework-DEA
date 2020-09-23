/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MANULA
 */
public class ValidatingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validating</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validating at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PreparedStatement statement = null;
            
            
            
            String username=request.getParameter("username");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            String repassword=request.getParameter("repassword");
            RequestDispatcher dispatcherToLogin=request.getRequestDispatcher("signupform.jsp");
           
            
            
            
            if(username.equals("")){
                request.setAttribute("emailset",email);
                request.setAttribute("message","you must fill the username field");
                dispatcherToLogin.forward(request, response);
            }
            
            else  if(email.equals("")){
                request.setAttribute("usernameset",username);
                request.setAttribute("message","you must fill the email field");
                dispatcherToLogin.forward(request, response);
            }
            else  if(password.equals("")){
                request.setAttribute("emailset",email);
                request.setAttribute("usernameset",username);
                request.setAttribute("message","you must fill the password field");
                dispatcherToLogin.forward(request, response);
            }
            else  if(repassword.equals("")){
                request.setAttribute("emailset",email);
                request.setAttribute("usernameset",username);
                request.setAttribute("message","you must fill the repassword field");
                dispatcherToLogin.forward(request, response);
            }
            else  if(!password.equals(repassword)){
                request.setAttribute("emailset",email);
                request.setAttribute("usernameset",username);
                request.setAttribute("message","you must enter the same password in repassword field");
                dispatcherToLogin.forward(request, response);
            }
            
            
            else{
                RequestDispatcher dispatcherToController=request.getRequestDispatcher("ULoginControllerServlet");
                dispatcherToController.forward(request, response);
            }
        } catch (Exception ex) {
            PrintWriter out = response.getWriter();
           out.println(ex);
        }
       
      
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
