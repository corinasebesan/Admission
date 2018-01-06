/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import entity.CountDetails;
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
@WebServlet(name = "DetailsServlet", urlPatterns = {"/detaliicont"})
public class DetailsServlet extends HttpServlet {

    @EJB
    private UserSession userSessionImpl;
     
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request,  response);
        
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request,  response);
        
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        CountDetails cd1 = new CountDetails(1,"Date personale", "Nu exista");
        CountDetails cd2 = new CountDetails(2,"Alte informatii", "Nu exista");
        CountDetails cd3 = new CountDetails(3,"Domiciliu", "Nu exista");
        CountDetails cd4 = new CountDetails(4,"Studii liceale", "Nu exista");
        CountDetails cd5 = new CountDetails(5,"Studii universitare", "Nu exista");
        CountDetails cd6 = new CountDetails(6,"Documente", "Nu exista");
        CountDetails cd7 = new CountDetails(7,"Taxa", "Nu exista");
        userSessionImpl.addCountDetails(cd1);
        userSessionImpl.addCountDetails(cd2);
        userSessionImpl.addCountDetails(cd3);
        userSessionImpl.addCountDetails(cd4);
        userSessionImpl.addCountDetails(cd5);
        userSessionImpl.addCountDetails(cd6);
        userSessionImpl.addCountDetails(cd7);
        
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
            out.println("<li><a href=\"contact2.html\">Contact</a></li>");
            out.println("</li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("<div id=clear></div>");
            out.println("<h2>Ce ați completat până acum:</h2>");
            out.println("<div id=lis>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>"+cd1.getForm()+"</td>");
            out.println("<td>"+cd1.getExist()+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+cd2.getForm()+"</td>");
            out.println("<td>"+cd2.getExist()+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+cd3.getForm()+"</td>");
            out.println("<td>"+cd3.getExist()+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+cd4.getForm()+"</td>");
            out.println("<td>"+cd4.getExist()+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+cd5.getForm()+"</td>");
            out.println("<td>"+cd5.getExist()+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+cd6.getForm()+"</td>");
            out.println("<td>"+cd6.getExist()+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+cd7.getForm()+"</td>");
            out.println("<td>"+cd7.getExist()+"</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<p>Pot fi completate până la data de:</p>");
            out.println("<p>Examenul are loc pe data de:</p>");
            out.println("<p>Rezultatele finale se vor afișa pe data de:</p>");
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
