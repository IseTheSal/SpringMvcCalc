<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<ul>
    <a href="/auth">Authorization</a>
    <a href="/reg">Registration</a>

    <c:if test="${sessionScope.authCheck}">
        <a href="/calculator">Calculate</a>
        <a href="/logout">Logout</a>
    </c:if>
</ul>
</body>


</html>
