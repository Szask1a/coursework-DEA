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
      out.write("        <link rel=\"stylesheet\" href=\"stylesheet.css\">\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:700,400&subset=latin' rel='stylesheet' type='text/css'>\n");
      out.write("        <style>\n");
      out.write("            .nav {\n");
      out.write("                background-color: #FAFAD2;\n");
      out.write("            }  \n");
      out.write("            span.b {\n");
      out.write("            display: inline-block;\n");
      out.write("            width: 100px;\n");
      out.write("            height: 100px;\n");
      out.write("            padding: 5px;\n");
      out.write("            margin-left: 50px;   \n");
      out.write("             \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <b>Tech Hub</b><img src=\"Logo.png\" width=\"30\" height=\"30\">\n");
      out.write("            </div>  \n");
      out.write("            <nav>\n");
      out.write("                <form class=\"search\" method=\"get\" action=\"search.jsp\"> \n");
      out.write("                    <input name=\"id\" placeholder=\"Search...\" type=\"search\">\n");
      out.write("                </form>\n");
      out.write("                <ul>\n");
      out.write("                   \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"mainpage.jsp\">Shop</a>    \n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a >Contact Us</a>     \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"castNew.jsp\">Shopping Cart</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"index.html\">Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
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
                           String qry = "select * from seller";
                           resultSet = statement.executeQuery(qry);
                           while(resultSet.next()){ 
                    
      out.write("\n");
      out.write("                  \n");
      out.write("                    <span class=\"b\">\n");
      out.write("                        <form action=\"cartServlet\" method=\"post\">\n");
      out.write("                            <img src=\"");
      out.print(resultSet.getString(4));
      out.write(" \" width=\"100\" height=\"150\">\n");
      out.write("                            <b>");
      out.print(resultSet.getString(5));
      out.write("</b><br>\n");
      out.write("                            <b>$ ");
      out.print(resultSet.getString(6));
      out.write("</b><br>\n");
      out.write("                            <b>Quantity:<input type=\"text\" name=\"qty\" size=\"2\"></b><br><br>\n");
      out.write("                            <input type=\"hidden\" name=\"image\" value=\"");
      out.print(resultSet.getString(4));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"name\" value=\"");
      out.print(resultSet.getString(5));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"price\" value=\"");
      out.print(resultSet.getString(6));
      out.write("\">\n");
      out.write("                            <input type=\"submit\" value=\"Add to cart\"><br><br>\n");
      out.write("                        </form>\n");
      out.write("                    </span>&nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp         \n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    ");

                      }
                       
                      } catch (Exception e) {}
                        
                       
                    
      out.write("\n");
      out.write("               <div class=\"footer\">\n");
      out.write("            Made for <a class=\"footer-text\" href=\"https://github.com/Szask1a/coursework-DEA\">DEA PROJECT 2020</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"stylescript.js\"></script>\n");
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
