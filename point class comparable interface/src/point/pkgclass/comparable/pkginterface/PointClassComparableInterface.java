/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package point.pkgclass.comparable.pkginterface;

import java.util.TreeSet;

/**
 *
 * @author aayushtyagi
 */

class Point implements Comparable{
    int x;
    int y;
    
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "x = "+x+" , y = "+y;
    }
    
    @Override
    public int compareTo(Object o){
        Point p =(Point)o;
        if(this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else{
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;        
        }
    }
    
}

public class PointClassComparableInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        
        System.out.println(ts);
        
    }
    
}
