/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author student
 */

class Student{
    String name;
    int regno ;
    int age;
    static int UGcount =0, PGcount = 0;
}

class UG extends Student{
    int sem;
    int fee;
    UG(String n, int r, int a, int s, int f){
    name = n;
    regno = r;
    age = a;
    sem = s;
    fee = f;
    super.UGcount++ ;
    }
    void disp(){
    System.out.println("Name : "+name);
    System.out.println("Reg No. : "+regno);
    System.out.println("Age : "+age);
    System.out.println("Semester : "+sem);
    System.out.println("Fee : "+fee);
    System.out.println(" ");
    }
}

class PG extends Student{
    int sem;
    int fee;
    PG(String n, int r, int a, int s, int f){
    name = n;
    regno = r;
    age = a;
    sem = s;
    fee = f;
    super.PGcount++ ;
    }
    void disp(){
    System.out.println("Name : "+name);
    System.out.println("Reg No. : "+regno);
    System.out.println("Age : "+age);
    System.out.println("Semester : "+sem);
    System.out.println("Fee : "+fee);
    System.out.println(" ");
    }
}

public class Student_Details {
    public static void main(String args[]){
    UG u1 = new UG("harsh",2209,19,3,100000);
    UG u2 = new UG("arjun",2208,18,3,100000);
    PG p1 = new PG("jash",1245,22,1,50000);
    u1.disp();
    u2.disp();
    p1.disp();
    System.out.println("Total UG student = "+UG.UGcount);
    System.out.println("Total UG student = "+PG.PGcount);
    
    
    
    }
}
