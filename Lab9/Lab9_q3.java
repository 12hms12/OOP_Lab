/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author student
 */
import java.util.*;
public class Lab9_q3 {
    
    static void palindrome(String s){
        int n = s.length();
        int flag =0;
        for(int i=0;i<=n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
            flag++; break;
            }
        }
        if(flag ==0) System.out.println(s + " is a palindrome");
        else         System.out.println(s + " is not a palindrome");
    }
    
    static void sort(String s){
        char sorted[] = s.toCharArray();
        Arrays.sort(sorted);
        String ans = String.valueOf(sorted);
        System.out.println("Alphabeticallay arranged : "+ans);
    }
    
    static String reverse(String s){
        int n = s.length();
        char rev[] = s.toCharArray();
        for(int i=0;i<=n/2;i++){
            char temp = rev[i];
            rev[i] = rev[n-i-1];
            rev[n-1-i] = temp;    
        }
        String r = String.valueOf(rev);
        System.out.println("Reverse : "+r);
        return r;
    }
    
    static void con_rev(String s){
    String r = reverse(s);
    s += r;
    System.out.println("Concating original and reverse String : "+ s);
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter String : ");
        s = sc.nextLine();
        int n; 
        System.out.println("Enter\n1 : To check if a string is a palindrome\n2 : Write String in alphabetical order\n3 : Reverse String\n4 : Concatenate original and reversed String");
        n = sc.nextInt();
        switch(n){
            case 1: palindrome(s); break;
            case 2: sort(s); break;
            case 3: String rev = reverse(s); break;
            case 4: con_rev(s); break;
            default : System.out.println("Wrong value Entered");  
        }   
    }
}
