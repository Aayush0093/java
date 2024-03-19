/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linked.hash.map;
import java.util.*;

/**
 *
 * @author aayushtyagi
 */
public class LinkedHashMap {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);
        java.util.LinkedHashMap<Integer,String> lhm = new java.util.LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };
        lhm.put(0, "a");
        lhm.put(1, "b");
        lhm.put(2, "c");
        lhm.put(3, "d");
        lhm.put(4, "e");
        lhm.put(5, "f");
        
        String s;
        s = lhm.get(2);
        s = lhm.get(3);
        s = lhm.get(1);
        
//        System.out.println(lhm);
//        
//        lhm.pollFirstEntry();
        
        System.out.println(lhm);
        
    }
    
}
