<%--
  Created by IntelliJ IDEA.
  User: Tyskie
  Date: 24-3-2017
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spotitube</title>
</head>
<body>
    <h1>Voeg een playlist toe!</h1>
    <form action="addPlaylist" method="POST">
        <table>
            <thead>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                <tr>
                    <td>Owner: </td>
                    <td><input type="text" name="owner"></td>
                </tr>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Voeg toe" name="add"></td>
                </tr>
            </tbody>
        </table>
    </form>
</body>
</html>
