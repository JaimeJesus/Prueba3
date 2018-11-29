<form class="form-horizontal" action="/Secretaria/LoginServlet" method="POST">
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email:</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="email"  name="email"
             placeholder="Ingrese email" required >
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Password:</label>
    <div class="col-sm-10"> 
      <input type="password" class="form-control" name="password"
             id="pwd" placeholder="Ingrese password" required>
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Enviar</button>
    </div>
  </div>
</form>
<%  String username =  ((String)request.getAttribute("username"));
    username = username == null ? "" : username;
    if(username.compareTo("-1") == 0){ %>
    <div class="alert alert-danger">
      <strong>Inicio de Sesión:</strong> Error.
    </div>
<% }
System.out.println("dato: " + username);%>