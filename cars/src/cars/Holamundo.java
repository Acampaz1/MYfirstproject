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
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("ingresa tu nombre");    
        nombre = leer.next();
        System.out.println("Ingrese su edad");
        int numero;
        numero =leer.nextInt();
        System.out.println("Ingrese la cantidad de dinero que tiene en el banco");
        int num1;
        num1 = leer.nextInt();
         System.out.println("hola mi nombre es " + nombre + " y estoy programando en java y mi edad es " + numero + " Y la cantidad de dinero que posee es $" + num1);
    }
    
}
