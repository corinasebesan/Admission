/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.CountDetails;
import entity.HighschoolEducation;
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
@WebServlet(name = "HighschoolServlet", urlPatterns = {"/studiiliceale"})
public class HighschoolServlet extends HttpServlet {

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
        String highschool_county = request.getParameter("highschool_county");
        String graduated_highschool = request.getParameter("graduated_highschool");
        String section = request.getParameter("section");
        String form = request.getParameter("form");
        String duration = request.getParameter("duration");
        String graduation = request.getParameter("graduation");
        String highschool_average = request.getParameter("highschool_average");
        String bac_year = request.getParameter("bac_year");
        String bac_average = request.getParameter("bac_average");
        String type = request.getParameter("type");
        String issuer = request.getParameter("issuer");
        String diploma_serie = request.getParameter("diploma_serie");
        String diploma_number = request.getParameter("diploma_number");
        String issue_year = request.getParameter("issue_year");
        String transcript_number = request.getParameter("transcript_number");
        HighschoolEducation he = new HighschoolEducation(highschool_county, graduated_highschool, section, form, duration, graduation, highschool_average, bac_year, bac_average, type, issuer, diploma_serie, diploma_number, issue_year, transcript_number);
        CountDetails cdd=new CountDetails(4,"Studii liceale", "OK");
         userSessionImpl.addHighschoolEducation(he);
         userSessionImpl.editCountDetails(cdd);
         request.getRequestDispatcher("userPage.html").forward(request, response);
    }


}
