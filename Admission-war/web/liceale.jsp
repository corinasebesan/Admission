<%-- 
    Document   : liceale
    Created on : Dec 27, 2017, 11:40:02 PM
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
        <h2>Studii liceale</h2>
                <form action="studiiliceale" method="POST">
                <label>Județul: </label><input type="text" name="highschool_county" required><br />
                <label>Liceul absolvit: </label><input type="text" name="graduated_highschool" required><br />
                <label>Profilul: </label><input type="text" name="section" placeholder="Nume profil, filiera, tip profil" required><br />
                <label>Forma învățământ: </label>
                <select name="form" required>
                    <option value="Fără frecvență">Fără frecvență</option>
                    <option value="Învățământ la distanță">Învățământ la distanță</option>
                    <option value="Zi(cu frecvență)">Zi(cu frecvență)</option>
                    <option value="Seral">Seral</option>
                </select><br/>
                <label>Durata studii (ani): </label><input type="text" name="duration" required><br />
                <label>Anul absolvirii: </label><input type="text" name="graduation" required><br />
                <label>Media liceu: </label><input type="text" name="highschool_average" required><br />
                <label>Anul bacalaureatului: </label><input type="text" name="bac_year" required><br />
                <label>Media BAC: </label><input type="text" name="bac_average" required><br />
                <p>Date identificare diplomă</p>
                <label>Tipul: </label>
                <select name="type" required>
                    <option value="Act echivalent(studii străinătate)">Act echivalent(studii străinătate)</option>
                    <option value="Act recunoaștere diplomă(DGRIE/DGRED)">Act recunoaștere diplomă(DGRIE/DGRED)</option>
                    <option value="Adeverința de bacalaureat">Adeverința de bacalaureat</option>
                    <option value="Diplomă de bacalaureat">Diplomă de bacalaureat</option>
                </select><br/>
                <label>Emitent: </label><input type="text" name="issuer" required><br />
                <label>Seria: </label><input type="text" name="diploma_serie" required><br />
                <label>Numărul: </label><input type="text" name="diploma_number" required><br />
                <label>An emitere: </label><input type="text" name="issue_year" required><br />
                <label>Nr. foaie matricolă: </label><input type="text" name="transcript_number" required><br />
                <input type="submit" value="Adauga">
                <input type="reset">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
