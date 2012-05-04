<%-- 
    Document   : authorityError
    Created on : May 4, 2012, 6:45:22 PM
    Author     : Olli Rissanen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/authError.css" />
        <title>403</title>
    </head>
    <body>
        <h1>You aren't authorized!</h1>
        <a href="<%=request.getContextPath()%>/home">Pois!</a>
    </body>
</html>
