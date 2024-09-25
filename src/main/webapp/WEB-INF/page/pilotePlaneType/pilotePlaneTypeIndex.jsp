<%--
  Created by IntelliJ IDEA.
  User: Stagiaire
  Date: 25-09-24
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach var="pilotPlaneType" items="${vols}">
        <li> ${pilotPlaneType.Pilote}</li>
    </c:forEach>
</ul>
</body>
</html>
