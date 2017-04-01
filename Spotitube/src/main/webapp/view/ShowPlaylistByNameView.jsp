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
    <h1>Playlist ${name} van: ${owner}!</h1>
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
                <tr>
                    <td><c:out value="${current.title}"/></td>
                    <td><c:out value="${current.performer}"/></td>
                    <td><c:out value="${current.duration}"/></td>
                    <td><c:out value="${current.album}"/></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </c:forEach>
            <c:forEach items="${videos}" var="current">
                <tr>
                    <td><c:out value="${current.title}"/></td>
                    <td><c:out value="${current.performer}"/></td>
                    <td><c:out value="${current.duration}"/></td>
                    <td></td>
                    <td><c:out value="${current.playCount}"/></td>
                    <td><c:out value="${current.publicationDate}"/></td>
                    <td><c:out value="${current.description}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <hr>
    <form action="showTracks">
        <input type="hidden" value="${owner}" name="owner">
        <input type="hidden" value="${name}" name="name">
        <input type="submit" value="Nummer toevoegen" name="addNumber">
        <a href="home">Terug naar index pagina</a>
    </form>
</body>
</html>
