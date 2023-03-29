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
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String materia;
        System.out.println("Ingrese el nombre de la materia que esta estudiando actualmente");
        materia = t.next();
        int num1 = 10;
        int num2 = 2;   
        int Suma = num1 + num2;
        double division = num1 / num2;
        boolean bandera = num1 < num2;
        int mordida = num1 - num2;
        byte mor = 126;
        
        
    System.out.println("La suma de los numero en las variables es " + Suma + " Y la division de los numeros es " + division + "Y el resultado es " + bandera + "y la resta es " + mordida + " y " + mor);
    }
    
}
