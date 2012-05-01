<%-- 
    Document   : main
    Created on : Mar 17, 2012, 7:28:18 PM
    Author     : Noemj
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <title>Game database</title>
    </head>
    <body>
        <table class="footer">
            <tr>              
                <td><a href="<spring:url value="/j_spring_security_logout" htmlEscape="true" />">Logout</a></td>
            </tr>
        </table>
        <c:forEach var="peli" items="${pelit}">
        <li>Id: ${peli.id}, Peli: ${peli.nimi}, Genre: ${peli.genre.nimi}</br>
        Kommentit: </br>
            <c:forEach var="kommentti" items="${peli.kommentit}" varStatus="status">
                ${kommentti.fields} <c:if test="${not status.last}">,</c:if> </br>
            </c:forEach></li>
        Arvostelut: </br>
            <c:forEach var="arvostelu" items="${peli.arvostelut}" varStatus="status">
            Arvosana: ${arvostelu.rating}</br>
            ${arvostelu.fields} <c:if test="${not status.last}">,</c:if> </br>
            </c:forEach></li>

    <c:if test="${!empty peli.lainassa}">
        Lainassa: ${peli.lainassa} </br>
    </c:if>
    <a href="kommentoi/${peli.id}"> Kommentoi</a></br>
    <a href="lisaaGenreen/${peli.id}"> Liit� peli genreen</a></br>
    <a href="arvostele/${peli.id}"> Arvostele peli</a></br>
    <a href="poista/${peli.id}"> Poista peli</a></br>
    <c:if test="${empty peli.lainassa}">
        <a href="lainaa/${peli.id}"> Lainaa peli</a></br>
    </c:if>
    <c:if test="${!empty peli.lainassa}">
        <a href="poistaLaina/${peli.id}"> Poista lainasta</a></br>
    </c:if>
</c:forEach>

<c:forEach var="genre" items="${genret}">
    <li>Id: ${genre.id}, Genre: ${genre.nimi}, Pelit: </br>
        <c:forEach var="peli" items="${genre.pelit}" varStatus="status">
            ${peli.nimi} <c:if test="${not status.last}">,</c:if> </br>
        </c:forEach>
    </c:forEach>

    <a href="lisaa">Lis�� peli tai genre tai arvostelu</a>
</body>
</html>
