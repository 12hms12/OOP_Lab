/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
package Lab11;


class MyThread extends Thread{
    int a[][];
    int c;
    MyThread(int a[][],int c){
    this.a = a;
    this.c =c;
    }
    public void run(){
        switch(c){
            case 1: disp();break;   
            case 2: transpose();break;
            case 3: max();break;
            case 4: principal(); break;
            case 5: other(); break;
            default : System.out.println("Invalid");        
        }
    }
    
    public void disp(){
        for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.print(a[i][j]+"\t");
                    }
                    System.out.println("");
        }
        System.out.println("");
    }
    
    public void transpose(){
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                           System.out.print(a[j][i]+"\t");
                    }
                    System.out.println("");
                }
                System.out.println("");
    }
    
    public void max(){
        int max = a[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]>max) max = a[i][j];
            }
                    
        }
        System.out.println("Max : "+max+"\n");
    }
    
    public void principal(){
        System.out.println("Principal diagonal");
        for(int i=0;i<3;i++) System.out.print(a[i][i]+"\t");
        System.out.println("");
    }
    
    public void other(){
        System.out.println("Non princpal diagonal elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i!=j) System.out.print(a[i][j]+"\t");
            }
        }
    }
}

public class Lab11_q2 {
    public static void main(String args[]){
        int a[][] = {{1,2,3,},{4,5,6},{7,8,9}};
        MyThread t1 = new MyThread(a,1);
        t1.start();
        System.out.println("T1 Alive : "+ t1.isAlive());
        try{
        t1.join();
        }catch(InterruptedException ie){System.out.println("InterruptedException");}
        System.out.println("T1 Alive : "+ t1.isAlive());
        
        MyThread t2 = new MyThread(a,2);
        t2.start();
        System.out.println("T2 Alive : "+ t2.isAlive());
        try{
        t2.join();
        }catch(InterruptedException ie){System.out.println("InterruptedException");}
        System.out.println("T2 Alive : "+ t2.isAlive());
        
        MyThread t3 = new MyThread(a,3);
        t3.start();
        System.out.println("T3 Alive : "+ t3.isAlive());
        try{
        t3.join();
        }catch(InterruptedException ie){System.out.println("InterruptedException");}
        
        MyThread t4 = new MyThread(a,4);
        t4.start();
        System.out.println("T4 Alive : "+ t4.isAlive());
        try{
        t4.join();
        }catch(InterruptedException ie){System.out.println("InterruptedException");}
        System.out.println("T4 Alive : "+ t4.isAlive());
        
        MyThread t5 = new MyThread(a,5);
        t5.start();
    }    
}
 