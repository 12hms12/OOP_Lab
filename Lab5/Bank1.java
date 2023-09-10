/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author student
 */
class Account{
    String name;
    String actype;
    int acnum;
}

class Savings extends Account{
    double balance;
    int roi;
    Savings(String n,String a,int nu, double b, int r){
        name = n;
        actype = a;
        acnum = nu;
        balance = b;
        roi = r;
    }
    void deposit(int ch){
    balance = balance + ch;
    }
    void disp_bal(){
    System.out.println("Balance : inr "+ balance);
    }
    
    void interest(){
    balance = balance + balance*roi/100;
    }
    
    void withdraw(int w){
    if(balance >= w ){
    balance = balance - w;
    }
    
    }
}

class Current extends Account{
    double balance;
    int roi;
    Current(String n,String a,int nu, double b, int r){
        name = n;
        actype = a;
        acnum = nu;
        balance = b;
        roi = r;
    }
    void deposit(int ch){
    balance = balance + ch;
    }
    
    void disp_bal(){
    System.out.println("Balance : inr "+ balance);
    }
 
    
    void withdraw(int w){
    if(balance > w + 1000){
    balance = balance - w;
    }
    else{
    balance = balance -100;
    System.out.println("Insufficient Balance . Penalty of INR 100 imposed");
    }
    }

}

public class Bank1 {
    public static void main(String args[]){
        Savings s = new Savings("harsh","savings",456456,10000,6);
        s.deposit(2000);
        s.withdraw(5000);
        s.interest();
        s.disp_bal();
        Current c = new Current("tanay","current",123123,11000,8);
        c.deposit(1000);
        c.withdraw(20000);
        c.disp_bal();
        
    
    }
}
