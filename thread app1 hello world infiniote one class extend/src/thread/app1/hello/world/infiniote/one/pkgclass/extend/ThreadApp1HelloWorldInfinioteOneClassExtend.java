/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread.app1.hello.world.infiniote.one.pkgclass.extend;

/**
 *
 * @author aayushtyagi
 */
public class ThreadApp1HelloWorldInfinioteOneClassExtend extends Thread{

    /**
     * @param args the command line arguments
     */
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadApp1HelloWorldInfinioteOneClassExtend t = new ThreadApp1HelloWorldInfinioteOneClassExtend();
        t.start();
        int i = 1;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
    
}
