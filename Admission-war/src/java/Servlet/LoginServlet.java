/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Servlet;
import session.UserSession;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
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
     
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String name=userSessionImpl.getNameByEmailAndPassword(email, password);
        
        
        try {
            if(name!="")
        {
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
            out.println("<li><a href=\"#\" target=\"_blank\">Specializări</a>");
            out.println("<ul>");
            out.println("<li><a href=\"listaSpecializari2.html\" target=\"_blank\">Listă specializări</a></li>");
            out.println("<li><a href=\"http://csac.ulbsibiu.ro/\"; target=\"_blank\">Departamentul de Calculatoare și Inginerie Electrică</a></li>");
            out.println("<li><a href=\"http://old.inginerie.ulbsibiu.ro/dep.iim/index.php?option=com_content\"; target=\"_blank\">Departamentul de Inginerie Industrială și Management</a></li>");
            out.println("<li><a href=\"http://old.inginerie.ulbsibiu.ro/dep.mei/ro/\"; target=\"_blank\">Departamentul de Mașini și Echipamente Industriale</a></li>");
            out.println("<li><a href=# target=\"_blank\">Departamentul IOSUD (în construcție)</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("<li><a href=\"#\" target=\"_blank\">Bio</a>");
            out.println("<ul>");
            out.println("<li><a href=\"date.jsp\" target=\"_blank\">Date personale</a></li>");
            out.println("<li><a href=\"info.jsp\" target=\"_blank\">Alte informații</a></li>");
            out.println("<li><a href=\"domiciliu.jsp\" target=\"_blank\">Domiciliu</a></li>");
            out.println("<li><a href=\"liceale.jsp\" target=\"_blank\">Studii liceale</a></li>");
            out.println("<li><a href=\"universitare.jsp\" target=\"_blank\">Studii universitare</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("<li><a href=\"#\" target=\"_blank\">Înscriere</a>");
            out.println("<ul>");
            out.println("<li><a href=\"sesiuni.jsp\" target=\"_blank\">Sesiuni</a></li>");
            out.println("<li><a href=\"dosare.jsp\" target=\"_blank\">Dosarele mele</a></li>");
            out.println("<li><a href=\"documente.jsp\" target=\"_blank\">Documente</a></li>");
            out.println("<li><a href=\"taxe.jsp\" target=\"_blank\">Plată taxe</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("<li><a href=\"#\" target=\"_blank\">Contul meu</a>");
            out.println("<ul>");
            out.println("<li><a href=\"detaliiCont.html\" target=\"_blank\">Detalii cont</a></li>");
            out.println("<li><a href=\"index.html\" target=\"_blank\">Log out</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("<div id=clear></div>");
            out.println("<h2>"+ userSessionImpl.welcomeUser(name)+"</h2>");
            out.println("<p>Pașii de parcurs:</p>");
            out.println("<div id=lis>");
            out.println("<p><a href=\"date.jsp\" target=\"_blank\">1. Completezi Bio</a></p>");
            out.println("<p><a href=\"dosare.jsp\" target=\"_blank\">2. Finalizezi Dosare</a></p>");
            out.println("<p><a href=\"taxe.jsp\" target=\"_blank\">3. Faci Plata</a></p>");
            out.println("<p><a href=\"#\" target=\"_blank\">4. Mergi la facultate</a></p>");
            out.println("</div>");
            out.println("</main>");
            out.println("<footer>");
            out.println("<p>Copyright &copy; 2017 I.C.E.</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
        }
        finally{
            out.close();
        }
    }
}

