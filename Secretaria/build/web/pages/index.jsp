<%-- 
    Document   : index
    Created on : 28-nov-2018, 23:16:28
    Author     : Jaime
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../partials/head.jsp" %>
    </head>
    <body>
        <%  
            String username = (String)request.getAttribute("username");
            if(username != null) {
                session.setAttribute("username", username);
            }
            session.setMaxInactiveInterval(5111111);
        %>
        <header>
            <%@include file="../partials/header.jsp" %>
        </header>
        <nav>
            <%@include file="../partials/menu.jsp" %>
        </nav>
        <main>
            <h1>Bienvenido <h1>
                   
        </main>
        <footer>
            <%@include file="../partials/footer.jsp" %>
        </footer>
     
    </body>
</html>

