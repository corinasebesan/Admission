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
        <h2>Studii universitare</h2>
                <form action="studiiuniv" method="POST">
                <input type="checkbox" name="nu" value="nu">Nu am absolvit alte studii universitare	
                <br/>
                <label>Județul: </label><input type="text" name="judetul"><br />
                <label>Universitatea: </label><input type="text" name="universitatea"><br />
                <label>Domeniul: </label><input type="text" name="domeniul"><br />
                <label>Facultatea: </label><input type="text" name="facultatea"><br />
                <label>Specializarea: </label><input type="text" name="specializarea"><br />
                <label>Titlul obținut: </label><input type="text" name="titlul"><br />
                <label>Forma învățământ: </label>
                <select name="formainv">
                    <option value=""></option>
                    <option value="farafrecventa">Fără frecvență</option>
                    <option value="ladistanta">Învățământ la distanță</option>
                    <option value="zi">Zi(cu frecvență)</option>
                    <option value="seral">Seral</option>
                </select><br>
                <label>Forma financiară: </label>
                <select name="formafin">
                    <option value=""></option>
                    <option value="buget">Buget</option>
                    <option value="bursa">Bursă</option>
                    <option value="cpl">Taxă CPL(Cont Propriu în Lei)</option>
                </select><br>
                <label>Durata studii (ani): </label><input type="text" name="durata"><br />
                <label>Anul absolvirii: </label><input type="text" name="anabs"><br />
                <label>Medie examen licență: </label><input type="text" name="medielicenta"><br />
                <label>Media anilor de studiu: </label><input type="text" name="medieani"><br />
                <p>Date identificare diplomă</p>
                <label>Tipul: </label>
                <select name="tipul">
                    <option value=""></option>
                    <option value="actechiv">Act echivalent(studii străinătate)</option>
                    <option value="actrecunoastere">Act recunoaștere diplomă(DGRIE/DGRED)</option>
                    <option value="adeverinta">Adeverința absolvire(licență)</option>
                    <option value="diplomalic">Diplomă de licență</option>
                    <option value="diplomamas">Diplomă de master</option>
                </select><br>
                <label>Emitent: </label><input type="text" name="emitent" required><br />
                <label>Seria: </label><input type="text" name="seria" required><br />
                <label>Numărul: </label><input type="text" name="numarul" required><br />
                <label>An emitere: </label><input type="text" name="anemiter" required><br />
                <p>Supliment la diplomă/foaie matricolă care însoțește actul de studii</p>
                <label>Numărul: </label><input type="text" name="numarmat"><br />
                <input type="submit" value="Adauga">
                <input type="reset">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
