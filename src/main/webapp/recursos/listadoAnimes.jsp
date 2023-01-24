<%-- 
    Document   : listadoAnimes
    Created on : 24 ene. 2023, 11:59:14
    Author     : yazid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Animes</h1>
        <ul>
            <c:forEach items="${animes}" var="anime">
                <li>${anime.name} ${anime.author} </li>
            </c:forEach>
        </ul>
    </body>
</html>
