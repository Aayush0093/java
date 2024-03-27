/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account.pkgclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */

class Account implements Serializable{
    String accno;
    String name;
    double balance;

    Account() {
    }
    
    Account(String accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\nAccount{" + "accno=" + accno + ", name=" + name + ", balance=" + balance + "}\n";
    }

}


public class AccountClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Account acc = null;
        HashMap<String,Account> hm = new HashMap<>();
        
        try{
            FileInputStream fis = new FileInputStream("Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                acc = (Account)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accno, acc);
            }
            ois.close();
            fis.close();
            
        }
        catch(Exception e){
            
        }
        
        FileOutputStream fos = new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        System.out.println("Menu");
        
        int choice;
        double balance;
        String accno;
        String name;
        
        do{
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Account");
            System.out.println("6. Exit Account");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            
//            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            switch(choice){
                case 1 :
                    System.out.println("Enter accno : ");
                    accno = sc.nextLine();
                    System.out.println("Enter name : ");
                    name = sc.nextLine();
                    System.out.println("Enter balance : ");
                    balance = sc.nextDouble();
                    acc = new Account(accno,name,balance);
                    hm.put(accno, acc);
                    System.out.println("Account created for "+ name);
                    break;
                    
                case 2 :
                    System.out.println("Enter account no : ");
                    accno = sc.nextLine();
                    hm.remove(accno);
                    break;
                    
                case 3 :
                    System.out.println("Enter account no : ");
                    accno = sc.nextLine();
                    System.out.println(hm.get(accno));
                    break;
                    
                case 4 :
                    for (Account a : hm.values()) {
                        System.out.println(a);
                    }
                    break;
                case 5 :
                case 6 :
                    oos.writeInt(hm.size());
                    for(Account a : hm.values()){
                        oos.writeObject(a);
                    }
            }
            
            
        }while(choice != 6);
        oos.flush();
        oos.close();
        fos.close();
        
    }
    
}
