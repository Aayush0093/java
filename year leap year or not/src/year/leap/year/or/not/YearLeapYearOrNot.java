/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package year.leap.year.or.not;
import java.util.Scanner;
/**
 *
 * @author aayushtyagi
 */
public class YearLeapYearOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = s.nextInt();
        
        if(year%4 == 0){
            if((year%100 == 0)&&(year%400==0))
                System.out.println("leap");
            else if((year%100==0)&&(year%400!=0))
                System.out.println("not");
            else
                System.out.println("leap");
        }
        else
            System.out.println("not");
    }
    
}
