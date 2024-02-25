package area.of.triangle;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        
        float a , b , c , sp , area ;
        
        Scanner s;
        s = new Scanner(System.in);
        
        System.out.print("Enter sides of triangles : ");
        
        a = s.nextFloat();
        b = s.nextFloat();
//        c = s.nextFloat();
//        
//        sp = (a+b+c)/2;
//        
//        area = (sp*(sp-a)*(sp-b)*(sp-c));
//        area = (area)1/2;
          
        area =   (a*b)/2;
        
        System.out.println("Area is : "+area);
    }
    
}
