/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swap.two.numbers.bitwise.operators;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */
public class SwapTwoNumbersBitwiseOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a , b ;
        
        System.out.print("Enter two numbers : ");
        
        Scanner s = new Scanner(System.in);
        
        a = s.nextInt();
        b = s.nextInt();
        
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        
    }
    
}
