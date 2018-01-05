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
                <li><a href="#" target="_blank">Specializări</a>
                    <ul>
			<li><a href="listaSpecializari2.html" target="_blank">Listă specializări</a></li>
			<li><a href="http://csac.ulbsibiu.ro/" target="_blank">Departamentul de Calculatoare și Inginerie Electrică</a></li>
                        <li><a href="http://old.inginerie.ulbsibiu.ro/dep.iim/index.php?option=com_content" target="_blank">Departamentul de Inginerie Industrială și Management</a></li>
                        <li><a href="http://old.inginerie.ulbsibiu.ro/dep.mei/ro/" target="_blank">Departamentul de Mașini și Echipamente Industriale</a></li>
                        <li><a href=# target="_blank">Departamentul IOSUD (în construcție)</a></li>
                    </ul>
                </li>
				<li><a href="#" target="_blank">Bio</a>
					<ul>
						<li><a href="date.jsp" target="_blank">Date personale</a></li>
						<li><a href="info.jsp" target="_blank">Alte informații</a></li>
						<li><a href="domiciliu.jsp" target="_blank">Domiciliu</a></li>
						<li><a href="liceale.jsp" target="_blank">Studii liceale</a></li>
						<li><a href="universitare.jsp" target="_blank">Studii universitare</a></li>
					</ul>
				</li>
				<li><a href="#" target="_blank">Înscriere</a>
					<ul>
						<li><a href="sesiuni.jsp" target="_blank">Sesiuni</a></li>
						<li><a href="dosare.jsp" target="_blank">Dosarele mele</a></li>
						<li><a href="documente.jsp" target="_blank">Documente</a></li>
						<li><a href="taxe.jsp" target="_blank">Plată taxe</a></li>
					</ul>
				</li>
                <li><a href="#" target="_blank">Contul meu</a>
                    <ul>
						<li><a href="/Admission-war/detaliicont" target="_blank">Detalii cont</a></li>
						<li><a href="index.html" target="_blank">Log out</a></li>
                    </ul>
                </li>
            </ul>
	</div>
	<div id=clear></div>
        <h2>Copii documente</h2>
		<p>Aici îți poți încărca copiile după documente.</p>
                <p>Licenta:</p>
                <form action="adddoc" method="POST" enctype="multipart/form-data">
                <label>Diploma de BAC: </label>
                <input type="file" name="bac" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Certificatul de naștere: </label>
                <input type="file" name="nastere" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Adeverință medicală: </label>
                <input type="file" name="medical" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Carte de identitate: </label>
                <input type="file" name="identitate" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Adeverinţă din care să rezulte calitatea de student integralist cu drept de înscriere la concursul de admitere/Diploma de absolvire a unei facultăţi(optional): </label>
                <input type="file" name="adeverinta" required/>
                <input type="submit" value="Trimite"/><br>
                </form>
                <p>Master:</p>
                <form action="adddoc" method="POST" enctype="multipart/form-data">
                <label>Diploma de BAC: </label>
                <input type="file" name="bac" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Diploma de licență/absolvire: </label>
                <input type="file" name="licenta" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Supliment diplomă/foaie matricolă/ situație școlară: </label>
                <input type="file" name="supliment" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Certificatul de naștere: </label>
                <input type="file" name="nastere" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Adeverință medicală: </label>
                <input type="file" name="medical" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Carte de identitate: </label>
                <input type="file" name="identitate" required/>
                <input type="submit" value="Trimite"/><br>
                </form>
                <p>Frecvenţa redusă(FR) şi la distanţă(ID):</p>
                <form action="adddoc" method="POST" enctype="multipart/form-data">
                <label>Diploma de BAC: </label>
                <input type="file" name="bac" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Certificatul de naștere: </label>
                <input type="file" name="nastere" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Adeverinţă că este încadrat în muncă/ diplomă de absolvire/ licenţă: </label>
                <input type="file" name="licenta" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Adeverință medicală: </label>
                <input type="file" name="medical" required/>
                <input type="submit" value="Trimite"/><br>
                <label>Carte de identitate: </label>
                <input type="file" name="identitate" required/>
                <input type="submit" value="Trimite"/><br>
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
