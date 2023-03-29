/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author estudiante
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombreCancion;
        String nombreAutor;
        String nombreCantante;
        String nombreAlbum;
        String anio;
        
        /*System.out.print("Ingrese nombre de la cancion: ");
        nombreCancion = sc.next();      
        System.out.print("Ingrese nombre del autor - compositor: ");
        nombreAutor = sc.next();       
        System.out.print("Ingrese nombre cantante: ");
        nombreCantante = sc.next();     
        System.out.print("Ingrese nombre del album: ");
        nombreAlbum = sc.next();       
        System.out.print("Ingrese nombre año: ");
        anio = sc.next();     */
        
        try{
            Statement sql = Conexion.getConexion().createStatement();
           
            String consulta = "SELECT * FROM TABLA1";
            
            ResultSet resultado = sql.executeQuery(consulta);
            
                while(resultado.next()){
                    System.out.println(resultado.getString("columna1"));
                }
                   
        }catch(SQLException ex){
            System.out.println("No se puede realizar la consulta");
        }          
    }
    
   
    
}
