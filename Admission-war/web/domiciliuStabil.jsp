<%-- 
    Document   : domiciliuStabil
    Created on : Dec 27, 2017, 1:50:52 AM
    Author     : cory4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stil.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Domiciliu stabil</h1>
        <form action ="" method="POST">
            <label>Judetul: </label><input type="text" name="judet"><br />
            <label>Localitatea: </label><input type="text" name="localitate"><br />
            <label>Cod postal: </label><input type="text" name="codPostal"><br />
            <label>Strada: </label><input type="text" name="strada"><br />
            <label>Numarul: </label><input type="text" name="numar"><br />
            <label>Blocul: </label><input type="text" name="bloc"><br />
            <label>Scara: </label><input type="text" name="scara"><br />
            <label>Etajul: </label><input type="text" name="etaj"><br />
            <label>Apartamentul: </label><input type="text" name="apartament"><br />
            <input type="submit" value="Salveaza">
        </form>
        <h1>Studii liceale</h1>
        <form action ="" method="POST">
            <label>Judetul: </label><input type="text" name="judet"><br />
            <label>Liceul absolvit: </label><input type="text" name="liceu"><br />
            <label>Profilul: </label><input type="text" name="profil"><br />
            <label>Forma invatamant: </label><input type="text" name="invatamant"><br />
            <label>Durata studii (ani): </label><input type="text" name="durataStudii"><br />
            <label>Anul absolvirii: </label><input type="text" name="anAbsolvire"><br />
            <label>Medie liceu: </label><input type="text" name="medie"><br />
            <label>Anul bacalaureatului: </label><input type="text" name="AnBac"><br />
            <label>Media BAC: </label><input type="text" name="medieBAC"><br />
            <h2>Date identificare diploma</h2>
            <label>Tipul: </label><input type="text" name="tipDiploma"><br />
            <label>Emitent: </label><input type="text" name="emitent"><br />
            <label>Seria: </label><input type="text" name="serieDiploma"><br />
            <label>Numarul: </label><input type="text" name="numarDiploma"><br />
            <label>An emitere: </label><input type="text" name="anEmitere"><br />
            <label>Nr. foaie matricola: </label><input type="text" name="foaieMatricola"><br />
            <input type="submit" value="Salveaza">
        </form>
    </body>
</html>
