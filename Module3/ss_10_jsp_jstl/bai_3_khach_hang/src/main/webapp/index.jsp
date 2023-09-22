<%@ page import="model.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>

    <style>
        img {
            width: 100px;
            height: 100px;
        }

        td {
            width: 100px;
            height: 100px;
        }
    </style>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table border="1px">
    <tr>
        <th>Name</th>
        <th>Birthdate</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach items="${list}" var="customers" varStatus="loop">
        <tr>
            <td><c:out value="${customers.name}"/></td>
            <td><c:out value="${customers.date}"/></td>
            <td><c:out value="${customers.address}"/></td>
            <td><img src="${customers.picture}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>