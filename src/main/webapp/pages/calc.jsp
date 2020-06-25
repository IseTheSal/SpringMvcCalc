
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<form action="/calculator" method="post">
    <input type="text" name = "num1">
    <input type="text" name = "num2">
    <input type="text" name = "op">
    <button>Calc</button>
</form>
<body>
Answer = ${result}

</body>
<body>
<a href="/history">Show history</a>
<a href="/logout">Logout</a>
</body>
</html>
