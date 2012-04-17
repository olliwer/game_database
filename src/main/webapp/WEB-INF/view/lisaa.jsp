<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="lisaaPeli" method="POST">
            
            <span>Pelin nimi: <input type="text" name="nimi" ></span><br>
            <input type="submit">
        </form>
        
        <form action="lisaaGenre" method="POST">
            <span>Genren nimi: <input type="text" name="nimi" ></span><br>
            <input type="submit">
        </form>
    </body>
</html>
