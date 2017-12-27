<%-- 
    Document   : sesiuni
    Created on : Dec 27, 2017, 2:02:23 PM
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
                <li><a href="listaSpecializari.html" target="_blank">Listă specializări</a></li>
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
                <li><a href="detaliiCont.html" target="_blank">Contul meu</a></li>
            </ul>
	</div>
	<div id=clear></div>
        <h2>Sesiuni de admitere</h2>
		<p>Pentru fiecare sesiune de admitere la care dorești să te înscrii poți deschide un dosar unde vei putea configura opțiunile de </p>
		<p>admitere. Expandează sesiunile pentru a vedea ce facultăți participă în cadrul fiecăreia.</p>
                <form action="adddos" method="POST">
                <label>Sesiunea: </label>
                <select name="sesiune">
                    <option value="Vara">Sesiunea de vara</option>
                    <option value="Toamna">Sesiunea de toamna</option>
                </select><br>
                <label>Specializarea: </label>
                <select name="sesiune">
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
                <input type="submit" value="Adauga">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
