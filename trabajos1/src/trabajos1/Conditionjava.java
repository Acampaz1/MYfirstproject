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
public class Conditionjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner( System.in);
        System.out.println("Ingrese la contraseña correcta");
        String pala = leer.next();
        String pala2;
        
        pala2 = "pepeelgrillo";
        
        
        if (pala.equals(pala2)) {
            System.out.println("Su contraseña es corecta");
        }else {
            System.out.println("Contraseña incorrecta");
        }
        
        
        

      
        
        
        
        
    }
    
}
