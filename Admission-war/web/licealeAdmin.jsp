<%-- 
    Document   : licealeAdmin
    Created on : Jan 8, 2018, 3:44:09 AM
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
        <h2>Studii liceale</h2>
                <form action="modificareliceu" method="POST">
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

