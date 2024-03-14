/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduction.to.generics;

/**
 *
 * @author aayushtyagi
 */
public class IntroductionToGenerics<T> {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {
        // TODO code application logic here


        IntroductionToGenerics<String> s = new IntroductionToGenerics<>();
        
        s.data[0] = "hi";
        s.data[1] = "bye";
//        s.data[2] = 3; error

        String str = s.data[0];
        System.out.println(str);
        
    }
    
}
