/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos1;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Funtionsubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Insert a phrase or word");
        String nombre;
        String subcadena;
       
        
        nombre = leer.next();
        subcadena = nombre.substring(5, 10);
        System.out.println(subcadena);
        
        nombre = "a";
      
        
        if (nombre.equals(subcadena)) {
            System.out.println("CORRECTO");
            
            
        }else {
            System.out.println("INCORRECTO");
        }
        
        
        
        
        
 
    }
    
}
