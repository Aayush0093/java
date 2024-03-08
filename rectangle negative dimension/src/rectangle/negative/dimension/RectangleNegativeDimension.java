/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle.negative.dimension;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */

class NegativeDimensionException extends Exception{
    
    public String toString(){
        return "Exception";
    }
    
}

public class RectangleNegativeDimension {

    /**
     * @param args the command line arguments
     */
    public int compute(int l,int b) throws NegativeDimensionException{
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    
    public void input() throws NegativeDimensionException{
        
        int l,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth.");
        l = s.nextInt();
        b = s.nextInt();
        
        RectangleNegativeDimension r = new RectangleNegativeDimension();
        
        System.out.println(r.compute(l,b));
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        RectangleNegativeDimension r1 = new RectangleNegativeDimension();
        
        try{
            r1.input();
        }catch(NegativeDimensionException n){
            System.out.println(n);
        }
        
    }
    
}
