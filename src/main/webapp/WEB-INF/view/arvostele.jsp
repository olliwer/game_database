<%-- 
    Document   : arvostele
    Created on : Apr 22, 2012, 1:53:11 PM
    Author     : Noemj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game database</title>
    </head>
    <form action="<%=request.getContextPath()%>/lisaaArvostelu/${peli.id}" method="POST">
        Arvostele peliä ${peli.nimi}</br>
        <span>Arvostelu: <textarea name="fields" cols="40" rows="5"></textarea></br>
        <span>Arvosana (1-5): <input type="text" name="rating"></span> 
        </span><br>
        <input type="submit" value="Arvostele!">
    </form>
</html>