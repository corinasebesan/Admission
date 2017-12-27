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
		<h1>Admitere...</h1>
                <p class="italic">Învățătura este o comoară care își va urma proprietarul peste tot. Proverb chinezesc</p>
	</header>
        <main>
        <div id="nav">
            <ul>
                <li><a href="index.html">Acasă</a></li>
                <li><a href="http://inginerie.ulbsibiu.ro/" target="_blank">Site-ul facultății</a></li>
                <li><a href="listaSpecializari.html" target="_blank">Listă specializări</a></li>
                <li><a href="signup.jsp" target="_blank">Vreau cont</a></li>
            </ul>
	</div>
	<div id=clear></div>
        <h2>Sign-up</h2>
        <p>Va rugam completati formularul de inscriere!</p>
        <form action="welcome" method="POST">
            <label>Ma inscriu la: </label>
                <select name="reference">
                    <option value="Licenta">Licenta</option>
                    <option value="Master">Master</option>
                </select><br>
            <label>Nume: </label><input type="text" name="name"><br />
            <label>Prenume: </label><input type="text" name="surname"><br />
            <label>Adresa de email: </label><input type="email" name="email"><br />
            <label>Parola: </label><input type="password" name="password"><br />
            <label>CNP: </label><input type="text" name="cnp"><br />
            <label>Numarul de telefon: </label><input type="text" name="phone"><br />
            <input type="submit" value="Sign-up">
        </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>

