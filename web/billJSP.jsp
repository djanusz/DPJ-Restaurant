<%-- 
    Document   : billJSP
    Created on : Feb 4, 2013, 2:49:07 PM
    Author     : David
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bill</title>
    </head>
    <body>
        <form>
            <div>
                <h1>Order Summary</h1>
                <% 
                    Object lineItems = request.getAttribute("lineItems");
                    List<String> lineItemList = new ArrayList<String>();
                    if (lineItems != null){
                      lineItemList = (ArrayList<String>)lineItems; 
                    }
                    for (String s : lineItemList) {
                        out.println("<h2>" + s + "</h2><br>");
                    }
                %>
                <hr>
                <h1>sub-Total: ${subtotal}</h1>
                <h1>Tax: ${tax}</h1>
                <hr>
                <h1>Total ${total}</h1><br><br>
                <h1>Suggested Tip: ${tip}</h1><br><br>
                <h1 color="Red"><b>Grand-Total: ${grandTotal}<b></h1>
            </div>
         </form>
     </body>
</html>
