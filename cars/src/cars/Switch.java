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
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese una option entre 1 - 4");
        int motor;
        motor = leer.nextInt();



        switch (motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
                case 2:
                System.out.println("La bomba es una bomba de gasolina”.");
                break;
                case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
                case 4:
                System.out.println("“La bomba es una bomba de pasta alimenticia");
                break;
                default:
                    System.out.println("No existe un valor válido para tipo de bomba");
                
              
        
    }
    
}
