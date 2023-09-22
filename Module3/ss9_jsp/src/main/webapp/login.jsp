<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/23/2023
  Time: 7:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .login {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        width: 300px;
        padding: 20px;
        background-color: #f2f2f2;
        border-radius: 5px;
    }

    .login h2 {
        text-align: center;
    }

    .login label {
        display: block;
        margin-bottom: 10px;
    }

    .login input[type="text"], .login input[type="password"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    .login input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }
</style>
<body>
<form method="post" action="/LoginServlet">
    <div class="login">
        <h2>Login</h2>
        <label>
            <input type="text" name="username" size="26" placeholder="UserName">
        </label>
        <label>
            <input type="text" name="password" size="26" placeholder="PassWord">
        </label>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>
