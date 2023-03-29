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
public class Dowhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero enteros");
        int num1,num2;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int suma = (num1 + num2);
        
        System.out.println("La suma de los numero ingresados es "+ suma);
        
       
        
        
        
    }
    
}
