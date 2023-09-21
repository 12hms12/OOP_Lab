/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author student
 */
import java.util.* ;
abstract class Shape{
    int a,b;
}

class Rectangle extends Shape{
    public void area(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Length and Breadth : ");
     a = sc.nextInt();
     b = sc.nextInt();
     System.out.println("Area of Rectangle : "+ (a*b)+" sq units");
    }
}

class Circle extends Shape{
    public void area(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Radius : ");
     a = sc.nextInt();
     b = a;
     System.out.println("Area of Circle : "+(3.14*a*b)+" sq units");
    }
}

public class Area_abstract {
    public static void main(String args[]){
    Rectangle r = new Rectangle();
    r.area();
    Circle c = new Circle();
    c.area();
    }
}
