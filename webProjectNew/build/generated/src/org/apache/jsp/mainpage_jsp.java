package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .nav {\n");
      out.write("                background-color: #FAFAD2;\n");
      out.write("            }\n");
      out.write("             .quantity-field {\n");
      out.write("                background-color: #ccc;\n");
      out.write("                border: 1px solid #aaa;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 0.625rem;\n");
      out.write("                padding: 2px;\n");
      out.write("                width: 3.75rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <b>Site</b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("            <input type=\"text\" ><input type=\"submit\" value=\"search\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp | &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("            <a><b>SignUp</b></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp | &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("            <a><b>Shopping Cart</b></a>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <h4>All Items</h4>\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            ");

                        
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet resultSet = null;
                        
                        try{
                           Class.forName("com.mysql.jdbc.Driver");
                           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
                           statement = connection.createStatement();
                           String qry = "select * from sellertbl";
                           resultSet = statement.executeQuery(qry);
                           while(resultSet.next()){ 
                    
      out.write("\n");
      out.write("                  \n");
      out.write("                    <td colspan=\"100\">\n");
      out.write("                        <form action=\"cartServlet1\" method=\"post\">\n");
      out.write("                            <img src=\"");
      out.print(resultSet.getString(4));
      out.write(" \" width=\"100\" height=\"150\"><br>\n");
      out.write("                            <b>");
      out.print(resultSet.getString(5));
      out.write("</b><br>\n");
      out.write("                            <b>$ ");
      out.print(resultSet.getString(6));
      out.write("</b><br>\n");
      out.write("                            \n");
      out.write("                          <b>Quantity:  <input type=\"number\" name=\"qty\" min=\"1\" max=\"\"  size=\"2\" class=\"quantity-field\">\n");
      out.write("                          \n");
      out.write("                            </b><br><br>\n");
      out.write("                            <input type=\"hidden\" name=\"image\" value=\"");
      out.print(resultSet.getString(4));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"name\" value=\"");
      out.print(resultSet.getString(5));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"price\" value=\"");
      out.print(resultSet.getString(6));
      out.write("\">\n");
      out.write("                            <input type=\"submit\" value=\"Add to cart\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>       \n");
      out.write("                       \n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("          \n");
      out.write("        </div>                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");

                      }
                       
                      } catch (Exception e) {}
                        
                       
                    
      out.write("\n");
      out.write("    </body> \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
