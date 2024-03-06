/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.method.finding.domain.and.host.name.from.gmail;

/**
 *
 * @author aayushtyagi
 */
public class StringMethodFindingDomainAndHostNameFromGmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str = "programmer@gmail.com";
        
        int index  = str.indexOf('@');
        int index2 = str.indexOf('.');
        
        System.out.println(index);
        
        String username = str.substring(0, index);
        String domainName = str.substring(index+1,index2);
        
        System.out.println("Username   : " + username);
        System.out.println("domainName : " + domainName);
        System.out.println(domainName.compareTo("gmail"));
        
        
    }
    
}
