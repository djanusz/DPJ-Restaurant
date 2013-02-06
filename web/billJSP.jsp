<%-- 
    Document   : billJSP
    Created on : Feb 4, 2013, 2:49:07 PM
    Author     : David
--%>

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
