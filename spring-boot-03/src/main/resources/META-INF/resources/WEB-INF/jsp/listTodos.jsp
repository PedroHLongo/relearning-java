<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
    <head>
        <title>Welcome</title>
    </head>
    <body>
        <div>Welcome ${username}!</div>
        <hr>
        <h1>Your todos are</h1>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>Description></th>
                    <th>Target Date></th>
                    <th>Done?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>