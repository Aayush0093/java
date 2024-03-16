/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defining.generic.pkgclass;

/**
 *
 * @author aayushtyagi
 */

class Data<T>{
    T obj;
    
    public void setData(T o){
        obj = o;
    }
    public T getData(){
        return obj;
    }
}
        
public class DefiningGenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Data<Integer> d = new Data<>();
        d.setData(new Integer(10));
        System.out.println(d.getData());
        
    }
    
}
