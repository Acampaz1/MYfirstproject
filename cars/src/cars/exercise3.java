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
public class exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner P = new Scanner (System.in);
        String Favorite;
        System.out.println("Ingrese su deporte favorito");
        Favorite = P.next();
        
        Scanner A = new Scanner (System.in);
        String comida;
        System.out.println("Ingrese su comida favorita");
        comida = A.next();
        
        int num1;
        System.out.println("Ingrese la cantidad de trabajo que tiene actualmente");
        num1 = P.nextInt();
        
        short num2;
        System.out.println("Mencione su edad");
        num2 = P.nextShort();
        
        int num3;
        System.out.println("Ingrese sueldo que aspira en la empresa");
        num3 = P.nextInt();
        
        System.out.println("Su deporte favorito es: " + Favorite + " Su comida favorita es: " + comida + " La cantidad de trabajo que tiene es: " + num1 + " La edad indicada es: " + num2 + " El sueldo al que aspira es: "+num3);
        
    }
    
}
