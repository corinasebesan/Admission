<%-- 
    Document   : info
    Created on : Dec 27, 2017, 10:59:53 PM
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
        <h2>Alte informații</h2>
                <form action="alteinformatii" method="POST">
                <label>Starea civilă: </label>
                <select name="civil_state" required>
                    <option value="Căsătorit(ă)">Căsătorit(ă)</option>
                    <option value="Divorțat(ă)">Divorțat(ă)</option>
                    <option value="Necăsătorit(ă)">Necăsătorit(ă)</option>
                    <option value="Văduv(ă)">Văduv(ă)</option>
                </select><br/>
                <label>Naționalitatea: </label>
                <select name="nationality" required>
                    <option value="Altă naționalitate">Altă naționalitate</option>
                    <option value="Română">Română</option>
                </select><br/>
                <label>Etnia: </label><input type="text" name="ethnicity" required><br />
                <label>Cetățenia: </label>
                <select name="citizenship">
                    <option value=""></option>
                    <option value="Română cu domiciliu în România">Română cu domiciliu în România</option>
                    <option value="Română cu domiciliu în străinătate">Română cu domiciliu în străinătate</option>
                </select><br/>
                <label>Altă cetățenie(opțional): </label><input type="text" name="ocitizenship"><br />
                <label>Cetățenie anterioară(opțional): </label><input type="text" name="previous_citizenship"><br />
                <label>Stare socială specială(opțional): </label>
                <select name="special_social">
                    <option value=""></option>
                    <option value="Alte situații">Alte situații</option>
                    <option value="Orfan de ambii părinți">Orfan de ambii părinți</option>
                    <option value="Orfan de unul dintre părinți">Orfan de unul dintre părinți</option>
                    <option value="Provenit din case de copii">Provenit din case de copii</option>
                    <option value="Provenit din familie monoparentală">Provenit din familie monoparentală</option>
                </select><br/>
                <label for="handicaped">Situație dizabilități(opțional)</label>
                    <input type="checkbox" name="handicaped0" value="Dizabilitati"> (candidat ce se încadrează în categoria persoanelor cu dizabilități)	
                    <br/>
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
