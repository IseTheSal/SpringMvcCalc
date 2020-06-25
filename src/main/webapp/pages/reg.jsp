<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
${registration}
<form action="/reg" method="post">
    <input type="text" name="name">
    <input type="text" name="login">
    <input type="text" name="password">
    <button>Submit</button>
</form>
<a href="/main">Main</a>
</body>
</html>
