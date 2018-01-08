/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.User;
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
@WebServlet(name = "UserAdminServlet", urlPatterns = {"/modificareuser"})
public class UserAdminServlet extends HttpServlet {

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
        String purpose = request.getParameter("purpose");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String cnp = request.getParameter("cnp");
        String phone = request.getParameter("phone");
        User user = new User(purpose, name, surname, email, password, cnp, phone);
         if("Schimbă".equalsIgnoreCase(action)){
            userSessionImpl.editUser(user);
        }else if("Șterge".equalsIgnoreCase(action)){
            userSessionImpl.deleteUser(user.getId());
        }
         request.getRequestDispatcher("userAdmin.jsp").forward(request, response);
    }

}
