<%-- 
    Document   : liitaGenreen
    Created on : Apr 22, 2012, 12:40:03 PM
    Author     : Noemj
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game database</title>
    </head>
    <body>
        Valitse pelille ${peli.nimi} genre. </br>
        <c:forEach var="genre" items="${genres}">
            <form action="<%=request.getContextPath()%>/lisaaPeliGenreen/${peli.id}/${genre.id}" method="POST">
                <li>Id: ${genre.id}, Genre: ${genre.nimi}, Lisää tähän genreen </li>               
                <input type="submit">
            </form>
        </c:forEach>
        <a href="<%=request.getContextPath()%>/listaa">Pois!</a>
</body>
</html>
