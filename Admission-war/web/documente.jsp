<%-- 
    Document   : documente
    Created on : Dec 27, 2017, 3:16:39 PM
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
                <li><a href="userPage.html">Acasă</a></li>
                <li><a href="http://inginerie.ulbsibiu.ro/" target="_blank">Site-ul facultății</a></li>
                <li><a href="#">Specializări</a>
                    <ul>
			<li><a href="listaSpecializari2.html">Listă specializări</a></li>
			<li><a href="http://csac.ulbsibiu.ro/" target="_blank">Departamentul de Calculatoare și Inginerie Electrică</a></li>
                        <li><a href="http://old.inginerie.ulbsibiu.ro/dep.iim/index.php?option=com_content" target="_blank">Departamentul de Inginerie Industrială și Management</a></li>
                        <li><a href="http://old.inginerie.ulbsibiu.ro/dep.mei/ro/" target="_blank">Departamentul de Mașini și Echipamente Industriale</a></li>
                        <li><a href=#>Departamentul IOSUD (în construcție)</a></li>
                    </ul>
                </li>
				<li><a href="#">Bio</a>
					<ul>
						<li><a href="date.jsp">Date personale</a></li>
						<li><a href="info.jsp">Alte informații</a></li>
						<li><a href="domiciliu.jsp">Domiciliu</a></li>
						<li><a href="liceale.jsp">Studii liceale</a></li>
						<li><a href="universitare.jsp">Studii universitare</a></li>
					</ul>
				</li>
				<li><a href="#">Înscriere</a>
					<ul>
						<li><a href="sesiuni.jsp">Sesiuni</a></li>
						<li><a href="documente.jsp">Documente</a></li>
						<li><a href="taxe.jsp">Plată taxe</a></li>
                                                <li><a href="candidati.jsp">Listă candidați</a></li>
						<li><a href="finale.jsp">Rezultate finale</a></li>
					</ul>
				</li>
                <li><a href="#">Contul meu</a>
                    <ul>
						<li><a href="/Admission-war/detaliicont">Detalii cont</a></li>
						<li><a href="index.html">Log out</a></li>
                    </ul>
                </li>
                <li><a href="contact2.html">Contact</a></li>
            </ul>
	</div>
	<div id=clear></div>
        <h2>Copii documente</h2>
		<p>Aici îți poți încărca copiile după documente.</p>
                <form action="documente" method="POST" enctype="multipart/form-data">
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
                <input type="submit" value="Trimite"/><br>
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
