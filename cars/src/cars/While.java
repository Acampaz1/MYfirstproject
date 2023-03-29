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
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = a.nextInt();
        
        while (nota < 0 || nota >10 ) {
            System.out.println("La nota ingresada no es correcta, por favor ingrese una nota de nuevo");
            nota = a.nextInt();
        }
    }
    
}
