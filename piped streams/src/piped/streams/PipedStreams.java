/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piped.streams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @since 2005
 * @author aayushtyagi
 */

class Producer extends Thread{
    OutputStream os;
    
    Producer(OutputStream o){
        os = o;
    }
    
    public void run(){
        int i=1;
        while(true){
            try{
                os.write(i);
                os.flush();

                System.out.println("Producer "+i);
                System.out.flush();

                Thread.sleep(10);
                i++;
            }catch(Exception e){}
        }
    }
}

class Consumer extends Thread{
    InputStream is;
    
    Consumer(InputStream i){
        is = i;
    }
    
    public void run(){
        int x;
        while(true){
            try{
            
            x=is.read();
            
            System.out.println("Consumer "+x);
            System.out.flush();
            Thread.sleep(10);

            }catch(Exception e){}
        }
        
    }
}

public class PipedStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        
        pos.connect(pis);
        
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        
        p.start();
        c.start();
        
    }
    
}
