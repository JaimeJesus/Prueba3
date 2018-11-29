
package capa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Paciente {
    private int rut;
    private String nombre;
    private int edad;
    private int fecha;
    private int telefono;
    private int id_tipoenfermedad;
    private int id_doctor;
  
    private final com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) ConnectionDVclinica.Connect();

  
  
  public Paciente() {
    }
   
  
  
  public Paciente(int rut, String nombre, int edad, int fecha, int telefono, int id_tipoenfermedad, int id_doctor) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.telefono = telefono;
        this.id_tipoenfermedad = id_tipoenfermedad;
        this.id_doctor = id_doctor;
    }
  

    public void create (Paciente pacient) throws Exception{
       String query = "INSERT INTO PACIENTE(RUT,NOMBRE,EDAD,FECHA,TELEFONO,ID_TIPOENFERMEDAD,ID_DOCTOR) VALUES (? , ? , ? , ? , ? , ? , ?);";
       try (PreparedStatement ps = con.prepareStatement(query)){
           ps.setInt(1, pacient.rut);
           ps.setString(2, pacient.nombre);
           ps.setInt(3, pacient.edad);
           ps.setInt(4, pacient.fecha);
           ps.setInt(5, pacient.telefono); 
           ps.setInt(6, pacient.id_tipoenfermedad); 
           ps.setInt(7, pacient.id_doctor); 
           ps.executeUpdate();
       }catch (Exception e){
           throw new Exception("Error: " + e.getMessage());
       }
   } 
    
     public ArrayList<Paciente> getAll(){
        ArrayList<Paciente> output = new ArrayList<Paciente>();
        try {
            String query = "SELECT * FROM paciente;";
            
            Connection con = (Connection) ConnectionDVclinica.Connect();
            try(PreparedStatement ps = con.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        output.add(new Paciente(
                               rs.getInt("rut"),
                               rs.getString("nombre"),
                               rs.getInt("edad"),
                               rs.getInt("fecha"),
                               rs.getInt("telefono"),
                               rs.getInt("tipoenfermedad"),
                               rs.getInt("id_doctor")
                        ));
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId_tipoenfermedad() {
        return id_tipoenfermedad;
    }

    public void setId_tipoenfermedad(int id_tipoenfermedad) {
        this.id_tipoenfermedad = id_tipoenfermedad;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

   
}
