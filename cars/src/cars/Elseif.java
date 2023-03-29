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
public class Elseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner n = new Scanner (System.in);
        System.out.println("Enter a grade");
        
        int num1 = n.nextInt();
        System.out.println(num1);
        
        if(num1 >= 90 && num1 <= 100) {
            System.out.println("A");
        } else if (num1 >= 80 && num1 <= 90) {
            System.out.println("B");
        }else if (num1 >= 70 && num1 <= 80) {
            System.out.println("C");
        }else if (num1 >= 65 && num1 <= 70) {
            System.out.println("D");
        }else if (num1 >= 0 && num1 <= 65) {
            System.out.println("F");
        }else {
            System.out.println("The number you enter is not in the range");
        }
            
            
    }
    
}
