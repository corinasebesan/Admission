/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.CountDetails;
import entity.StableReidency;
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
@WebServlet(name = "DomiciliuServlet", urlPatterns = {"/domiciliulstabil"})
public class DomiciliuServlet extends HttpServlet {

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
        String county = request.getParameter("county");
        String city = request.getParameter("city");
        String postal_code = request.getParameter("postal_code");
        String street = request.getParameter("street");
        String house_number = request.getParameter("house_number");
        String block = request.getParameter("block");
        String stair = request.getParameter("stair");
        String floor = request.getParameter("floor");
        String appartament = request.getParameter("appartament");
        StableReidency sr = new StableReidency(county, city, postal_code, street, house_number, block, stair, floor, appartament);
        CountDetails cdd=new CountDetails(3,"Domiciliu", "OK");
         userSessionImpl.addStableReidency(sr);
         userSessionImpl.editCountDetails(cdd);
         request.getRequestDispatcher("userPage.html").forward(request, response);
    }



}
