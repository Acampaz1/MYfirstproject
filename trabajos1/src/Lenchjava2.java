
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class Lenchjava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String [] arraycadena = {"hola", "Mundo","que","tal","hello","melo"};
        String cadena = "Hola mundo yo soy Anthony";
        String cadena2 = "Hello this is my world";
        String cadena3 = "THIS IS ANTHONY YOUR FATHER";
        
            int longitudcadena = cadena.length();
            int longArraycadena = arraycadena.length;
      
        
        System.out.println(longitudcadena);
        System.out.println(longArraycadena);
        System.out.println(cadena2.toUpperCase());
        System.out.println(cadena3.toLowerCase());
            
    }
    
}
