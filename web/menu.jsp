<%-- 
    Document   : menu
    Created on : Feb 4, 2013, 12:01:47 PM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <form id="menu" name="menu" method="POST" action="FoodBillController">
            <h1>Welcome to BACON!</h1>
            <br>
            <hr>

            <h2>Main Course</h2>
            <div>
                Please select a main course below.
                <select id="mainCourse" name="mainCourse">
                    <option>Steak</option>
                    <option>Lobster</option>
                    <option>Veal</option>
                </select>
            </div>
            <br>
            <hr>

            <h2>Soup or Salad</h2>
            <div>
                Please select a soup or salad.
                <br>
                &nbsp;&nbsp;
                <u>Soups</u><br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="firstCourse" value="Potato"> Potato
                <br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="firstCourse" value="Tomato" > Tomato
                <br>
                
                <br>
                &nbsp;&nbsp;
                <u>Salads</u><br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="firstCourse" value="House" checked> House Salad
                <br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="firstCourse" value="Cesar"> Cesar Salad
                <br>
               
            </div>
            <br>
            <hr>

            <h2>Sides</h2>
            <div>
                Please select <u>one</u> side dish.
                <br>
                &nbsp;&nbsp;
                <input type="radio" name="side" value="Mashed"> Mashed Potatoes<br>
                &nbsp;&nbsp;
                <input type="radio" name="side" value="Baked" checked> Baked Potato<br>
                &nbsp;&nbsp;
                <input type="radio" name="side" value="Vegetables"> Steamed Vegetables<br>
            </div>
            <br>
            <hr>

            <h2>Beverages</h2>
            <div>
                Please select a beverage.
                <br>
                &nbsp;&nbsp;
                <u>Alcohol:</u><br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="beverage" value="Beer"> Beer
                <br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="beverage" value="Wine" > Wine
                <br>
               
                <br>
                &nbsp;&nbsp;
                <u>Non-Alcohol:</u><br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="beverage" value="Milk" checked> Milk
                <br>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="beverage" value="Soda"> Soda
                <br>
                
            </div>
            <br>
            <hr>
            <input id="menuSubmit" name="menuSubmit" type="submit" value="Submit">
        </form>    
    </body>
</html>
