<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<form action="/calculator" method="post">
    <input type="text" name="num1">
    <select name="op">
        <option disabled>Enter operation</option>
        <option value="plus"> + </option>
        <option value="minus"> - </option>
        <option value="power"> * </option>
        <option value="divide"> / </option>
    </select>
    <input type="text" name="num2">
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
