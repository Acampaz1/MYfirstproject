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
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    
       String resp, solt, r;
      do {
        System.out.println("cual es tu nombre:");
        resp = a.nextLine();
          System.out.println("Que edad tienes?:");
          int edad = a.nextInt();
          System.out.println("Estas soltera?:");
          solt = a.nextLine();
          a.nextLine();
          System.out.println("Deseas hacer una encuesta de nuevo? Si o No");
          r = a.nextLine();
      } while (r.equals("SI") || r.equals("si")) ;
       
    }
    
}
