/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.PersonalData;
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
@WebServlet(name = "DataAdminServlet", urlPatterns = {"/modificaredatepersonale"})
public class DataAdminServlet extends HttpServlet {

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
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String father = request.getParameter("father");
        String previous_name = request.getParameter("previous_name");
        String sex = request.getParameter("sex");
        String cnp = request.getParameter("cnp");
        String birthdate = request.getParameter("birthdate");
        String county = request.getParameter("county");
        String city = request.getParameter("city");
        String serie = request.getParameter("serie");
        String issued_by = request.getParameter("issued_by");
        String number = request.getParameter("number");
        String issued_at = request.getParameter("issued_at");
        String expires_at = request.getParameter("expires_at");
        PersonalData pd = new PersonalData(father, previous_name, sex, birthdate, county, city, serie, number, issued_by, issued_at, expires_at, name, surname, cnp);
        if("Schimbă".equalsIgnoreCase(action)){
            userSessionImpl.editPersonalData(pd);
        }else if("Șterge".equalsIgnoreCase(action)){
            userSessionImpl.deletePersonalData(pd.getId());
        }
         
         request.getRequestDispatcher("dateAdmin.jsp").forward(request, response);
    }

}

