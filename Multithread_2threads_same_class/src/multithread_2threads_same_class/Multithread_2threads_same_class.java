/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithread_2threads_same_class;

/**
 *
 * @author aayushtyagi
 */
public class Multithread_2threads_same_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Run r1 = new Run("logicHello");
        Run r2 = new Run("logicTable");
        
        r1.start();
        r2.start();
    }
    
}
