<%--
  Created by IntelliJ IDEA.
  User: Stagiaire
  Date: 24-09-24
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Plane type</h1>
<ul>
    <c:forEach var = "planeType" items="${planeTypeList}">
        <li>Nom : ${planeType.name}, Manufacturer : ${planeType.manufacturer}, Power : ${planeType.power}, Nb_sieges : ${planeType.seatCount} </li>
    </c:forEach>
</ul>
</body>
</html>
