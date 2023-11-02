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
public class Lab12_q1 {
   public static void main(String args[]){
    ArrayList<Integer> num = new ArrayList<Integer>();
    num.add(5);
    num.add(10);
    num.add(20);
    num.add(3);
    num.add(17);
    num.add(25);
    System.out.println("Displaying List : "+num);
    num.add(50);
    num.add(2,19);
    num.remove(1);
    System.out.println("Displaying final List : "+num);
   }
}
