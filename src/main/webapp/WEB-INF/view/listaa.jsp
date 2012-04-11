<%-- 
    Document   : main
    Created on : Mar 17, 2012, 7:28:18 PM
    Author     : Noemj
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="peli" items="${pelit}">
                <li>${peli.id}, Peli: ${peli.nimi}</li>
            </c:forEach>
            
            <a href="lisaa">Lisää peli</a>
    </body>
</html>
