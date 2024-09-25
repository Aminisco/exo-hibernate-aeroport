<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="${pageContext.request.contextPath}/plane">Plane</a>
<br>
<a href="${pageContext.request.contextPath}/planeType">PlaneType</a>
<br>
<a href="${pageContext.request.contextPath}/pilote">Pilote</a>
<br>
<a href="${pageContext.request.contextPath}/pilotePlaneType">Vols</a>
</body>
</html>