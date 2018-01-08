<%-- 
    Document   : documenteAdmin
    Created on : Jan 8, 2018, 2:51:20 AM
    Author     : cory4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admitere online</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="still.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
		<h1>Admitere Facultatea de Inginerie</h1>
                <p class="italic">Învățătura este o comoară care își va urma proprietarul peste tot. Proverb chinezesc</p>
	</header>
        <main>
        <div id="nav">
             <ul>
                <li><a href="adminPage.html">Acasă</a></li>
                <li><a href="listaSpecializari3.html">Specializări</a>
                <li><a href="#">Bio</a>
                    <ul>
			<li><a href="dateAdmin.jsp">Date personale</a></li>
			<li><a href="infoAdmin.jsp">Alte informații</a></li>
			<li><a href="domiciliuAdmin.jsp">Domiciliu</a></li>
			<li><a href="licealeAdmin.jsp">Studii liceale</a></li>
			<li><a href="universitareAdmin.jsp">Studii universitare</a></li>
                    </ul>
		</li>
		<li><a href="#">Înscriere</a>
                    <ul>
			<li><a href="sesiuniAdmin.jsp">Sesiuni</a></li>
			<li><a href="documenteAdmin.jsp">Documente</a></li>
			<li><a href="taxeAdmin.jsp">Plată taxe</a></li>
                        <li><a href="candidati.jsp">Listă candidați</a></li>
			<li><a href="finale.jsp">Rezultate finale</a></li>
                    </ul>
				</li>
                <li><a href="#">Conturi utilizatori</a>
                    <ul>
			<li><a href="userAdmin.jsp">Modifica conturile utilizatorilor</a></li>
			<li><a href="index.html">Log out</a></li>
                    </ul>
                </li>
            </ul>
	</div>
	<div id=clear></div>
        <h2>Copii documente</h2>
		<p>Aici îți poți încărca copiile după documente.</p>
                <form action="modificadocumente" method="POST" enctype="multipart/form-data">
                <label>Tip: </label> 
                <select name="type" required>
                    <option value="Licenţă">Licenţă</option>
                    <option value="Master">Master</option>
                    <option value="Frecvenţa redusă(FR) şi la distanţă(ID)">Frecvenţa redusă(FR) şi la distanţă(ID)</option>
                </select><br>
                <label>Documente necesare pentru oricare tip: </label>
                <label>Diploma de BAC: </label>
                <input type="file" name="bac_diploma" required/><br>
                <label>Certificatul de naștere: </label>
                <input type="file" name="birth_certificate" required/><br>
                <label>Adeverință medicală: </label>
                <input type="file" name="medical_certificate" required/><br>
                <label>Carte de identitate: </label>
                <input type="file" name="id" required/><br>
                <label>Documente necesare numai pentru licenţă: </label>
                <label>Adeverinţă din care să rezulte calitatea de student integralist cu drept de înscriere la concursul de admitere/Diploma de absolvire a unei facultăţi(optional): </label>
                <input type="file" name="previous_college"/><br>
                <label>Documente necesare numai pentru master: </label>
                <label>Diploma de licență/absolvire: </label>
                <input type="file" name="bachelor_diploma"/><br>
                <label>Supliment diplomă/foaie matricolă/ situație școlară: </label>
                <input type="file" name="diploma_supplement"/><br>
                <label>Documente necesare numai pentru oricare frecvenţa redusă(FR) şi la distanţă(ID): </label>
                <label>Adeverinţă că este încadrat în muncă/ diplomă de absolvire/ licenţă: </label>
                <input type="file" name="previous_experience"/><br>
                <input type="submit" name="action" value="Schimbă">
                <input type="submit" name="action" value="Șterge">
                <input type="reset">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
