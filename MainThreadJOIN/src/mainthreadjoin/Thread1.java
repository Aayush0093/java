/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainthreadjoin;

/**
 *
 * @author aayushtyagi
 */
public class Thread1 extends Thread{
    
    synchro s;
    
    Thread1(synchro s){
        this.s = s;
    }
    
    public void run(){
        s.display();
    }
}
