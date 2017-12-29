<%-- 
    Document   : signup
    Created on : Dec 16, 2017, 3:58:18 PM
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
                <li><a href="index.html">Acasă</a></li>
                <li><a href="http://inginerie.ulbsibiu.ro/" target="_blank">Site-ul facultății</a></li>
                <li><a href="#" target="_blank">Specializări</a>
                    <ul>
			<li><a href="listaSpecializari.html" target="_blank">Listă specializări</a></li>
			<li><a href="http://csac.ulbsibiu.ro/" target="_blank">Departamentul de Calculatoare și Inginerie Electrică</a></li>
                        <li><a href="http://old.inginerie.ulbsibiu.ro/dep.iim/index.php?option=com_content" target="_blank">Departamentul de Inginerie Industrială și Management</a></li>
                        <li><a href="http://old.inginerie.ulbsibiu.ro/dep.mei/ro/" target="_blank">Departamentul de Mașini și Echipamente Industriale</a></li>
                        <li><a href=# target="_blank">Departamentul IOSUD (în construcție)</a></li>
                    </ul>
                </li>
                <li><a href="signup.jsp" target="_blank">Vreau cont</a></li>
                <li><a href="login.jsp" target="_blank">Conectează-te</a></li>
            </ul>
	</div>
	<div id=clear></div>
        <h2>Sign-up</h2>
        <p>Va rugam completati formularul de inscriere!</p>
        <form action="welcome" method="POST">
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
            <input type="submit" value="Sign-up">
        </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>

