/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author student
 */
import java.util.* ;
public class Lab10_q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        int a=0;
        try{
            a = Integer.parseInt(s);
             
        }catch(NumberFormatException ex)
        { System.out.println("Invalid String argument"); System.exit(0);}
          a++;
          System.out.println("Next num is "+ a);
    }    
}
