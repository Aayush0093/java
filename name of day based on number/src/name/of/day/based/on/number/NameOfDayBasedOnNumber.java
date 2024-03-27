
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package name.of.day.based.on.number;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */
public class NameOfDayBasedOnNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n ;
        System.out.print("Enter number : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        if(n%7==0)
            System.out.println("Sunday");
        else if(n%7 == 1)
            System.out.println("Monday");
        else if(n%7==2)
            System.out.println("Tuesday");
        else if(n%7 == 3)
            System.out.println("Wednesday");
        else if(n%7==4)
            System.out.println("Thursday");
        else if(n%7 == 5)
            System.out.println("Friday");
        else
            System.out.println("Saturday");
        
    }
    
}
