<%--
  Created by IntelliJ IDEA.
  User: Tyskie
  Date: 24-3-2017
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spotitube</title>
</head>
<body>
    <h1>Alle Playlists!</h1>
    <hr>
    <table border="1">
        <thead>
            <th>Owner</th>
            <th>Name</th>
        </thead>
        <tbody>
            <c:forEach items="${playlist}" var="current">
                <form action="" method="POST">
                    <tr>
                        <td><c:out value="${current.owner}"/></td>
                        <td><c:out value="${current.name}"/></td>
                        <input type="hidden" value="${current.owner}" name="owner">
                        <input type="hidden" value="${current.name}" name="name">
                        <td><input formaction="showPlaylistByName" formmethod="GET" type="submit" value="Bekijk tracks" name="showTracks"></td>
                        <td><input formaction="updatePlaylist" formmethod="GET" type="submit" value="Naam wijzigen" name="update"></td>
                        <td><input formaction="deletePlaylist" type="submit" value="Verwijder" name="verwijder"></td>
                        <td><input formaction="showPlaylistsByOwner" formmethod="GET" type="submit" value="Bekijk playlists van owner" name="showTracksByOwner"></td>
                    </tr>
                </form>
            </c:forEach>
        </tbody>
    </table>
    <hr>
    <form action="addPlaylist" method="GET">
        <input type="submit" value="Playlist toevoegen" name="toevoegen">
        <a href="home">Terug naar index pagina</a>
    </form>
</body>
</html>
