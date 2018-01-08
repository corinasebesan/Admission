<%-- 
    Document   : sesiuniAdmin
    Created on : Jan 8, 2018, 3:51:34 AM
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
        <h2>Sesiuni de admitere</h2>
		<p>Pentru fiecare sesiune de admitere la care dorești să te înscrii poți deschide un dosar unde vei putea configura opțiunile de </p>
		<p>admitere. Expandează sesiunile pentru a vedea ce facultăți participă în cadrul fiecăreia.</p>
                <form action="modificaresesiuni" method="POST">
                <label>Sesiunea: </label>
                <select name="sessions" required>
                    <option value="Vara">Sesiunea de vara</option>
                    <option value="Toamna">Sesiunea de toamna</option>
                </select><br>
                <label>Specializarea: </label>
                <select name="specialty" required>
                    <option value="TCM">Tehnologia construcțiilor de mașini</option>
                    <option value="MUSP">Mașini unelte și sisteme de producție</option>
                    <option value="TTC">Tehnologia tricotajelor și confecțiilor</option>
                    <option value="IEDM">Inginerie economică în domeniul mecanic</option>
                    <option value="IEI">Inginerie economică industrială</option>
                    <option value="C">Calculatoare</option>
                    <option value="TI">Tehnologia informației</option>
                    <option value="ISM">Ingineria sistemelor multimedia</option>
                    <option value="EM">Electromecanica</option>
                    <option value="EA">Electronica aplicată</option>
                    <option value="TDDH">Transportul, depozitarea și distribuția hidrocarburilor</option>
                    <option value="IPMI">Ingineria și protecția mediului în industrie</option>
                    <option value="ITT">Ingineria Transporturilor și a Traficului</option>
                    <option value="MEC">Mecatronică</option>
                    <option value="ROB">Robotică</option> 
                </select><br>
                <input type="submit" name="action" value="Schimbă">
                <input type="submit" name="action" value="Șterge">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
