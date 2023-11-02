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
public class ex_pos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer arr[] = new Integer[5];
        System.out.println("Enter elements :");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        exchange(arr,2,4);
        System.out.println("After swapping index 2,4");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static<T> void  exchange(T[] a,int x, int y){
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }  
}
