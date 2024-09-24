<%--
  Created by IntelliJ IDEA.
  User: Stagiaire
  Date: 24-09-24
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Plane Index</h1>
    <c:forEach var = "plane" items="${planes}">
        <li>Num : ${plane.immatriculation} Type :${plane.planeType.name}</li>
    </c:forEach>
</body>
</html>
