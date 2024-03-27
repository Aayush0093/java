/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grades;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        int phy,chem,maths,total;
        float avg;
        
        System.out.print("Enter phy marks   : ");
        phy = s.nextInt();
        System.out.print("Enter chem marks  : ");
        chem = s.nextInt();
        System.out.print("Enter maths marks : ");
        maths = s.nextInt();
        
        total = phy + chem + maths ;
        
        avg = total/3f;
        
        if(avg > 90)
            System.out.println("A");
        else if(avg > 80)
            System.out.println("B");
        else
            System.out.println("Good");
    }
    
}
