/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author estudiante
 */
public class Conexion {
    
     public static Connection getConexion() throws ClassNotFoundException{
        String conexion = "jdbc:postgresql://localhost:5432/Canciones";
         
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(conexion,"postgres","1234");
            return con;
        } catch(SQLException ex){
            System.out.println("ERROR NO HAY CONEXION");
            System.out.println(ex);
            return null;
        }
        
        
    }
    
}
