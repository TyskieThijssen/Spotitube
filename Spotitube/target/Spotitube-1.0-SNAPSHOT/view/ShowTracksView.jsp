<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Track</title>
</head>
<body>
    <h1>Track toevoegen aan playlist: ${name}. Van owner: ${owner}</h1>
    <hr>
    <table border="1">
        <thead>
            <th>Title</th>
            <th>Performer</th>
            <th>Duration</th>
            <th>Album</th>
            <th>Playcount</th>
            <th>Publication Date</th>
            <th>Description</th>
        </thead>
        <tbody>
        <c:forEach items="${songs}" var="current">
            <form action="addTrackToPlaylist" method="POST">
                <tr>
                    <td><c:out value="${current.title}"/></td>
                    <td><c:out value="${current.performer}"/></td>
                    <td><c:out value="${current.duration}"/></td>
                    <td><c:out value="${current.album}"/></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <input type="hidden" value="${owner}" name="owner">
                    <input type="hidden" value="${name}" name="name">
                    <input type="hidden" value="${current.title}" name="title">
                    <td><input type="submit" value="Toevoegen aan playlist" name="addNumber"></td>
                </tr>
            </form>
        </c:forEach>
        <c:forEach items="${videos}" var="current">
            <form action="addTrackToPlaylist" method="POST">
                <tr>
                    <td><c:out value="${current.title}"/></td>
                    <td><c:out value="${current.performer}"/></td>
                    <td><c:out value="${current.duration}"/></td>
                    <td></td>
                    <td><c:out value="${current.playCount}"/></td>
                    <td><c:out value="${current.publicationDate}"/></td>
                    <td><c:out value="${current.description}"/></td>
                    <input type="hidden" value="${owner}" name="owner">
                    <input type="hidden" value="${name}" name="name">
                    <input type="hidden" value="${current.title}" name="title">
                    <td><input type="submit" value="Toevoegen aan playlist" name="addNumber"></td>
                </tr>
            </form>
        </c:forEach>
        </tbody>
    </table>
    <hr>
    <form action="searchTrack" method="POST">
        <input type="text" name="zoekTerm">
        <input type="hidden" value="${owner}" name="owner">
        <input type="hidden" value="${name}" name="name">
        <input type="submit" value="Zoek track" name="zoek">
        <input type="submit" formaction="showTracks" formmethod="GET" value="Toon alle tracks" name="showAll">
        <br>
        <input type="submit" formaction="playlists" formmethod="GET" value="Terug naar playlists" name="terug">
    </form>
</body>
</html>
