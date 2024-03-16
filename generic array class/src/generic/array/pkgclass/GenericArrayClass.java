/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic.array.pkgclass;

/**
 *
 * @author aayushtyagi
 */

class MyArray<T>{
    T A[] = (T[])new Object[3];
    int length;
    
    MyArray(){length = 0;}
    
    public void append(T o){
        A[length++] = o;
    }
    public void display(){
        for(int i = 0 ; i < length ; i++){
            System.out.println(A[i]);
        }
    }
}

public class GenericArrayClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();
        
    }
    
}
