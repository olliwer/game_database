<%-- 
    Document   : lainaa
    Created on : May 1, 2012, 10:07:33 AM
    Author     : Noemj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lainaa peli</title>
    </head>
    <body>
        Kenelle peli ${peli.nimi} lainataan?</br>
        <form action="<%=request.getContextPath()%>/lainaaPeli/${peli.id}" method="POST">
        <input type="text" name="lainassa">
        <input type="submit" value="Lainaa peli">
    </form>
    </body>
</html>
