
package beanpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class cartServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cartServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cartServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {
        
        
        String image = request.getParameter("image");
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        int total=0;
        
        
        HttpSession session = request.getSession();
        
        if(qty!=0) {
            
            total = qty*price;
        }
        
        session.setAttribute("image", image);
        session.setAttribute("name", name);
        session.setAttribute("price", price);
        session.setAttribute("qty", qty);
        session.setAttribute("total",total);
        RequestDispatcher rd=request.getRequestDispatcher("mainpage.jsp");
        rd.forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
