/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regular.expression.important;

/**
 *
 * @author aayushtyagi
 */
public class RegularExpressionImportant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str = "a^b%c&D";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        
        String str1 = "abc    def    ghi";
        System.out.println(str1.replaceAll("\\s+"," "));
        
        String words[] = str1.split("\\s+");
        System.out.println(words.length);
    }
    
}
