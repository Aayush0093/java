/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odd.or.even;
import java.util.Scanner;
/**
 *
 * @author aayushtyagi
 */
public class OddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        int x;
        System.out.print("Enter a number : ");
        x = s.nextInt();
        
        if(x%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        
    }
    
}
