/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.CountDetails;
import entity.Documents;
import session.UserSession;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author cory4
 */
@WebServlet(name = "DocumentsServlet", urlPatterns = {"/ducumente"})
public class DocumentsServlet extends HttpServlet {

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
        String type = request.getParameter("type");
        Part filePart1 = request.getPart("photo");
        Blob bac_diploma = (Blob) filePart1.getInputStream();
        Part filePart2 = request.getPart("birth_certificate");
        Blob birth_certificate = (Blob) filePart2.getInputStream();
        Part filePart3 = request.getPart("medical_certificate");
        Blob medical_certificate = (Blob) filePart3.getInputStream();
        Part filePart4 = request.getPart("id");
        Blob id = (Blob) filePart4.getInputStream();
        Part filePart5 = request.getPart("previous_college");
        Blob previous_college = (Blob) filePart5.getInputStream();
        Part filePart6 = request.getPart("bachelor_diploma");
        Blob bachelor_diploma = (Blob) filePart6.getInputStream();
        Part filePart7 = request.getPart("diploma_supplement");
        Blob diploma_supplement = (Blob) filePart7.getInputStream();
        Part filePart8 = request.getPart("previous_experience");
        Blob previous_experience = (Blob) filePart8.getInputStream();
        Documents d = new Documents(type, bac_diploma, birth_certificate, medical_certificate, id, previous_college, bachelor_diploma, diploma_supplement,previous_experience) ;
        CountDetails cdd=new CountDetails(6,"Documente", "OK");
         userSessionImpl.addDocuments(d);
         userSessionImpl.editCountDetails(cdd);
         request.getRequestDispatcher("userPage.html").forward(request, response);
    }

}
