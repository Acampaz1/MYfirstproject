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
public class IfSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Enter package wanted");
        int paquete = l.nextInt();
        
        
        if (paquete >= 1 && paquete <= 5){
            
        switch (paquete)    {
            case 1:
                System.out.println("Felicidades has elegido el paquete 1");
                break;
                case 2:
                System.out.println("Felicidades has elegido el paquete 2");
                break;
                case 3:
                System.out.println("Felicidades has elegido el paquete 3");
                break;
                case 4:
                System.out.println("Felicidades has elegido el paquete 4");
                break;
                case 5:
                System.out.println("Felicidades has elegido el paquete 5");
                break;
                
        }
            
        } else if (paquete == 0){
            System.out.println("Lamentamos que no desees ninguno de nuestros programas");
        } else if (paquete< 0) {
            System.out.println("Esta es una opcion invalida");
        } else {
                System.out.println("Se te fue la mano con la opcion elegida");
                }
        System.out.println("Gracias por la eleccion");
    }
    
}
