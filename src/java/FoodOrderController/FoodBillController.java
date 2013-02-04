/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodOrderController;

import Models.FoodBillModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David
 */
public class FoodBillController extends HttpServlet {
    private static final String destination = "/billJSP.jsp";
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        List<String> items = new ArrayList<String>();
        items.add(request.getParameter("mainCourse"));
        items.add(request.getParameter("firstCourse"));
        items.add(request.getParameter("side"));
        items.add(request.getParameter("beverage"));
        
        FoodBillModel bill = new FoodBillModel(items);
        double subtotal = bill.getSubtotal();
        double tax = bill.getTax(subtotal);
        double total = bill.getTotal(subtotal, tax);
        double tip = bill.getSuggestedTip(total);
        double grandTotal = bill.getGrandTotal(total, tip);
        
        request.setAttribute("subtotal", subtotal);
        request.setAttribute("tax", tax);
        request.setAttribute("total", total);
        request.setAttribute("tip", tip);
        request.setAttribute("grandTotal", grandTotal);
        
//        String mainCourse = request.getParameter("mainCourse");
//        String firstCourse = request.getParameter("firstCourse");
//        String sideDish = request.getParameter("side");
//        String beverage = request.getParameter("beverage");
        
        RequestDispatcher dispatcher = 
                getServletContext().getRequestDispatcher(destination);
              dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
