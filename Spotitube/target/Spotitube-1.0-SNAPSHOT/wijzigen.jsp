<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spotitube Thijs Thijssen</title>
    </head>
    <body>
        <div>
            <h1>Wijzigen Playlist</h1>
            <p>Naam <input type="text" placeholder="25 onder de 50"></p>
            <button>Bevestigen</button>
            <button>Annuleren</button>
            <a href="index">Terug naar index</a>
            <c:forEach persons="${doSomething}" var="current">
                <tr>
                    <td>
                        <c:out value="${current}"
                    </td>
                </tr>
            </c:forEach>
        </div>
    </body>
</html>
