/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        String  nombre;
        System.out.println("Ingrese su nombre ");
        nombre = a.next();
        System.out.println("Ingrese su edad ");
        int  num1;
        num1 = a.nextInt();
        
        System.out.println("Mi nombre es: " + nombre + " Y mi edad es: " + num1);
    }
    
}
