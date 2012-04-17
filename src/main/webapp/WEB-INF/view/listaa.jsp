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
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="peli" items="${pelit}">
        <li>Id: ${peli.id}, Peli: ${peli.nimi}, Kommentit: ${peli.kommentit[0].fields}</li> <!-- for-each tolle fieldsille!! -->
        <a href="kommentoi/${peli.id}"> Kommentoi</a>
    </c:forEach>

    <c:forEach var="genre" items="${genret}">
        <li>Id: ${genre.id}, Genre: ${genre.nimi}</li>
    </c:forEach>

    <c:forEach var="arvostelu" items="${arvostelut}">
        <li>Id: ${arvostelu.id}, Arvostelu on: ${arvostelu.fields}</li>
    </c:forEach>

    <a href="lisaa">Lisää peli tai genre tai arvostelu</a>
</body>
</html>
