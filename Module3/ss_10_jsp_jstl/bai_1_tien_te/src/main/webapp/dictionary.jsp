<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/23/2023
  Time: 8:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.lang.String" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");

    String search = request.getParameter("search");

    String result = dic.get(search);

    PrintWriter writer = response.getWriter();
    if (result != null) {
        writer.println("Word: " + search + "<br>");
        writer.println("Result: " + result);
    } else {
        writer.println("Not found");
    }

%>
</body>
</html>
