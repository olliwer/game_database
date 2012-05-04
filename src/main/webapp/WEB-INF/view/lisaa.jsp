<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
            <form:form commandName="peli" action="lisaaPeli" method="POST">
                <span>Pelin nimi: <form:input path="nimi"/><form:errors path="nimi"/></span> 
                <input type="submit">
            </form:form>
            <form:form commandName="genre" action="lisaaGenre" method="POST">
                <span>Genren nimi: <form:input path="nimi"/><form:errors path="nimi"/></span> 
               <input type="submit">
            </form:form>     
        </div>
    </body>
</html>