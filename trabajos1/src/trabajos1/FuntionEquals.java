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
public class FuntionEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("What is your team?");
        String Sport = leer.next();
        String Responds;
        Responds = "A";
        
        if (Sport.equals(Responds)) {
            System.out.println("Congratulation you are part of the best team.");
            
        }else {
            System.out.println("We are sorry you are not part of this team"
                    + "");
        }
        
    }
    
}
