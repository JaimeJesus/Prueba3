/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.dao;

import capa.dao.ConnectionDVclinica;
import capa.dao.Paciente;
import java.sql.PreparedStatement;

/**
 *
 * @author Mairon
 */
public class Hora {
    private int id;
    private String descripcion; 
    private String fecha;

    private final com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) ConnectionDVclinica.Connect();
    
    public Hora() {
    }

    public Hora(int id, String descripcion, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    public void create (Hora hora) throws Exception{
       String query = "INSERT INTO HORA(ID,FECHA,DESCRIPCION) VALUES (? , ? , ?);";
       try (PreparedStatement ps = con.prepareStatement(query)){
           ps.setInt(1, hora.id);
           ps.setString(2, hora.fecha);
           ps.setString(3, hora.descripcion);
           ps.executeUpdate();
       }catch (Exception e){
           throw new Exception("Error: " + e.getMessage());
       }
   } 

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
