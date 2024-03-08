/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread.app.pkg1.infinite.hello.world;

/**
 *
 * @author aayushtyagi
 */
class Mythread extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

public class ThreadApp1InfiniteHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mythread t = new Mythread();
        t.start();
        
        int i = 1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
    
}
