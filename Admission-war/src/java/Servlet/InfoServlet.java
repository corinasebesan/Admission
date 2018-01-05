/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.CountDetails;
import entity.OtherData;
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
@WebServlet(name = "InfoServlet", urlPatterns = {"/alteinformatii"})
public class InfoServlet extends HttpServlet {

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
        String civil_state = request.getParameter("civil_state");
        String nationality = request.getParameter("nationality");
        String ethnicity = request.getParameter("ethnicity");
        String citizenship = request.getParameter("citizenship");
        if(citizenship.equals("")){
            citizenship = request.getParameter("ocitizenship");
        }
        String previous_citizenship = request.getParameter("previous_citizenship");
        String special_social = request.getParameter("special_social");
        String handicaped = request.getParameter("handicaped");
        OtherData od = new OtherData(civil_state, nationality, ethnicity, citizenship, previous_citizenship, special_social, handicaped);
        CountDetails cdd=new CountDetails(2,"Alte informatii", "OK");
         userSessionImpl.addOtherData(od);
         userSessionImpl.editCountDetails(cdd);
         request.getRequestDispatcher("userPage.html").forward(request, response);
    }

}
