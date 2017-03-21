<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View all persons</title>
</head>
<body>
    <form action="deletePerson" method="POST">
        <table>
            <thead>
                <th>Name</th>
                <th>Age</th>
            </thead>
            <tbody>
            <c:forEach items="${persons}" var="current">
                <tr>
                    <td>
                        <c:out value="${current.name}"/>
                    </td>
                    <td>
                        <c:out value="${current.age}"/>
                    </td>
                    <td>
                        <input type="hidden" value="${current.name}" name="verwijderPersoon">
                        <input type="submit" value="Verwijderen" name="verwijderen">
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </form>
    <br>
    <a href="addPerson">Add a person</a>
    <br>
    <a href="index">Back to home</a>
</body>
</html>
