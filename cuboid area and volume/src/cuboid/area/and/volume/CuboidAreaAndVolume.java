/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboid.area.and.volume;
import java.util.Scanner;
/**
 *
 * @author aayushtyagi
 */
public class CuboidAreaAndVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int l , b , h , volume , area;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter three sides of cuboid.");
        
        l = s.nextInt();
        b = s.nextInt();
        h = s.nextInt();
        
        volume = (l*b*h);
        
        area = 2*(l*b + b*h + l*h);
        
        System.out.println("Volume : "+volume + " Area : "+area);
        
        
    }
    
}
