/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author aayushtyagi
 */

class account{
    private String name;
    private int balance;
    
    public account(String s,int b){
        name = s;
        balance = b;
    }
    public void set(int balance){
        this.balance = balance;
    }
    public int get_balance(){
        return balance;
    }
    void display(){
        System.out.println("Name : "+name + "\nbalance : "+balance);
    }
}

class savings_account extends account{
    public savings_account(String s,int n){
        super(s,n);
    }
    public void withdrawl(int amt){
        if((get_balance()-amt)<0)
            System.out.println("not enpugh funds.");
        else{
            int w;
            w = get_balance() - amt;
            set(w);
        }
    }
    public void deposit(int amt){
        int b;
        b = get_balance() + (amt*10)/100;
        set(b);
    }
}


public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        savings_account s = new savings_account("aayush",100);
        s.display();
        s.deposit(50);
        s.display();
        s.withdrawl(200);
        s.withdrawl(89);
        s.display();
        
    }
    
}
