/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11;

/**
 *
 * @author student
 */
import java.util.* ;
class _extends extends Thread{
    public void run(){
            System.out.println("Thread created using 'extends' keyword");  
    }
}

class _runnable implements Runnable{
    Thread t2;
    public void run(){
        System.out.println("Thread created using 'implements'  keyword");
    }
}

public class Lab11_q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=1,b;
        while(a==1){
            System.out.println("Enter\n1. To use extend\n2. To use implement");
            b = sc.nextInt();
            switch(b){
                case 1 : _extends t1 = new _extends();
                        t1.start(); break;
                
                case 2 : _runnable t2 = new _runnable();
                         t2.run();break;
                
                default: System.out.println("Invalid input"); System.exit(0);
            
            }
            System.out.println("Enter 1 to redo , else to exit");
            a = sc.nextInt();
            
        }
    }    
}
