<%--
  Created by IntelliJ IDEA.
  User: Thijs
  Date: 21-3-2017
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Person</title>
</head>
<body>
    <form action="addPerson" method="POST">
        <p>Name: </p>
        <br>
        <input type="text" name="name">
        <p>Age:</p>
        <br>
        <input type="text" name="age">
        <br>
        <input type="submit" value="Add" name="submit">
    </form>
</body>
</html>
