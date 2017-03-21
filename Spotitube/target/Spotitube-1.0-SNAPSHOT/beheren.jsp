<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spotitube Thijs Thijssen</title>
    </head>
    <body>
        <h1>Playlists</h1>
        <form action="BeherenController" method="POST">
            <div>
                <a href="#">25 onder de 50</a>
                <input type="button" value="Naam wijzigen" name="wijzigen">
                <input type="button" value="Track toevoegen" name="toevoegen">
                <input type="button" value="Verwijderen" name="verwijderen">
            </div>
            <br><br>
            <div>
                <a href="#">Coffe Club</a>
                <input type="button" value="Naam wijzigen" name="wijzigen">
                <input type="button" value="Track toevoegen" name="toevoegen">
                <input type="button" value="Verwijderen" name="verwijderen">
            </div>
            <br><br>
            <div>
                <a href="#">'n Goede Bui</a>
                <input type="button" value="Naam wijzigen" name="wijzigen">
                <input type="button" value="Track toevoegen" name="toevoegen">
                <input type="button" value="Verwijderen" name="verwijderen">
            </div>
            <br><br>
            <hr>
            <div>
                <p>Totale lengte: 3 uur en 25 minuten</p>
                <input type="button" value="Nieuwe Playlist" name="nieuwePlaylist">
                <input type="button" value="Zoek Track" name="zoekTrack">
                <a href="index">Terug naar index</a>
            </div>
        </form>
    </body>
</html>
