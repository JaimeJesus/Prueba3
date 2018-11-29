<%-- 
    Document   : login
    Created on : 28-nov-2018, 23:16:38
    Author     : Jaime
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../partials/head.jsp" %>
    </head>
    <body class="container">
        <%
            session.invalidate();
        %>
        <header>
            
        </header>
        <nav>
            
        </nav>
        <main>
            <p>horas@clinica.cl</p>
            <h1>Inicio de Sesión</h1>
            <%@include file="../contents/loginForm.jsp" %>
        </main>
        <footer>
            <%@include file="../partials/footer.jsp" %>
        </footer>      
    </body>
</html>
