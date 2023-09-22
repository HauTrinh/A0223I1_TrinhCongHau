<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table >
    <tr>
        <th>Name</th>
        <th>Birthdate</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach items="${customers}" var="ct">
        <tr>
            <td><c:out value="${ct.name}"/></td>
            <td><c:out value="${ct.date}"/></td>
            <td><c:out value="${ct.address}"/></td>
            <td><c:out value="${ct.picture}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>