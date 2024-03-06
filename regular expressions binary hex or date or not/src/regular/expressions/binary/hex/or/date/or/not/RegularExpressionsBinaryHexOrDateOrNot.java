/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regular.expressions.binary.hex.or.date.or.not;

/**
 *
 * @author aayushtyagi
 */
public class RegularExpressionsBinaryHexOrDateOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int b = 10110001;
        String str = b + " ";
        str = str.trim();
        System.out.println(str.matches("[10]+"));
     
        int h = 0x012a;
        String str1 = h + " ";
        str1 = str1.trim();
        System.out.println(str1.matches("[0-9a-fA-F]+"));
        
        String d = "01/11/2023";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        
        
    }
    
}
