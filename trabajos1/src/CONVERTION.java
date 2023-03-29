
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class CONVERTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double grados,Fahrenheit;
        System.out.println("Ingresse los grados centigrados a calcular");
        grados = leer.nextDouble();
        
        Fahrenheit = 32 +(9*grados/5);
        
        System.out.println("La conversion de los grados cenigrados " + grados + " es: " + Fahrenheit);
        
        
        
        
        
        
        
        
        
        
    }
    
}
