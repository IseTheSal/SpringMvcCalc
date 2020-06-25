<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<form action="/calculator" method="post">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <input type="text" name="op">
    <button>Calc</button>
</form>
<body>
Answer = ${result}

</body>

<br/>
<a href="/history">Show history</a>
<br/>
<a href="/main">Main</a>


</body>
</html>
