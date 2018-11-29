
package capa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Doctor {
    private int id_doctor;
    private int rut;
    private String nombre;
    private String especialidad;

     private final com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) ConnectionDVclinica.Connect();
    
    public Doctor() {
    }

    public Doctor(int id_doctor, int rut, String nombre, String especialidad) {
        this.id_doctor = id_doctor;
        this.rut = rut;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public ArrayList<Doctor> getAll(){
        ArrayList<Doctor> output = new ArrayList<Doctor>();
        try {
            String query = "SELECT * FROM Doctor;";
            
            Connection con = (Connection) ConnectionDVclinica.Connect();
            try(PreparedStatement ps = con.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        output.add(new Doctor(
                               rs.getInt("ID_DOCTOR"),
                               rs.getInt("RUT"),
                               rs.getString("NOMBRE"),
                               rs.getString("ESPECIALIDAD")
                        ));
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    
    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

  
    
    
}
