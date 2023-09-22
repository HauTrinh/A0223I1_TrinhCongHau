<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/CacularServlet" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2">
    <button type="submit">Click me!</button>
</form>
Result: ${kq} <br>
<a href="/ServerTimeServlet">ShowTime </a> <br>
<a href="/hello-servlet">Login</a> <br>
<a href="/hello-servlet">Translate</a> <br>
<a href="/hello-servlet">Discount</a> <br>




</body>
</html>