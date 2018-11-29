<%@page import="capa.dao.Doctor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="capa.dao.Tipoenfermedad"%>
<form action="${pageContext.request.contextPath}/registro" method="POST" class="form-horizontal-center">   
                <table>
                    <tr>
                        <td><label for="txtRut">Rut:</label></td>
                        <td><input name="rut" class="form-control" type="number" required id="txtRut" placeholder="Ingrese rut aqui" /></td>
                    </tr>
                    
                    <tr>
                        <td><label for="txtName">Nombre:</label></td>
                        <td><input name="name" class="form-control" type="text" required id="txtName" placeholder="Ingrese nombre aqui" /></td>
                    </tr>
                    

                    <tr>
                        <td><label for="txtEdad">edad</label></td>
                        <td><input name="edad" type="number" class="form-control" required id="txteEDAD" placeholder="Ingrese Edad " /></td>
                    </tr>
                    
                    <tr>
                        <td><label for="txtFecha">Hora</label></td>
                       <td> <input name="fecha" type="number" class="form-control" required id="txteFecha" placeholder="Ingrese Fecha " /></td>
                    </tr>

                    <tr>
                        <td><label for="txtTelefono">telefono</label></td>
                        <td><input name="telefono" type="number" class="form-control" required id="txTelefono" placeholder="Solo numeros " /></td>
                    </tr>
                    
                    <tr>
                        <td><label for="ID_DOCTOR">Nombre doctor:</label></td>
                        <td>
                        <%

                                Doctor raz = new Doctor();
                                ArrayList<Doctor> lista = raz.getAll();
                                out.println("<select name='ID_DOCTOR'>");
                                for (int i=0;i<lista.size();i++)
                                {
                                   out.println("<option value='"+lista.get(i).getId_doctor()+"'>"+lista.get(i).getNombre()+"</option>");
                                }
                                out.println("</select>");
                        %>   
                    </td>
                    </tr>
                        
                      <tr>
                        <td><label for="ID_TIPOENFERMEDAD">Tipo Enfermedad</label></td>
                        <td>
                        <%

                                Tipoenfermedad tipe = new Tipoenfermedad();
                                ArrayList<Tipoenfermedad> listado = tipe.getAll();
                                out.println("<select name='ID_TIPOENFERMEDAD'>");
                                for (int i=0;i<lista.size();i++)
                                {
                                   out.println("<option value='"+listado.get(i).getId_tipoenfermedad()+"'>"+listado.get(i).getTipo()+"</option>");
                                }
                                out.println("</select>");
                        %>   
                      </td>
                    </tr>
                        
                    

                    <tr>
                        <td><button style="float:left" class="btn btn-default">Registrar</button></td>

                    </tr>
                </table>
            </form> 