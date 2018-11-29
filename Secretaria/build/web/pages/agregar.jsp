<%-- 
    Document   : agregar
    Created on : 28-nov-2018, 23:16:48
    Author     : Jaime

--%>


<%@page import="capa.dao.Tipoenfermedad"%>
<%@page import="java.util.ArrayList"%>
<%@page import="capa.dao.Doctor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../partials/head.jsp" %>
    </head>
    <body>
        
        <header>
            <%@include file="../partials/header.jsp" %>
        </header>
        <nav>
            <%@include file="../partials/menu.jsp" %>
        </nav>
        <main>
            <%@include file="../contents/addPaciente.jsp" %>
        </main>
        <footer>
            <%@include file="../partials/footer.jsp" %>
        </footer>
     
    </body>
</html>