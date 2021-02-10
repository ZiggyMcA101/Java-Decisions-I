/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_decisions_i_02;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Decisions_I_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        
        System.out.print("Enter first number:");
        num1 = input.nextInt();
        
        System.out.print("Enter second number:");
        num2 = input.nextInt();
        
        System.out.print("Enter third number:");
        num3 = input.nextInt();
        
        System.out.println();
        
        if (num1 > num2)
        {
            System.out.println("The number "+num1+" is greatest in value.");
        }
                
        else if (num2 > num1)
        {
            System.out.println("The number "+num2+" is greatest in value.");
        }
        
        else if (num1 > num3)
        {
            System.out.println("The number "+num1+" is greatest in value.");
        }
        
        else if (num3 > num1)
        {
            System.out.println("The number "+num3+" is greatest in value.");
        }
        
        else if (num2 > num3)
        {
            System.out.println("The number "+num2+" is greatest in value.");
        }
        
        else if (num3 > num2)
        {
            System.out.println("The number "+num3+" is greatest in value.");
        }
        // TODO code application logic here
    }
    
}
