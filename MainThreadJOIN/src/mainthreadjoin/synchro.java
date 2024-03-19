/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainthreadjoin;

/**
 *
 * @author aayushtyagi
 */
public class synchro extends Thread{
    synchronized void display(){
        System.out.println("Name of thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {}
        System.out.println(Thread.currentThread().getName() + " Thread.");
    }
}
