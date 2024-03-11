/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflection.pkgclass;
import java.lang.reflect.*;
/**
 *
 * @author aayushtyagi
 */

class my{
    public int a;
    private int b ;
    protected int c;
    int d;
    
    my(){}
    my(int x,int y){}
    
    public void display(String s1 , String s2){}
}

public class ReflectionClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Class c=my.class;
        
        Field field[]=c.getDeclaredFields();
        Method meth[]=c.getMethods();
        Parameter param[]=meth[0].getParameters();
        
//        for(Field f:field)
//            System.out.println(f);
//        for(Method m:meth)
//            System.out.println(m);
        for(Parameter p:param)
            System.out.println(p);

        
    }
    
}
