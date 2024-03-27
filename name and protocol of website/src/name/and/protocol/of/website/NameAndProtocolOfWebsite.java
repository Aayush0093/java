/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package name.and.protocol.of.website;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */
public class NameAndProtocolOfWebsite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str ;
        System.out.print("Enter url : ");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        
        int index = str.indexOf(':');
        int index1 = str.lastIndexOf('.');
        
        String protocol = str.substring(0, index);
        String type = str.substring(index1+1);
        
        System.out.println("Protocol : "+protocol);
        System.out.println("Type     : "+type);
        
        if(protocol.equals("http"))
            System.out.println("hyper text transfer protocol");
        else if(protocol.equals("ftp"))
            System.out.println("file transfer protocol");
        else if(protocol.equals("https"))
            System.out.println("hyper text transfer protocol secure");
        else
            System.out.println("Invalid.");
        
        if(type.equals("com"))
            System.out.println("commercial website");
        else if(type.equals("gov"))
            System.out.println("government website");
        else if(type.equals("org"))
            System.out.println("organisation");
        else
            System.out.println("Invalid.");
        
    }
    
}
