/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_decisions_i_04;

import java.util.Scanner;

/**
 *
 * @author Zemmy
 */
public class Java_Decisions_I_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         int w1;
       
         
         System.out.print("Enter the number of your month of birth:");
        w1 = input.nextInt();
        
        if (w1 == 1) {
         System.out.println("Your  birthstone is Garnet you must be rich");
        }
        
        else if (w1 == 2) {
         System.out.println("Your  birthstone is Amethyst you must be rich");
    }
        else if (w1 == 3) {
         System.out.println("Your  birthstone is Aquamarine Bloodstone you must be rich");
    }
        else if (w1 == 4) {
         System.out.println("Your  birthstone is Diamond you must be rich");
        }
        else if (w1 == 5) {
         System.out.println("Your  birthstone is Emerald you must be rich");
        }
        else if (w1 == 6) {
         System.out.println("Your  birthstone is Pearl you must be rich");
        }
        else if (w1 == 7) {
         System.out.println("Your  birthstone is Ruby you must be rich");}
        
        else if (w1 == 8) {
         System.out.println("Your  birthstone is Peridot you must be rich");}
        
        else if (w1 == 9) {
         System.out.println("Your  birthstone is Sapphire you must be rich");}
        
        else if (w1 == 10) {
         System.out.println("Your  birthstone is Opal you must be rich");}
        
        else if (w1 == 11) {
         System.out.println("Your  birthstone is Topaz you must be rich");}
        
        else if (w1 == 12) {
         System.out.println("Your  birthstone is Turquoise you must be rich");}
        
        else if (w1 > 12) {
         System.out.println("Please enter a number from 1 and 12");}
        
        // TODO code application logic here
    }
    
}
