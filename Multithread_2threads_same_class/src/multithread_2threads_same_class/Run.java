/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithread_2threads_same_class;

/**
 *
 * @author aayushtyagi
 */
public class Run extends Thread{
    
    private String threadIdentifier;
    
    Run(String ti){
        this.threadIdentifier = ti;
        setName(threadIdentifier);
    }
    
    public void run(){
        
        if(Thread.currentThread().getName().equals("logicHello")){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello"+i);
                try {
                    sleep(100);
                } catch (InterruptedException ex) {}
            }
        }
        
        else if(Thread.currentThread().getName().equals("logicTable")){
            for (int i = 1; i <= 5; i++) {
                System.out.println("2 * "+ i + " = " + (2*i));
                try {
                    sleep(50);
                } catch (InterruptedException ex) {}
            }
        }
        
    }
    
}


