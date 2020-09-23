<%-- 
    Document   : cast
    Created on : 20-Sep-2020, 14:48:15
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
        
        
        <table>
            <tr>
                <td colspan="100"><center><h3>Item</h3></center></td>
                <td colspan="100"><center><h3>Name</h3></center></td>
                <td colspan="100"><center><h3>Price</h3></center></td>
                <td colspan="100"><center><h3>Quantity</h3></center></td>
                <td colspan="100"><center><h3>Sub Total</h3></center></td>
            </tr>
            <tr>
                <td colspan="100"><center><img src="<%=session.getAttribute("image")%>" width="100" height="150"></center></td>
                <td colspan="100"><center><%=session.getAttribute("name")%></center></td>
                <td colspan="100"><center>$ <%=session.getAttribute("price")%></center></td>
                <td colspan="100"><center><%=session.getAttribute("qty")%></center></td>
                <td colspan="100"><center>$ <%=session.getAttribute("total")%></center></td>
            </tr>
        </table>
            
         <aside>
      <div class="summary">
        <div class="summary-total-items"><span class="total-items"></span> Items in your Bag</div>
        <div class="summary-subtotal">
          <div class="subtotal-title">Subtotal</div>
          <div class="subtotal-value final-value" id="basket-subtotal">130.00</div>
          <div class="summary-promo hide">
            <div class="promo-title">Promotion</div>
            <div class="promo-value final-value" id="basket-promo"></div>
          </div>
        </div>
        <div class="summary-delivery">
          <select name="delivery-collection" class="summary-delivery-selection">
              <option value="0" selected="selected">Select Collection or Delivery</option>
             <option value="collection">Collection</option>
             <option value="first-class">Royal Mail 1st Class</option>
             <option value="second-class">Royal Mail 2nd Class</option>
             <option value="signed-for">Royal Mail Special Delivery</option>
          </select>
        </div>
        <div class="summary-total">
          <div class="total-title">Total</div>
          <div class="total-value final-value" id="basket-total">130.00</div>
        </div>
        <div class="summary-checkout">
          <button class="checkout-cta">Go to Secure Checkout</button>
        </div>
      </div>
    </aside> 
        
        
    </body>
</html>
 
         
         