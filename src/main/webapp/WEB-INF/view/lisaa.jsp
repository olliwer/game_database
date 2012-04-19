<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head><link rel="stylesheet" type="text/css" href="<c:url value ="/static/styles.css"/>" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="footer">
            <tr>              
                <td><a href="<spring:url value="/j_spring_security_logout" htmlEscape="true" />">Logout</a></td>
            </tr>
        </table>

        <form action="lisaaPeli" method="POST">

            <span>Pelin nimi: <input type="text" name="nimi" ></span><br>
            <input type="submit">
        </form>

        <form action="lisaaGenre" method="POST">
            <span>Genren nimi: <input type="text" name="nimi" ></span><br>
            <input type="submit">
        </form>

        <form action="lisaaArvostelu" method="POST">
            <span>Arvosana: <input type="text" name="ratings" ></span><br>
            <span>Arvostelu: <textarea name="fields" cols="40" rows="5"></textarea></span><br>
            <input type="submit">
        </form>
    </body>
</html>
