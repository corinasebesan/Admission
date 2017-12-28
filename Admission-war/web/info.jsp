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
						<li><a href="detaliiCont.html" target="_blank">Detalii cont</a></li>
						<li><a href="index.html" target="_blank">Log out</a></li>
                    </ul>
                </li>
            </ul>
	</div>
	<div id=clear></div>
        <h2>Alte informații</h2>
                <form action="informatii" method="POST">
                <label>Starea civilă: </label>
                <select name="stareacivila" required>
                    <option value="casatorit">Căsătorit(ă)</option>
                    <option value="divortat">Divorțat(ă)</option>
                    <option value="necasatorit">Necăsătorit(ă)</option>
                    <option value="vaduv">Văduv(ă)</option>
                </select><br/>
                <label>Naționalitatea: </label>
                <select name="nationalitatea" required>
                    <option value="alta">Altă naționalitate</option>
                    <option value="romana">Română</option>
                </select><br/>
                <label>Etnia: </label><input type="text" name="etnie" required><br />
                <label>Cetățenia: </label>
                <select name="cetatenia">
                    <option value=""></option>
                    <option value="alta">Română cu domiciliu în România</option>
                    <option value="romana">Română cu domiciliu în străinătate</option>
                </select><br/>
                <label>Altă cetățenie(opțional): </label><input type="text" name="altacetatenie"><br />
                <label>Cetățenie anterioară(opțional): </label><input type="text" name="cetatenieant"><br />
                <label>Stare socială specială(opțional): </label>
                <select name="staresocialaspeciala">
                    <option value=""></option>
                    <option value="alta">Alte situații</option>
                    <option value="orfanambii">Orfan de ambii părinți</option>
                    <option value="orfanunul">Orfan de unul dintre părinți</option>
                    <option value="casedecopii">Provenit din case de copii</option>
                    <option value="monoparental">Provenit din familie monoparentală</option>
                </select><br/>
                <label for="dizabilitati">Situație dizabilități(opțional)</label>
                    <input type="checkbox" name="dizabilitati0" value="dizabilitati"> (candidat ce se încadrează în categoria persoanelor cu dizabilități)	
                    <br/>
                <input type="submit" value="Adauga">
                <input type="reset">
                </form>
    </main>
    <footer>
	<p>Copyright &copy; 2017 I.C.E.</p>  
    </footer>
    </body>
</html>
