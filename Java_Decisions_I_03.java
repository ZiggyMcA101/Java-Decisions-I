/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_decisions_i_03;

import java.util.Scanner;

/**
 *
 * @author Zemmy
 */
public class Java_Decisions_I_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         int w1;
       
         
         System.out.print("Enter your number: ");
        w1 = input.nextInt();
        
        if (w1 == 1) {
         System.out.println("Today is Sunday");
        }
        
        else if (w1 == 2) {
         System.out.println("Today is Monday");
    }
        else if (w1 == 3) {
         System.out.println("Today is Tuesday");
    }
        else if (w1 == 4) {
         System.out.println("Today is Wednesday");
        }
        else if (w1 == 5) {
         System.out.println("Today is Thursday");
        }
        else if (w1 == 6) {
         System.out.println("Today is Friday");
        }
        else if (w1 == 7) {
         System.out.println("Today is Saturday");
        }
        else if (w1 > 7) {
         System.out.println("Please enter a number from 1 and 7");
        }
        // TODO code application logic here
    }
}
