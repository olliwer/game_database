<%-- 
    Document   : muokkaaGenrea
    Created on : May 5, 2012, 4:45:49 PM
    Author     : Olli Rissanen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Muokkaa genreä</title>
    </head>
    <body>
        Muokkaa genren ${genre.nimi} nimeä:
        <form action="<%=request.getContextPath()%>/muokkaaGenrenTietoja/${genre.id}" method="POST">
            <span>Genren nimi: <input type="text" name="nimi"></span>
            <input type="submit" value="Muokkaa">
        </form>
    </body>
</html>
