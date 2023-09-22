<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/23/2023
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .container {
        width: 300px;
        margin: 0 auto; /* Căn giữa theo chiều ngang */
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f9f9f9;
    }

    form {
        display: flex;
        flex-direction: column;
    }
     label {
        font-weight: bold;
    }
</style>
<body>
<div class="container">
    <form action="/DisCountServlet" method="post">
        <label for="productDescription">Product Description:</label><br>
        <input type="text" id="productDescription" name="productDescription"><br>

        <label for="listPrice">List Price:</label><br>
        <input type="text" id="listPrice" name="listPrice"><br>

        <label for="discountPercent">Discount Percent:</label><br>
        <input type="text" id="discountPercent" name="discountPercent"><br>

        <input type="submit" value="Calculate Discount">
    </form>
</div>
</body>
</html>
