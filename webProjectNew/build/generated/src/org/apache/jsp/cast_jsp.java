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
      out.write("\n");
      out.write("        <script>\n");
      out.write("            /* Remove item from cart */\n");
      out.write("            function removeItem(removeButton) {\n");
      out.write("                /* Remove row from DOM and recalc cart total */\n");
      out.write("                var productRow = $(removeButton).parent().parent();\n");
      out.write("                productRow.slideUp(fadeTime, function () {\n");
      out.write("                    productRow.remove();\n");
      out.write("                    recalculateCart();\n");
      out.write("                    updateSumItems();\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style> \n");
      out.write("            /*\n");
      out.write("     To change this license header, choose License Headers in Project Properties.\n");
      out.write("     To change this template file, choose Tools | Templates\n");
      out.write("     and open the template in the editor.\n");
      out.write("            */\n");
      out.write("            /* \n");
      out.write("                Created on : 15 Aug, 2020, 6:29:19 PM\n");
      out.write("                Author     : This PC\n");
      out.write("            */\n");
      out.write("\n");
      out.write("            @charset \"utf-8\";\n");
      out.write("\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700,600);\n");
      out.write("\n");
      out.write("            html,\n");
      out.write("            html a {\n");
      out.write("                -webkit-font-smoothing: antialiased;\n");
      out.write("                text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.004);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background-color: #fff;\n");
      out.write("                color: #666;\n");
      out.write("                font-family: 'Open Sans', sans-serif;\n");
      out.write("                font-size: 62.5%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                border: 0 none;\n");
      out.write("                outline: 0;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            strong {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p {\n");
      out.write("                margin: 0.75rem 0 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                font-size: 0.75rem;\n");
      out.write("                font-weight: normal;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input,\n");
      out.write("            button {\n");
      out.write("                border: 0 none;\n");
      out.write("                outline: 0 none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                background-color: #666;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover,\n");
      out.write("            button:focus {\n");
      out.write("                background-color: #555;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img,\n");
      out.write("            .basket-module,\n");
      out.write("            .basket-labels,\n");
      out.write("            .basket-product {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input,\n");
      out.write("            button,\n");
      out.write("            .basket,\n");
      out.write("            .basket-module,\n");
      out.write("            .basket-labels,\n");
      out.write("            .item,\n");
      out.write("            .price,\n");
      out.write("            .quantity,\n");
      out.write("            .subtotal,\n");
      out.write("            .basket-product,\n");
      out.write("            .product-image,\n");
      out.write("            .product-details {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .price:before,\n");
      out.write("            .subtotal:before,\n");
      out.write("            .subtotal-value:before,\n");
      out.write("            .total-value:before,\n");
      out.write("            .promo-value:before {\n");
      out.write("                content: '£';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hide {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            main {\n");
      out.write("                clear: both;\n");
      out.write("                font-size: 0.75rem;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                overflow: hidden;\n");
      out.write("                padding: 1rem 0;\n");
      out.write("                width: 960px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .basket,\n");
      out.write("            aside {\n");
      out.write("                padding: 0 1rem;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .basket {\n");
      out.write("                width: 70%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .basket-module {\n");
      out.write("                color: #111;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label {\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 0.3125rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .promo-code-field {\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                padding: 0.5rem;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                transition: all 0.2s linear;\n");
      out.write("                width: 48%;\n");
      out.write("                -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);\n");
      out.write("                -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);\n");
      out.write("                -o-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);\n");
      out.write("                box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .promo-code-field:hover,\n");
      out.write("            .promo-code-field:focus {\n");
      out.write("                border: 1px solid #999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .promo-code-cta {\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 0.625rem;\n");
      out.write("                margin-left: 0.625rem;\n");
      out.write("                padding: 0.6875rem 1.25rem 0.625rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .basket-labels {\n");
      out.write("                border-top: 1px solid #ccc;\n");
      out.write("                border-bottom: 1px solid #ccc;\n");
      out.write("                margin-top: 1.625rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul {\n");
      out.write("                list-style: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                color: #111;\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 0.625rem 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li.price:before,\n");
      out.write("            li.subtotal:before {\n");
      out.write("                content: '';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .item {\n");
      out.write("                width: 25%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .price,\n");
      out.write("            .quantity,\n");
      out.write("            .subtotal {\n");
      out.write("                width: 15%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .subtotal {\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .remove {\n");
      out.write("                bottom: 1.125rem;\n");
      out.write("                float: right;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                text-align: right;\n");
      out.write("                width: 45%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .remove button {\n");
      out.write("                background-color: transparent;\n");
      out.write("                color: #777;\n");
      out.write("                float: none;\n");
      out.write("                text-decoration: underline;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .item-heading {\n");
      out.write("                padding-left: 4.375rem;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .basket-product {\n");
      out.write("                border-bottom: 1px solid #ccc;\n");
      out.write("                padding: 1rem 0;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-image {\n");
      out.write("                width: 35%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-details {\n");
      out.write("                width: 65%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-frame {\n");
      out.write("                border: 1px solid #aaa;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-details {\n");
      out.write("                padding: 0 1.5rem;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .quantity-field {\n");
      out.write("                background-color: #ccc;\n");
      out.write("                border: 1px solid #aaa;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 0.625rem;\n");
      out.write("                padding: 2px;\n");
      out.write("                width: 3.75rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            aside {\n");
      out.write("                float: right;\n");
      out.write("                position: relative;\n");
      out.write("                width: 30%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .summary {\n");
      out.write("                background-color: #eee;\n");
      out.write("                border: 1px solid #aaa;\n");
      out.write("                padding: 1rem;\n");
      out.write("                position: fixed;\n");
      out.write("                width: 250px;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .summary-total-items {\n");
      out.write("                color: #666;\n");
      out.write("                font-size: 0.875rem;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .summary-subtotal,\n");
      out.write("            .summary-total {\n");
      out.write("                border-top: 1px solid #ccc;\n");
      out.write("                border-bottom: 1px solid #ccc;\n");
      out.write("                clear: both;\n");
      out.write("                margin: 1rem 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                padding: 0.5rem 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .subtotal-title,\n");
      out.write("            .subtotal-value,\n");
      out.write("            .total-title,\n");
      out.write("            .total-value,\n");
      out.write("            .promo-title,\n");
      out.write("            .promo-value {\n");
      out.write("                color: #111;\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .summary-promo {\n");
      out.write("                -webkit-transition: all .3s ease;\n");
      out.write("                -moz-transition: all .3s ease;\n");
      out.write("                -o-transition: all .3s ease;\n");
      out.write("                transition: all .3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .promo-title {\n");
      out.write("                float: left;\n");
      out.write("                width: 70%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .promo-value {\n");
      out.write("                color: #8B0000;\n");
      out.write("                float: left;\n");
      out.write("                text-align: right;\n");
      out.write("                width: 30%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .summary-delivery {\n");
      out.write("                padding-bottom: 3rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .subtotal-value,\n");
      out.write("            .total-value {\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .total-title {\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .summary-checkout {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .checkout-cta {\n");
      out.write("                display: block;\n");
      out.write("                float: none;\n");
      out.write("                font-size: 0.75rem;\n");
      out.write("                text-align: center;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                padding: 0.625rem 0;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .summary-delivery-selection {\n");
      out.write("                background-color: #ccc;\n");
      out.write("                border: 1px solid #aaa;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                display: block;\n");
      out.write("                font-size: 0.625rem;\n");
      out.write("                height: 34px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 640px) {\n");
      out.write("                aside,\n");
      out.write("                .basket,\n");
      out.write("                .summary,\n");
      out.write("                .item,\n");
      out.write("                .remove {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("                .basket-labels {\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("                .basket-module {\n");
      out.write("                    margin-bottom: 1rem;\n");
      out.write("                }\n");
      out.write("                .item {\n");
      out.write("                    margin-bottom: 1rem;\n");
      out.write("                }\n");
      out.write("                .product-image {\n");
      out.write("                    width: 40%;\n");
      out.write("                }\n");
      out.write("                .product-details {\n");
      out.write("                    width: 60%;\n");
      out.write("                }\n");
      out.write("                .price,\n");
      out.write("                .subtotal {\n");
      out.write("                    width: 33%;\n");
      out.write("                }\n");
      out.write("                .quantity {\n");
      out.write("                    text-align: center;\n");
      out.write("                    width: 34%;\n");
      out.write("                }\n");
      out.write("                .quantity-field {\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("                .remove {\n");
      out.write("                    bottom: 0;\n");
      out.write("                    text-align: left;\n");
      out.write("                    margin-top: 0.75rem;\n");
      out.write("                    position: relative;\n");
      out.write("                }\n");
      out.write("                .remove button {\n");
      out.write("                    padding: 0;\n");
      out.write("                }\n");
      out.write("                .summary {\n");
      out.write("                    margin-top: 1.25rem;\n");
      out.write("                    position: relative;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (min-width: 641px) and (max-width: 960px) {\n");
      out.write("                aside {\n");
      out.write("                    padding: 0 1rem 0 0;\n");
      out.write("                }\n");
      out.write("                .summary {\n");
      out.write("                    width: 28%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 960px) {\n");
      out.write("                main {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("                .product-details {\n");
      out.write("                    padding: 0 1rem;\n");
      out.write("                }\n");
      out.write("            }.item-quantity {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .total-items {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .final-value {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #basket-subtotal {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"basket\">\n");
      out.write("            <div class=\"basket-module\">\n");
      out.write("                <table>\n");
      out.write("                    <div class=\"basket-labels\">\n");
      out.write("                        <div class=\"li\">\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td  colspan=\"100\"><center><h3>Item</h3><center></td>\n");
      out.write("                                    <td  colspan=\"100\"><center><h3>Name</h3><center></td>\n");
      out.write("                                            <td  colspan=\"100\"><center><h3>Price</h3><center></td>\n");
      out.write("                                                    <td  colspan=\"100\"><center><h3>Quantity</h3><center></td>\n");
      out.write("                                                            <td  colspan=\"100\"><center><h3>Sub Total</h3></td>\n");
      out.write("                                                                <td  colspan=\"100\"><center><h3>Status</h3></td>\n");
      out.write("\n");
      out.write("                                                                    </tr>\n");
      out.write("                                                                    </div> \n");
      out.write("                                                                    <!--                        <div class=\"basket-labels\">\n");
      out.write("                                                                                                <ul>\n");
      out.write("                                                                                                    <li class=\"item item-heading\">Item</li>\n");
      out.write("                                                                                                    <li class=\"price\">Name</li>\n");
      out.write("                                                                                                    <li class=\"price\">Price</li>\n");
      out.write("                                                                                                    <li class=\"quantity\">Quantity</li>\n");
      out.write("                                                                                                    <li class=\"subtotal\">Subtotal</li>\n");
      out.write("                                                                                                </ul>\n");
      out.write("                                                                                            </div>-->\n");
      out.write("                                                                    <tr>\n");
      out.write("\n");
      out.write("                                                                        <td colspan=\"100\"><center><img src=\"");
      out.print(session.getAttribute("image"));
      out.write("\" width=\"100\" height=\"150\"></center></td>\n");
      out.write("                                                                    <td colspan=\"100\"><center>");
      out.print(session.getAttribute("name"));
      out.write("</center></td>\n");
      out.write("                                                                    <td colspan=\"100\"><center>$ ");
      out.print(session.getAttribute("price"));
      out.write("</center></td>\n");
      out.write("                                                                    <td colspan=\"100\"><center>");
      out.print(session.getAttribute("qty"));
      out.write("</center></td>\n");
      out.write("                                                                    <td colspan=\"100\"><center>$ ");
      out.print(session.getAttribute("total"));
      out.write("</center></td>\n");
      out.write("                                                                    <td colspan=\"100\"><center><input type=\"submit\" value=\"remove\" action=\"\n");
      out.write("                                                                                ");
request.getSession().removeAttribute("cartServlet");
      out.write("\"</center></td>\n");
      out.write("                                                                    </tr>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    </table>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <aside>\n");
      out.write("                                                                        <div class=\"summary\">\n");
      out.write("                                                                            <div class=\"summary-total-items\"><span class=\"total-items\"></span> Items in your Bag</div>\n");
      out.write("                                                                            <div class=\"summary-subtotal\">\n");
      out.write("                                                                                <div class=\"subtotal-title\">Subtotal</div>\n");
      out.write("                                                                                <div class=\"subtotal-value final-value\" id=\"basket-subtotal\"> ");
      out.print(session.getAttribute("total"));
      out.write("</div>\n");
      out.write("                                                                                <div class=\"summary-promo hide\">\n");
      out.write("                                                                                    <div class=\"promo-title\">Promotion</div>\n");
      out.write("                                                                                    <div class=\"promo-value final-value\" id=\"basket-promo\"></div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"summary-delivery\">\n");
      out.write("                                                                                <select name=\"delivery-collection\" class=\"summary-delivery-selection\">\n");
      out.write("                                                                                    <option value=\"0\" selected=\"selected\">Select Collection or Delivery</option>\n");
      out.write("                                                                                    <option value=\"collection\">Collection</option>\n");
      out.write("                                                                                    <option value=\"first-class\">Royal Mail 1st Class</option>\n");
      out.write("                                                                                    <option value=\"second-class\">Royal Mail 2nd Class</option>\n");
      out.write("                                                                                    <option value=\"signed-for\">Royal Mail Special Delivery</option>\n");
      out.write("                                                                                </select>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"summary-total\">\n");
      out.write("                                                                                <div class=\"total-title\">Total</div>\n");
      out.write("                                                                                <div class=\"total-value final-value\" id=\"basket-total\"> ");
      out.print(session.getAttribute("total"));
      out.write("</div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"summary-checkout\">\n");
      out.write("                                                                                <button class=\"checkout-cta\">Go to Secure Checkout</button>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </aside> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                    </body>\n");
      out.write("                                                                    </html>\n");
      out.write("\n");
      out.write("\n");
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
