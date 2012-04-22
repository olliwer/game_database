<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
    <head><link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/styles.css" />
        <title>Game database</title>
    </head>
    <body>
        <table class="footer">
            <tr>              
                <td><a href="<spring:url value="/j_spring_security_logout" htmlEscape="true" />">Logout</a></td>
            </tr>
        </table>
        <div id="container">
            <form action="lisaaPeli" method="POST">
                <span style="margin-top:15px;">Pelin nimi: <input type="text" name="nimi"></span> 
                <input type="submit">
            </form>

            <form action="lisaaGenre" method="POST">
                <span style="margin-top:15px;">Genren nimi: <input type="text" name="nimi" ></span> 
                <input type="submit">
            </form>

            <form action="lisaaArvostelu" method="POST">
                <span style="margin-top:15px;">Arvosana: <input type="text" name="ratings" ></span><br />
                <span style="margin-top:15px;">Arvostelu: <textarea name="fields" cols="40" rows="5"></textarea></span> <br />
                <input type="submit" style="margin-left:30%;" />
            </form>
        </div>
    </body>
</html>