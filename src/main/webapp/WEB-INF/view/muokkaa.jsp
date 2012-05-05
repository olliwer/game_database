<%-- 
    Document   : muokkaa
    Created on : May 5, 2012, 2:02:38 PM
    Author     : Olli Rissanen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Muokkaa pelin nimeä:
        <form action="<%=request.getContextPath()%>/muokkaaPelia/${peli.id}" method="POST">
            <span>Pelin nimi: <input type="text" name="nimi"></span>
            <input type="submit">
        </form>
    </body>
</html>
