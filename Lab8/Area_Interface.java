/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author student
 */
import java.util.*;

interface area{
    double Area(int x, int y);
}

class Rect implements area{
    public double Area(int x, int y){
     return(x*y);
    }
}

class Circ implements area{
    public double Area(int x,int y){
      return(3.14*x*y);
    }
}


public class Area_Interface {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Rect r = new Rect();
    int l,b;
    System.out.println("Enter length and breadth : ");
    l = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Area of Rectangle : "+ r.Area(l,b)+" sq units");
    Circ c = new Circ();
    int rad;
    System.out.println("\nEnter Radius : ");
    rad = sc.nextInt();
    System.out.println("Area of Circle : "+ c.Area(rad,rad)+ "sq units");
    }
}
