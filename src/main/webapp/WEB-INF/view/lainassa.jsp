<%-- 
    Document   : lainassa
    Created on : May 1, 2012, 11:35:42 AM
    Author     : Noemj
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Lainatut pelit: </br>
        <c:forEach var="peli" items="${pelit}">
            Pelin nimi: ${peli.nimi}</br>
            Kenellä: ${peli.lainassa}</br>
        </c:forEach>
    <a href="<%=request.getContextPath()%>/listaa">Takaisin</a>
    </body>
</html>
