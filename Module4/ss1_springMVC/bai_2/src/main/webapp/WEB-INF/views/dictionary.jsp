<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/22/2023
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
</head>
<style>
    .search-form {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        text-align: center;
    }
    .search-form h2{
        text-align: center;
    }
    .search-form input[type="text"] {
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    .search-form input[type="submit"] {
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }
</style>
<body>
<form action="/translation" method="post" class="search-form">
    <h2>Vietnamese Dictionary</h2>

    <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type = "submit" id = "submit" value = "Search"/>
    <p>${word}</p>
</form>
</body>
</html>
