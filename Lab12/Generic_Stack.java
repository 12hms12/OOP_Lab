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

class employee{
    String name;
    int id;
    employee(String n,int i){
        name = n;
        id =i;
    }
    
    void disp(){
        System.out.println("Student Name : "+name+"\nStudent ID : "+id);
    }
}

class student{
    String name;
    int id;
    student(String n, int i){
        name =n;
        id =i;
    }
    
    void disp(){
        System.out.println("Employee Name : "+name+"\nEmpoyee ID : "+id);
    }
}

class stack<T>{
    int top=-1;
    ArrayList<T> A= new ArrayList<T>();
 
    void push(T x){
        top++; A.add(x);
    }
    
    T pop(){
        if(top==-1) {
            System.out.println("Empty Stack"); System.exit(1); 
        }
        return A.get(top--);
    }
}


public class Generic_Stack {
    public static void main(String args[]){
        student s1 = new student("Harsh",12); 
        student s2 = new student("Jash",15);
        employee e1 = new employee("Jack",123);
        employee e2 = new employee("Jane",42);
        stack<student> st = new stack<student>();
        st.push(s1); st.push(s2);
        st.pop().disp();
        st.pop().disp();
        stack<employee> em = new stack<employee>();
        em.push(e1);em.push(e2);
        em.pop().disp();
        em.pop().disp();
    }
}

