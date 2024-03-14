/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgenum;

/**
 *
 * @author aayushtyagi
*/

enum Dept{

    CS("john","block a"),CIVIL("rahul","block b"),ECE("johny","block c"),MECHANICAL("tommy","block d");
    
    String head ;
    String location;
    
    private Dept(String head,String location){
        this.head = head;
        this.location = location;
    }
    
    public String getHeadName(){
        return this.head;
    }
    public String getLocation(){
        return this.location;
    }
}
public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dept d = Dept.ECE;
        
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }
    
}
