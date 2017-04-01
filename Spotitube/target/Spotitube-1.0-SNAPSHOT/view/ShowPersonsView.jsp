<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View all persons</title>
</head>
<body>
    <table>
        <thead>
        <th>Name</th>
        <th>Age</th>
        </thead>
    <c:forEach items="${persons}" var="current">
        <form action="handlePersons" method="POST">
                <tbody>
                    <tr>
                        <td><c:out value="${current.name}"/></td>
                        <td><c:out value="${current.age}"/></td>
                        <input type="hidden" value="${current.name}" name="naamPersoon">
                        <td><input formaction="handlePersons" type="submit" value="Verwijderen" name="verwijderen"></td>
                        <td><input formaction="updatePerson" type="submit" value="Update" name="update"></td>
                    </tr>
                </tbody>
        </form>
    </table>
    </c:forEach>
    <br>
    <a href="addPerson">Add a person</a>
    <br>
    <a href="index">Back to home</a>
</body>
</html>
