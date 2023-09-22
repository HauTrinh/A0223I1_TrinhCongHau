<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/22/2023
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calcultor</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="post">
    <label for="usd">Enter a mount of dollar:</label>
    <input name="usd" id="usd" type="number"> <br/>
    <input type="submit" value="Change">
    <label>VND: ${vnd}</label> <br/>
</form>
</body>
</html>
