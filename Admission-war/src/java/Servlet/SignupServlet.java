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

         userSessionImpl.addUser(user);
         request.setAttribute("name", name);
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Admitere online</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link href=\"still.css\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Admitere...</h1>");
            out.println("<p class=\"italic\">Învățătura este o comoară care își va urma proprietarul peste tot. Proverb chinezesc</p>");
            out.println("</header>");
            out.println("<main>");
            out.println("<div id=\"nav\">");
            out.println("<ul>");
            out.println("<li><a href=\"userPage.html\">Acasă</a></li>");
            out.println("<li><a href=\"http://inginerie.ulbsibiu.ro/\"; target=\"_blank\">Site-ul facultății</a></li>");
            out.println("<li><a href=\"#\" >Specializări</a>");
            out.println("<ul>");
            out.println("<li><a href=\"listaSpecializari2.html\" >Listă specializări</a></li>");
            out.println("<li><a href=\"http://csac.ulbsibiu.ro/\"; target=\"_blank\">Departamentul de Calculatoare și Inginerie Electrică</a></li>");
            out.println("<li><a href=\"http://old.inginerie.ulbsibiu.ro/dep.iim/index.php?option=com_content\"; target=\"_blank\">Departamentul de Inginerie Industrială și Management</a></li>");
            out.println("<li><a href=\"http://old.inginerie.ulbsibiu.ro/dep.mei/ro/\"; target=\"_blank\">Departamentul de Mașini și Echipamente Industriale</a></li>");
            out.println("<li><a href=#>Departamentul IOSUD (în construcție)</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("<li><a href=\"#\">Bio</a>");
            out.println("<ul>");
            out.println("<li><a href=\"date.jsp\" >Date personale</a></li>");
            out.println("<li><a href=\"info.jsp\" >Alte informații</a></li>");
            out.println("<li><a href=\"domiciliu.jsp\" >Domiciliu</a></li>");
            out.println("<li><a href=\"liceale.jsp\" >Studii liceale</a></li>");
            out.println("<li><a href=\"universitare.jsp\" >Studii universitare</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("<li><a href=\"#\" >Înscriere</a>");
            out.println("<ul>");
            out.println("<li><a href=\"sesiuni.jsp\" >Sesiuni</a></li>");
            out.println("<li><a href=\"documente.jsp\" >Documente</a></li>");
            out.println("<li><a href=\"taxe.jsp\" >Plată taxe</a></li>");
            out.println("<li><a href=\"candidati.jsp\">Listă candidați</a></li>");
            out.println("<li><a href=\"finale.jsp\">Rezultate finale</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("<li><a href=\"#\" >Contul meu</a>");
            out.println("<ul>");
            out.println("<li><a href=\"/Admission-war/detaliicont\" >Detalii cont</a></li>");
            out.println("<li><a href=\"index.html\" >Log out</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("<li><a href=\"contact2.html\">Contact</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("<div id=clear></div>");
            out.println("<h2>"+ userSessionImpl.welcomeUser(name)+"</h2>");
            out.println("<p>Pașii de parcurs:</p>");
            out.println("<div id=lis>");
            out.println("<p><a href=\"date.jsp\" >1. Completezi Bio</a></p>");
            out.println("<p><a href=\"documente.jsp\" >2. Finalizezi Dosare</a></p>");
            out.println("<p><a href=\"taxe.jsp\" >3. Faci Plata</a></p>");
            out.println("<p><a href=\"#\" >4. Mergi la facultate</a></p>");
            out.println("</div>");
            out.println("</main>");
            out.println("<footer>");
            out.println("<p>Copyright &copy; 2017 I.C.E.</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
    }
}

