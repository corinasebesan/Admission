/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.CountDetails;
import entity.Taxes;
import session.UserSession;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cory4
 */
@WebServlet(name = "TaxesServlet", urlPatterns = {"/taxe"})
public class TaxesServlet extends HttpServlet {

    @EJB
    private UserSession userSessionImpl;
     
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request,  response);
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String payment = request.getParameter("payment");
        Taxes tax = new Taxes(payment);
        CountDetails cdd=new CountDetails(7,"Taxa", "OK");
         userSessionImpl.addTaxes(tax);
         userSessionImpl.editCountDetails(cdd);
         request.getRequestDispatcher("userPage.html").forward(request, response);
    }

}
