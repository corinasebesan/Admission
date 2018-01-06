<%-- 
    Document   : date
    Created on : Dec 27, 2017, 9:50:10 PM
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
        <h2>Date personale</h2>
                <form action="datepersonale" method="POST">
                <label>Nume: </label><input type="text" name="name" required><br />
                <label>Prenume: </label><input type="text" name="surname" required><br />
                <label>Inițiala tatălui: </label><input type="text" name="father" required><br />
                <label>Nume anterior căsătorie(opțional): </label><input type="text" name="previous_name"><br />
                <label>Sexul: </label>
                <select name="sex" required>
                    <option value="Feminin">Feminin</option>
                    <option value="Masculin">Masculin</option>
                </select><br>
                <label>Data nașterii: </label><input type="date" name="birthdate" required><br />
                <label>Județul: </label><input type="text" name="county" required><br />
                <label>Localitatea: </label><input type="text" name="city" required><br />
                <label>CNP: </label><input type="text" name="cnp" required><br />
                <label>Seria: </label><input type="text" name="serie" required><br />
                <label>Numărul: </label><input type="text" name="number" required><br />
                <label>Emis de: </label><input type="text" name="issued_by" required><br />
                <label>Emis la: </label><input type="date" name="issued_at" required><br />
                <label>Expiră la: </label><input type="date" name="expires_at" required><br />
                <input type="submit" value="Adauga">
                <input type="reset">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
