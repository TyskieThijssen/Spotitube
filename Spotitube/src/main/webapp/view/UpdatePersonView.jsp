<%--
  Created by IntelliJ IDEA.
  User: Tyskie
  Date: 22-3-2017
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Person</title>
</head>
<body>
    <h1>Wijzig de gegevens van: ${oldName}</h1>
    <form action="updatePerson" method="POST">
        Name: <input type="text" name="name">
        <br><br>
        Age: <input type="text" name="age">
        <input type="hidden" value="${oldName}" name="naamPersoon">
        <br><br>
        <input type="submit" value="Update" name="update">
    </form>
</body>
</html>
