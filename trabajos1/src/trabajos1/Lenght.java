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
public class Lenght {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingres una palabra de menor de 8 caracteres");
        String cadena = leer.next();
        int longitudcadena = cadena.length();
        
        if (longitudcadena == 8){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
        
        
    }
    
}
