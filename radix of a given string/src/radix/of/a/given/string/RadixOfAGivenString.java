/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radix.of.a.given.string;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */
public class RadixOfAGivenString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter a string : ");
        Scanner s = new Scanner(System.in);
        String str ;
        
        str = s.nextLine();
        
        if(str.matches("[01]+")){
            System.out.println("Binary ");
        }
        else if(str.matches("[0-7]+")){
            System.out.println("Octal");
        }
        else if(str.matches("[0-9]+")){
            System.out.println("Decimal");
        }
        else if(str.matches("[0-9a-fA-F]+")){
            System.out.println("Hexadecimal");
        }
        else{
            System.out.println("Invalid");
        }
        
    }
    
}
