
package capa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDVclinica {

    public ConnectionDVclinica() {
    }
    public static Connection Connect(){ 
       String driver = "com.mysql.jdbc.Driver"; 
       String url = "jdbc:mysql://localhost:3306/clinica_db?zeroDateTimeBehavior=convertToNull";
       String user = "root"; 
       String pass = ""; 
       try { 
           Class.forName(driver); 
           Connection conexion  
                   = (Connection) DriverManager.getConnection(url, user, pass); 
           return conexion; } catch (ClassNotFoundException ex)  { 
               System.err.println("No se encontro el driver");  
           } catch (SQLException ex) {            
               System.err.println("Error de conexion a la BD"); 
           }
       return null;
    }
}
