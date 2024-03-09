/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copy.a.file;
import java.io.*;
/**
 *
 * @author aayushtyagi
 */
public class CopyAFile {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        FileOutputStream fos = new FileOutputStream("Source1.txt"); 
        String str = "JAVA PROGRAMMING\nLOVE";
        byte b[] = str.getBytes();
//        for(byte x : b)
//            fos.write(x);
        for(int i = 0 ; i < b.length ; i++)
            fos.write(b[i]);
        fos.close();
        
//        
        FileInputStream fis = new FileInputStream("Source1.txt");
//        int x;
//        while((x = fis.read())!=-1){
//            System.out.print((char)x);
//        }
//        System.out.println();

        
        FileOutputStream fos2 = new FileOutputStream("Source2.txt");
        int r;
        while((r = fis.read())!=-1){
            if(r>=65 && r<=120)
                fos2.write(r+32);
            else
                fos2.write(r);
        }
        
        fis.close();
        fos2.close();

    }
    
}
