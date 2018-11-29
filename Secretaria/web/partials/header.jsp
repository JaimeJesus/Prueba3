<%@page import="java.util.Date"%>
<h1>
   Hospital "El otro mundo"
</h1>
<%    
    if(session.getAttribute("username") == null){
        response.sendRedirect("/Secretaria/pages/login.jsp");
    }
%>

<div style="float:right">
 
     <a href="/Secretaria/pages/login.jsp">Cerrar sesión</a>
     
</div>
<br />