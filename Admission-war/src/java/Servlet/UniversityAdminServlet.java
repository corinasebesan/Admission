/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;


import entity.UniversityEducation;
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
@WebServlet(name = "UniversityAdminServlet", urlPatterns = {"/modificareuniversitare"})
public class UniversityAdminServlet extends HttpServlet {

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
        String county = request.getParameter("county");
        String university = request.getParameter("university");
        String domain = request.getParameter("domain");
        String faculty = request.getParameter("faculty");
        String specialty = request.getParameter("specialty");
        String title = request.getParameter("title");
        String educational_form = request.getParameter("educational_form");
        String financial_form = request.getParameter("financial_form");
        String duration = request.getParameter("duration");
        String graduation = request.getParameter("graduation");
        String exam_average = request.getParameter("exam_average");
        String years_average = request.getParameter("years_average");
        String type = request.getParameter("type");
        String issuer = request.getParameter("issuer");
        String serie = request.getParameter("serie");
        String number = request.getParameter("number");
        String issue_year = request.getParameter("issue_year");
        String transcript_number = request.getParameter("transcript_number");
        UniversityEducation ue = new UniversityEducation(county, university, domain, faculty, specialty, title, educational_form, financial_form, duration, graduation, exam_average, years_average, type, issuer, serie, number, issue_year, transcript_number);
         
        if("Schimbă".equalsIgnoreCase(action)){
            userSessionImpl.editUniversityEducation(ue);
        }else if("Șterge".equalsIgnoreCase(action)){
            userSessionImpl.deleteUniversityEducation(ue.getId());
        }
         request.getRequestDispatcher("universitareAdmin.jsp").forward(request, response);
    }

}
