
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<c:forEach items="${history}" var="item">
    <li>${item}</li>
</c:forEach>
<a href="/calculator">Back</a>
</body>
</html>
