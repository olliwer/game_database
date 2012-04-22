<%-- 
    Document   : main
    Created on : Mar 17, 2012, 7:28:18 PM
    Author     : Noemj
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <title>Game database</title>
    </head>
    <body>
        <c:forEach var="peli" items="${pelit}">
        <li>Id: ${peli.id}, Peli: ${peli.nimi}, Genre: ${peli.genre.nimi}, Kommentit: </br>
            <c:forEach var="kommentti" items="${peli.kommentit}" varStatus="status">
                ${kommentti.fields} <c:if test="${not status.last}">,</c:if> </br>
        </c:forEach></li> <!-- for-each tolle fieldsille!! -->
        <a href="kommentoi/${peli.id}"> Kommentoi</a></br>
        <a href="lisaaGenreen/${peli.id}"> Liitä peli genreen</a></br>
    </c:forEach>

    <c:forEach var="genre" items="${genret}">
        <li>Id: ${genre.id}, Genre: ${genre.nimi}, Pelit: </br>
            <c:forEach var="peli" items="${genre.pelit}" varStatus="status">
                ${peli.nimi} <c:if test="${not status.last}">,</c:if> </br>
            </c:forEach>
    </c:forEach>

    <c:forEach var="arvostelu" items="${arvostelut}">
        <li>Id: ${arvostelu.id}, Arvostelu on: ${arvostelu.fields}</li>
    </c:forEach>

    <a href="lisaa">Lisää peli tai genre tai arvostelu</a>
</body>
</html>
