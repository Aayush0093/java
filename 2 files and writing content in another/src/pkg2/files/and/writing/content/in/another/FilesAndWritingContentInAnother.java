/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.files.and.writing.content.in.another;
import java.io.*;
/**
 *
 * @author aayushtyagi
 */
public class FilesAndWritingContentInAnother {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        FileInputStream fis1 = new FileInputStream("Source1.txt");
        FileInputStream fis2 = new FileInputStream("Source2.txt");
        
        FileOutputStream fos = new FileOutputStream("Source3.txt");
        
        SequenceInputStream fss = new SequenceInputStream(fis1,fis2);
        int b;
        while((b = fss.read())!=-1)
            fos.write(b);
        
        fis1.close();
        fis2.close();
        fos.close();
        fss.close();
    }
    
}
