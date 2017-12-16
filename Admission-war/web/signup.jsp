<%-- 
    Document   : signup
    Created on : Dec 16, 2017, 3:58:18 PM
    Author     : cory4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bine ati venit!</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Sign-up</h1>
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
    </body>
</html>

