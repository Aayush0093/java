/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainthreadjoin;

/**
 *
 * @author aayushtyagi
 */
public class MainThreadJOIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
//        Demo t = new Demo("Aayush");
//        Demo t1 = new Demo("Tyagi");
//        
//        t.start();
//        
//        t.join();
//        t1.start();
        
//        Demo t2 = new Demo("A");
//        Demo t3 = new Demo("T");
//        
//        t2.start();
//        t3.start();
        
        synchro s1 = new synchro();
        Thread1 t1 = new Thread1(s1);
        Thread2 ts = new Thread2(s1);
        
        t1.start();
        ts.start();
    }
    
}
