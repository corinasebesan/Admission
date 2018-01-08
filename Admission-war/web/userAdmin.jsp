<%-- 
    Document   : userAdmin
    Created on : Jan 8, 2018, 4:13:10 AM
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
        <h2>Sign-up</h2>
        <p>Va rugam completati formularul de inscriere!</p>
        <form action="modificareuser" method="POST">
            <label>Ma inscriu la: </label>
                <select name="purpose" required>
                    <option value="Licenta">Licenta</option>
                    <option value="Master">Master</option>
                </select><br>
            <label>Nume: </label><input type="text" name="name" required><br />
            <label>Prenume: </label><input type="text" name="surname" required><br />
            <label>Adresa de email: </label><input type="email" name="email" required><br />
            <label>Parola: </label><input type="password" name="password" required><br />
            <label>CNP: </label><input type="text" name="cnp" required><br />
            <label>Numarul de telefon: </label><input type="tel" name="phone" required><br />
            <input type="submit" name="action" value="Schimbă">
            <input type="submit" name="action" value="Șterge">
        </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
