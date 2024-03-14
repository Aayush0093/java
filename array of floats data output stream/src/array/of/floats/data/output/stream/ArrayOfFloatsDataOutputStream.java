/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.of.floats.data.output.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @since 2005
 * @author aayushtyagi
 */
public class ArrayOfFloatsDataOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        float list[] = {10.5f , 6.9f , 3.1f , 3.7f};
        int x = list.length;
        
        FileOutputStream fos = new FileOutputStream("test.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(x);
        for(int i = 0; i < x ; i++){
            dos.writeFloat(list[i]);
        }
        dos.close();
        fos.close();
        
        FileInputStream fis = new FileInputStream("test.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        int y = dis.readInt();
        
        for(int i = 0 ; i < y ; i++){
            System.out.println(dis.readFloat());
        }
        
        dis.close();
        fis.close();
        
    }
    
}
