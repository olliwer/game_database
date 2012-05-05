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
        Pelit:
    <prkl>
        <c:forEach var="peli" items="${pelit}">
            </br>
            Peli: ${peli.nimi}</br>
            Genre: ${peli.genre.nimi}</br>
            Kommentit: </br>
            <c:forEach var="kommentti" items="${peli.kommentit}" varStatus="status">
                ${kommentti.fields} <c:if test="${not status.last}">,</c:if> </br>
                <a href="poistaKommentti/${kommentti.id}"> Poista kommentti</a></br>
            </c:forEach>
            Arvostelut: </br>
            <c:forEach var="arvostelu" items="${peli.arvostelut}" varStatus="status">
                Arvosana: ${arvostelu.rating}</br>
                ${arvostelu.fields} <c:if test="${not status.last}">,</c:if> </br>
                <a href="poistaArvostelu/${arvostelu.id}"> Poista arvostelu</a></br>
            </c:forEach></li>
            <c:if test="${!empty peli.lainassa}">
            Lainassa: ${peli.lainassa} </br>
        </c:if>
        <a href="kommentoi/${peli.id}"> Kommentoi</a>
        <c:if test="${empty peli.genre}">
        <a href="lisaaGenreen/${peli.id}"> Liitä peli genreen</a>
        </c:if>
        <a href="arvostele/${peli.id}"> Arvostele peli</a>
        <a href="poista/${peli.id}"> Poista peli</a>
        <c:if test="${empty peli.lainassa}">
            <a href="lainaa/${peli.id}"> Lainaa peli</a>
        </c:if>
        <c:if test="${!empty peli.lainassa}">
            <a href="poistaLaina/${peli.id}"> Poista lainasta</a>
        </c:if>
        <a href="muokkaa/${peli.id}"> Muokkaa pelin tietoja</a>
    </c:forEach>
    </br>
</prkl>
</br>
Genret:</br>
<prkl>
    <c:forEach var="genre" items="${genret}">
        Genren -${genre.nimi}- pelit: </br>
        <c:forEach var="peli" items="${genre.pelit}" varStatus="status">
            ${peli.nimi} <c:if test="${not status.last}">,</c:if> </br>
        </c:forEach>
    </c:forEach>
    </br>

    <a href="lisaa">Lisää peli tai genre</a>
    </br>
    </br>
    Etsi pelit jotka lainassa henkilöllä:
    <form action="<%=request.getContextPath()%>/lainassaHenkilolla/" method="POST">
        <input type="text" name="lainassa">
        <input type="submit">
    </form>
</prkl>
</body>
</html>
