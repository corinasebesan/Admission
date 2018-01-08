/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.Taxes;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.UserSession;

/**
 *
 * @author cory4
 */
@WebServlet(name = "TaxesAdminServlet", urlPatterns = {"/modificaretaxe"})
public class TaxesAdminServlet extends HttpServlet {

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
        String action = request.getParameter("action");
        String payment = request.getParameter("payment");
        Taxes tax = new Taxes(payment);
         if("Schimbă".equalsIgnoreCase(action)){
            userSessionImpl.editTaxes(tax);
        }else if("Șterge".equalsIgnoreCase(action)){
            userSessionImpl.deleteTaxes(tax.getIdtax());
        }
         request.getRequestDispatcher("taxeAdmin.jsp").forward(request, response);
    }

}