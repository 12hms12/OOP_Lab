/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12;

/**
 *
 * @author student
 */
import java.util.* ;


class Student{
    int stuid,marks;
    String name;
    Student(int id,int m, String n){
        stuid = id;
        marks = m;
        name = n;
    }
    
    void disp(){
        System.out.println("\nName : "+name+"\nID : "+stuid+"\nMarks : "+marks);
    }

}

public class Lab12_q2 {
    public static void main(String args[]){
        ArrayList<Student> s = new ArrayList<Student>();
        Student s1 = new Student(2209,81,"Nikunj");
        Student s2 = new Student(2210,79,"Tanay");
        Student s3 = new Student(2211,69,"Sparsh");
        Student s4 = new Student(2212,80,"Vihaan");
        Student s5 = new Student(2213,87,"Harsh");
        s.add(s1); 
        s.add(s2); 
        s.add(s3); 
        s.add(s4); 
        s.add(s5); 
        for(Student i : s){
            if(i.marks>=80) i.disp();
        }  
    }
}
