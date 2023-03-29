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
public class dowhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20;
        
       num = 1;num2 = 5;num3 = 1;num4 = 1;num5 = 1;num6 = 1;num7 = 1;num8 = 1;num9 = 1;num10 = 1;num11 = 1;num12 = 1;num13 = 1;num14 = 1;num15 = 1;num16 = 1;num17 = 1;num18 = 1;num19 = 1;num20 = 1;

        do {
            System.out.println("La suma de los numero ingresados es " + (num + num2 + num3 + num4));
            num = leer.nextInt();  num2 = leer.nextInt(); num3 = leer.nextInt(); num4 = leer.nextInt(); num5 = leer.nextInt(); num6 = leer.nextInt(); num7 = leer.nextInt(); num8 = leer.nextInt(); num9 = leer.nextInt();num10 = leer.nextInt(); 
         
            if (num == 10) {
                System.out.println("se termino");
                break;
            }
            
        }while (num != 0 && num2 != 0 && num3 != 0 && num4 != 0 && num5 != 0 && num6 != 0 && num7 != 0 && num8 != 0 && num9 != 0 && num10 != 0);
        
        
        System.out.println("Se capturo el numero cero");
        
        
        
        
    }
    
}
