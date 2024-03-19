/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.list.collection;

import java.util.*;

/**
 *
 * @author aayushtyagi
 */
public class ArrayListCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> al1 = new ArrayList<>(List.of(0,1,2,3,4));
        
        System.out.println(al1);
        
        System.out.print("[");
        al1.forEach(x->System.out.print(x+" ,"));
        System.out.print("]");
        System.out.println();
        
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();
        
        for(Integer x : al1)
            System.out.print(x+" ");
        System.out.println();
    }
    
}
