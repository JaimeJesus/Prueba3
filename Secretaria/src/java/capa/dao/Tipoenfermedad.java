
package capa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tipoenfermedad {
    private int id_tipoenfermedad;
    private String tipo;
    private int costotratamiento;

    private final com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) ConnectionDVclinica.Connect();
    
    public Tipoenfermedad() {
    }

    public Tipoenfermedad(int id_tipoenfermedad, String tipo, int costotratamiento) {
        this.id_tipoenfermedad = id_tipoenfermedad;
        this.tipo = tipo;
        this.costotratamiento = costotratamiento;
    }
    
     public ArrayList<Tipoenfermedad> getAll(){
        ArrayList<Tipoenfermedad> output = new ArrayList<Tipoenfermedad>();
        try {
            String query = "SELECT * FROM tipoenfermedad;";
            
            Connection con = (Connection) ConnectionDVclinica.Connect();
            try(PreparedStatement ps = con.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        output.add(new Tipoenfermedad(
                               rs.getInt("id_tipoenfermedad"),
                               rs.getString("tipo"),
                               rs.getInt("costotratamiento")
                        ));
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Tipoenfermedad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }


    public int getId_tipoenfermedad() {
        return id_tipoenfermedad;
    }

    public void setId_tipoenfermedad(int id_tipoenfermedad) {
        this.id_tipoenfermedad = id_tipoenfermedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCostotratamiento() {
        return costotratamiento;
    }

    public void setCostotratamiento(int costotratamiento) {
        this.costotratamiento = costotratamiento;
    }
    
    
}
