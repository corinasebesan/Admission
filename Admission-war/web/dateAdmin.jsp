<%-- 
    Document   : dateAdmin
    Created on : Jan 7, 2018, 10:45:47 PM
    Author     : cory4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h2>Date personale</h2>
                <form action="modificaredatepersonale" method="POST">
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
                <input type="submit" name="action" value="Schimbă">
                <input type="submit" name="action" value="Șterge">
                <input type="reset">
                </form>
                <br>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
