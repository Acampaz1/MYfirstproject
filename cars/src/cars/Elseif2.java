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
public class Elseif2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese dos numero entero");
        
        int nun1 = e.nextInt();
        int nun2 = e.nextInt();
        System.out.println("Los numero ingresados son " + nun1 + " y " + nun2);
        
        if (nun1 > 25 || nun2 > 25){
            System.out.println("Ambos o algunos de los numero ingresados son mayores a 25");
        } else if (nun1 <= 25 || nun2 <= 25 ){
            System.out.println("Ambos o algunos de los numero ingresados son iguales o menores a 25");
        }
        
        
        
        
    }
    
}
