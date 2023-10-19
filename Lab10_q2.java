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
public class Lab10_q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements : ");
        try{
            for(int i=0;i<=n;i++){
            arr[i] = sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println("Error : Array Out of Bounds");}
    }  
}
