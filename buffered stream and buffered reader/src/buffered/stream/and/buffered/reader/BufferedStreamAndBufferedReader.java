/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buffered.stream.and.buffered.reader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 * @author aayushtyagi
 */
public class BufferedStreamAndBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        FileInputStream fis = new FileInputStream("test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        System.out.println((char)bis.read());
        System.out.println(bis.markSupported());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        
        bis.mark(10);
        
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        
        bis.reset();
        
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        
        
        fis.close();
        bis.close();
    }
    
}
