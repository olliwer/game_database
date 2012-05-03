<%-- 
    Document   : error
    Created on : May 3, 2012, 10:18:41 PM
    Author     : Noemj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/error.css" />
        <title>404</title>
    </head>
    <body>
        <h1>No, because no!</h1>
        <a href="<%=request.getContextPath()%>/home">Pois!</a>
    </body>
</html>
