/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author student
 */

import java.util.*;

class PositiveNumberException extends Exception {
    PositiveNumberException(double n) {
        System.out.println("Positive Number caught: " + n);
    }
}

public class Lab10_q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        try {
            double a = sc.nextInt();
            if(a > 0)
                throw new PositiveNumberException(a);
            double b = Math.sqrt(-a);
            System.out.println("negative sqrt = "+b);
        }
        catch (PositiveNumberException e) {
            System.out.println("Exception caught: " + e);
        }
    }  
}
