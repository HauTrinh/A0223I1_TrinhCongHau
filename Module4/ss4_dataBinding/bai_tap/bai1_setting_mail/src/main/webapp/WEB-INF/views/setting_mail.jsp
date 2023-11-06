<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/31/2023
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="email" action="/create" method="post">
    <fieldset>
        <legend>Setting mail</legend>
        <table>
            <tr>
                <td>Language:</td>
                <td><form:select path="language" items="${languages}"/></td>
            </tr>
            <tr>
                <td>Page Size:</td>
                <td>
                    Show
                <form:select path="pageSize" items="${sizes}"/>
                    emails per page
                </td>
            </tr>
            <tr>
                <td>Spams filter:</td>
                <td>
                    <form:checkbox path="spamFilter" value="true"/>
                    Enable spams filter
                </td>
            </tr>
            <tr>
                <td>Signature:</td>
                <td>
                    <form:textarea path="signature" cols="50" rows="8"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <form:button>Update</form:button>
                    <form:button onclick="window.location='/'">Cancel</form:button>
                </td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
