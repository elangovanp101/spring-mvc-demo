<%--
  Created by IntelliJ IDEA.
  User: elangovan p
  Date: 16-05-2021
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page</title>
</head>
<body>
Dear User: <%= request.getAttribute("result")%>
</body>
</html>
