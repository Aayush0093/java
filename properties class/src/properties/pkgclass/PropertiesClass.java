/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package properties.pkgclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author aayushtyagi
 */
public class PropertiesClass {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Properties p = new Properties();
        p.setProperty("Brand", "Samsung");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows");
        p.setProperty("Model", "Latitude");
        
        p.store(new FileOutputStream("data.txt"), "Laptop");
        
        p.storeToXML(new FileOutputStream("data.xml"), "Laptop");
        
        p.loadFromXML(new FileInputStream("data.xml"));
        System.out.println(p);
        System.out.println(p.getProperty("Brand"));
        
    }
    
}
