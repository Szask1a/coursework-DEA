package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signupform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylesheet.css\">\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:700,400&subset=latin' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\">E-Shop</a>\n");
      out.write("            </div>  \n");
      out.write("            <nav>\n");
      out.write("<!--                <form class=\"search\" method=\"get\" action=\"search.jsp\"> \n");
      out.write("                    <input name=\"id\" placeholder=\"Search...\" type=\"search\">\n");
      out.write("                </form>-->\n");
      out.write("<!--                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Shop</a>    \n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"\">Contact Us</a>      \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Shopping Cart</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">My Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>-->\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"login-page\" method=\"post\" action=\"ValidatingServlet\">\n");
      out.write("            <div class=\"form\">\n");
      out.write("                <form class=\"login-form\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Name\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameset}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' id=\"username\" name=\"username\"/>\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" name=\"password\"/>\n");
      out.write("                    <input type=\"password\" placeholder=\"Re-type password\" name=\"repassword\"/>\n");
      out.write("                    <input type=\"text\" placeholder=\"Email address\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailset}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' name=\"email\"/>\n");
      out.write("                    <button type=\"submit\" name=\"register\">Create</button>\n");
      out.write("                    <p class=\"message\">Already registered? <a href=\"loginform.jsp\">Sign In</a></p>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <div class=\"footer\">\n");
      out.write("            Made for <a class=\"footer-text\" href=\"https://github.com/Szask1a/coursework-DEA\">DEA PROJECT 2020</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"stylescript.js\"></script>\n");
      out.write("        \n");
      out.write("<!--        <form method=\"post\" action=\"ValidatingServlet\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>UserName:</td>\n");
      out.write("                    <td><input type=\"text\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameset}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' id=\"username\" name=\"username\"  ></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>E-mail:</td>\n");
      out.write("                    <td><input type=\"text\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailset}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Re-type Password</td>\n");
      out.write("                    <td><input type=\"password\"  name=\"repassword\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            <input type=\"reset\" value=\"reset\" name=\"reset\">\n");
      out.write("            <input type=\"submit\" value=\"register\" name=\"register\">\n");
      out.write("        </form>-->\n");
      out.write("       \n");
      out.write("    </body>\n");
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
