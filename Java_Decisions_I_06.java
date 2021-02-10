/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_decisions_i_06;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Decisions_I_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double USA = 1.01;
        double India = 72;
        double Canada = 1.29;
        double France = 0.85;
        double Germ = 0.85;
        double Aus = 11.60;
        double China = 6.86;
        double Mexico = 19;
        double Japan = 112.8;
        double Russia = 65.75;
        double CV;
        double BD;
        String country_name;
        
        System.out.print("Enter the value of the Bahamian Dollar: ");
        BD = input.nextDouble();
        
        System.out.print("Enter Country: ");
        country_name = input.next();
        
        if (country_name.equalsIgnoreCase("USA")) {
            CV = BD * USA;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" US dollars.");
        }
        
        else if (country_name.equalsIgnoreCase("India")) {
            CV = BD * India;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" Indian rupees.");
        }
        
        else if (country_name.equalsIgnoreCase("Canada")) {
            CV = BD * Canada;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" Canadian dollars.");
        }
        
        else if (country_name.equalsIgnoreCase("France")) {
            CV = BD * France;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" French euros.");
        }
        
        else if (country_name.equalsIgnoreCase("Germany")) {
            CV = BD * Germ;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" German euros.");
        }
        
        else if (country_name.equalsIgnoreCase("Austria")) {
            CV = BD * Aus;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" Austrian shilings.");
        }
        
        else if (country_name.equalsIgnoreCase("China")) {
            CV = BD * China;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" Chinese yuan.");
        }
        
        else if (country_name.equalsIgnoreCase("Mexico")) {
            CV = BD * Mexico;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" Mexican pesos.");
        }
        
        else if (country_name.equalsIgnoreCase("Japan")) {
            CV = BD * Japan;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" Japanese yen.");
        }
        
        else if (country_name.equalsIgnoreCase("Russia")) {
            CV = BD * Russia;
            System.out.println(BD +" Bahamian dollars is equal to "+CV+" Russian rouble.");
        }
        // TODO code application logic here
    }
    
}
