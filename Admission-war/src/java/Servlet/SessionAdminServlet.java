/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.AdmissionSession;
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
@WebServlet(name = "SessionAdminServlet", urlPatterns = {"/modificaresesiuni"})
public class SessionAdminServlet extends HttpServlet {

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
        String sessions = request.getParameter("sessions");
        String specialty = request.getParameter("specialty");
        AdmissionSession as = new AdmissionSession(sessions, specialty);
         if("Schimbă".equalsIgnoreCase(action)){
            userSessionImpl.editAdmissionSession(as);
        }else if("Șterge".equalsIgnoreCase(action)){
            userSessionImpl.deleteAdmissionSession(as.getIdses());
        }
         request.getRequestDispatcher("sesiuniAdmin.jsp").forward(request, response);
    }

}
