
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<ul>
<form action="/auth" method="post">
    <input type="login" name = login>
    <input type="password" name = password>
    <button>Submit</button>
</form>
<a href="/main">Main</a>
</ul>
</body>
</html>
