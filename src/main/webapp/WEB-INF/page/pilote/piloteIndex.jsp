<%--
  Created by IntelliJ IDEA.
  User: Stagiaire
  Date: 25-09-24
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Liste Pilote</h1>
<ul>
    <c:forEach var ="pilote" items="${piloteList}">
        <li>Prenom : ${pilote.firstName} | Nom : ${pilote.lastName} | Matricule : ${pilote.plateNumber}</li>
    </c:forEach>
</ul>
</body>
</html>
