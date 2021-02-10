/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_decisions_i_07;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Decisions_I_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num;
        int calc;
        
        System.out.print("Enter your number: ");
        num = input.nextInt();
        
        calc = num%2;
        
        if (calc == 0) {
            System.out.println("The number "+num+" is even");
        }
        
        else if (calc == 1){
            System.out.println("The number "+num+" is odd");
        }
        // TODO code application logic here
    }
    
}
