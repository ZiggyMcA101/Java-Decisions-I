/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_decisions_i_05;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Decisions_I_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
      String state;
      
       System.out.print("Enter the name of your state: ");
        state = keyboard.nextLine();
        
      if (state.equalsIgnoreCase("Florida")) {
          System.out.println("You must be a Dolphins fan!");
      }
      
      else if (state.equalsIgnoreCase("New York")) {
          System.out.println("You must be a Giants fan!");
      }
      
      else if (state.equalsIgnoreCase("Texas")) {
          System.out.println("You must be a Cowboys fan!");
      }
      
      else if (state.equalsIgnoreCase("California")) {
          System.out.println("You must be a Raiders fan!");
      }
      
      else if (state.equalsIgnoreCase("Maryland")) {
          System.out.println("You must be a Ravens fan!");
      }
      
      else if (state.equalsIgnoreCase("Georgia")) {
          System.out.println("You must be a Falcons fan!");
      }
      else {
          System.out.println("Please enter in a valid state.");
      }
      
        // TODO code application logic here
    }
    
}
