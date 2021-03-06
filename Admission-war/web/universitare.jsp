<%-- 
    Document   : universitare
    Created on : Dec 27, 2017, 11:40:34 PM
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
        <h2>Studii universitare</h2>
                <form action="studiiuniversitare" method="POST">
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
                <input type="submit" name="action" value="Adauga">
                <input type="submit" name="action" value="Schimbă">
                <input type="reset">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
