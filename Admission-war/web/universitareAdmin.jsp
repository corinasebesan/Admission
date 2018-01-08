<%-- 
    Document   : universitareAdmin
    Created on : Jan 8, 2018, 4:33:01 AM
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
        <h2>Studii universitare</h2>
                <form action="modificareuniversitare" method="POST">
                <input type="checkbox" name="nu" value="nu">Nu am absolvit alte studii universitare	
                <br/>
                <label>Județul: </label><input type="text" name="county"><br />
                <label>Universitatea: </label><input type="text" name="university"><br />
                <label>Domeniul: </label><input type="text" name="domain"><br />
                <label>Facultatea: </label><input type="text" name="faculty"><br />
                <label>Specializarea: </label><input type="text" name="specialty"><br />
                <label>Titlul obținut: </label><input type="text" name="title"><br />
                <label>Forma învățământ: </label>
                <select name="educational_form">
                    <option value=""></option>
                    <option value="Fără frecvență">Fără frecvență</option>
                    <option value="Învățământ la distanță">Învățământ la distanță</option>
                    <option value="Zi(cu frecvență)">Zi(cu frecvență)</option>
                    <option value="Seral">Seral</option>
                </select><br>
                <label>Forma financiară: </label>
                <select name="financial_form">
                    <option value=""></option>
                    <option value="Buget">Buget</option>
                    <option value="Bursă">Bursă</option>
                    <option value="Taxă CPL(Cont Propriu în Lei)">Taxă CPL(Cont Propriu în Lei)</option>
                </select><br>
                <label>Durata studii (ani): </label><input type="text" name="duration"><br />
                <label>Anul absolvirii: </label><input type="text" name="graduation"><br />
                <label>Medie examen licență: </label><input type="text" name="exam_average"><br />
                <label>Media anilor de studiu: </label><input type="text" name="years_average"><br />
                <p>Date identificare diplomă</p>
                <label>Tipul: </label>
                <select name="type">
                    <option value=""></option>
                    <option value="Act echivalent(studii străinătate)">Act echivalent(studii străinătate)</option>
                    <option value="Act recunoaștere diplomă(DGRIE/DGRED)">Act recunoaștere diplomă(DGRIE/DGRED)</option>
                    <option value="Adeverința absolvire(licență)">Adeverința absolvire(licență)</option>
                    <option value="Diplomă de licență">Diplomă de licență</option>
                    <option value="Diplomă de master">Diplomă de master</option>
                </select><br>
                <label>Emitent: </label><input type="text" name="issuer" ><br />
                <label>Seria: </label><input type="text" name="serie"><br />
                <label>Numărul: </label><input type="text" name="number"><br />
                <label>An emitere: </label><input type="text" name="issue_year"><br />
                <p>Supliment la diplomă/foaie matricolă care însoțește actul de studii</p>
                <label>Numărul: </label><input type="text" name="transcript_number"><br />
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
