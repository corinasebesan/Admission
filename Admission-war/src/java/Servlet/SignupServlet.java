/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Servlet;
import session.UserSession;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SignupServlet", urlPatterns = {"/welcome"})
public class SignupServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        String purpose = request.getParameter("purpose");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String cnp = request.getParameter("cnp");
        String phone = request.getParameter("phone");
        User user = new User(purpose, name, surname, email, password, cnp, phone);
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Admission</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Admission " + request.getContextPath() + "</h1>");
            out.println("<p>"+ userSessionImpl.welcomeUser(name)+"</p>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
    }
}
