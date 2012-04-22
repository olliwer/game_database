<%-- 
    Document   : kommentoi
    Created on : Apr 14, 2012, 12:52:52 PM
    Author     : Noemj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Game database</title>
    </head>
    <form action="<%=request.getContextPath()%>/lisaaKommentti/${peli.id}" method="POST">
        <span>Fields: <textarea name="fields" cols="40" rows="5"></textarea>
        </span><br>
        <input type="submit">
    </form>
</html>