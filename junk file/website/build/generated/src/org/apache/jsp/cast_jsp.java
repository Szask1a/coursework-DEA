package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cast_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"100\"><center><h3>Item</h3></center></td>\n");
      out.write("                <td colspan=\"100\"><center><h3>Name</h3></center></td>\n");
      out.write("                <td colspan=\"100\"><center><h3>Price</h3></center></td>\n");
      out.write("                <td colspan=\"100\"><center><h3>Quantity</h3></center></td>\n");
      out.write("                <td colspan=\"100\"><center><h3>Sub Total</h3></center></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"100\"><center><img src=\"");
      out.print(session.getAttribute("image"));
      out.write("\" width=\"100\" height=\"150\"></center></td>\n");
      out.write("                <td colspan=\"100\"><center>");
      out.print(session.getAttribute("name"));
      out.write("</center></td>\n");
      out.write("                <td colspan=\"100\"><center>$ ");
      out.print(session.getAttribute("price"));
      out.write("</center></td>\n");
      out.write("                <td colspan=\"100\"><center>");
      out.print(session.getAttribute("qty"));
      out.write("</center></td>\n");
      out.write("                <td colspan=\"100\"><center>$ ");
      out.print(session.getAttribute("total"));
      out.write("</center></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("         <aside>\n");
      out.write("      <div class=\"summary\">\n");
      out.write("        <div class=\"summary-total-items\"><span class=\"total-items\"></span> Items in your Bag</div>\n");
      out.write("        <div class=\"summary-subtotal\">\n");
      out.write("          <div class=\"subtotal-title\">Subtotal</div>\n");
      out.write("          <div class=\"subtotal-value final-value\" id=\"basket-subtotal\">130.00</div>\n");
      out.write("          <div class=\"summary-promo hide\">\n");
      out.write("            <div class=\"promo-title\">Promotion</div>\n");
      out.write("            <div class=\"promo-value final-value\" id=\"basket-promo\"></div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"summary-delivery\">\n");
      out.write("          <select name=\"delivery-collection\" class=\"summary-delivery-selection\">\n");
      out.write("              <option value=\"0\" selected=\"selected\">Select Collection or Delivery</option>\n");
      out.write("             <option value=\"collection\">Collection</option>\n");
      out.write("             <option value=\"first-class\">Royal Mail 1st Class</option>\n");
      out.write("             <option value=\"second-class\">Royal Mail 2nd Class</option>\n");
      out.write("             <option value=\"signed-for\">Royal Mail Special Delivery</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"summary-total\">\n");
      out.write("          <div class=\"total-title\">Total</div>\n");
      out.write("          <div class=\"total-value final-value\" id=\"basket-total\">130.00</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"summary-checkout\">\n");
      out.write("          <button class=\"checkout-cta\">Go to Secure Checkout</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </aside>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("         \n");
      out.write("         ");
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
