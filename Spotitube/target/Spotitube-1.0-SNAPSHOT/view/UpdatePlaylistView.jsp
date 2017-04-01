<%--
  Created by IntelliJ IDEA.
  User: Tyskie
  Date: 24-3-2017
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spotitube</title>
</head>
<body>
    <h1>Wijzig de naam van ${name}</h1>
    <hr>
    <table>
        <thead>
            <th></th>
            <th></th>
        </thead>
        <tbody>
            <form action="updatePlaylist" method="POST">
                <tr>
                    <td>Nieuwe naam: </td>
                    <input type="hidden" value="${owner}" name="owner">
                    <input type="hidden" value="${name}" name="name">
                    <td><input type="text" name="newName"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Wijzig" name="wijzig"></td>
                </tr>
            </form>
        </tbody>
    </table>
</body>
</html>
