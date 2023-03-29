/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.util.Scanner;

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
        
        System.out.print("Ingrese nombre de la cancion: ");
        nombreCancion = sc.next();
        
        System.out.print("Ingrese nombre del autor - compositor: ");
        nombreAutor = sc.next();
        
        System.out.print("Ingrese nombre cantante: ");
        nombreCantante = sc.next();
        
        System.out.print("Ingrese nombre del album: ");
        nombreAlbum = sc.next();
        
        System.out.print("Ingrese nombre año: ");
        anio = sc.next();
        
        System.out.println(nombreCancion);
        System.out.println(nombreAutor);
        System.out.println(nombreCantante);
        System.out.println(nombreAlbum);
        System.out.println(anio);
                
    }
    
}
