/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package store.or.retrive.objects.serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author aayushtyagi
 */

class Customer implements Serializable{
    private String custID;
    private String name;
    private int phn;
    static int count = 1;
    
    Customer(){}
    Customer(String n,int p){
        name = n;
        phn = p;
        custID = "C"+count;
        count++;
    }
    
    @Override
    public String toString(){
        return "CustID : "+custID +"\n"+"Name : "+name+"\n"+"Phno. : "+phn+"\n\n";
    }
}
        
public class StoreOrRetriveObjectsSerialisation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        Customer list[] = {new Customer("aayush",7982),new Customer("anshika",9310),new Customer("boby",9873)};
        
        int x = list.length;
        
        FileOutputStream fos = new FileOutputStream("Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(x);
        for(int i=0;i<x;i++){
            oos.writeObject(list[i]);
        }
        oos.close();
        fos.close();
        
        
        FileInputStream fis = new FileInputStream("Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int y = ois.readInt();
        Customer read[] = new Customer[y];
        for(int i=0;i<y;i++){
            read[i] = (Customer)ois.readObject();
        }
        for(Customer c : read){
            System.out.println(c);
        }
        ois.close();
        fis.close();
    }
    
}
