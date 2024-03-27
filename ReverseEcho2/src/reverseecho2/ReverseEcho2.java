/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseecho2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author aayushtyagi
 */
public class ReverseEcho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        
        do{
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
            
        }while(!msg.equals("dne"));
        
    }
    
}

class ReverseEchoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Socket stk = new Socket("localhost",2000);
        
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;
        
        do{
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From SERVER : " + msg);
            
        }while(!msg.equals("dne"));
        
    }
    
}
