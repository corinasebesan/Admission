<%-- 
    Document   : taxe
    Created on : Dec 27, 2017, 3:47:40 PM
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
        <h2>Plată taxe</h2>
		<p>Pentru fiecare dosar poți achita individual taxa de înscriere sau poți selecta mai multe dosare finalizate pentru a le plăti împreună, </p>
                <p>într-o singură tranzacție.</p>
                <form action="plata" method="POST">
                <label>Selecteaza dosare: </label><br>
                <lable>Selecteaza modul de plată:</label>
                <select name="mod">
                    <option value="TCM">Card bancar</option>
                    <option value="MUSP">Virament bancar (ordin de plată)</option>
                    <option value="TTC">Cash(la facultate)</option>
                    </select><br>
                <input type="submit" value="Plateste">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
