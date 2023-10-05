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
public class Lab9_q4 {
    
    static void comp(String s){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter second string :");
    String n = sc.nextLine();
    int val = s.compareTo(n);
    if(val>0) System.out.println("Str1 is greater than Str2");
    else if(val<0) System.out.println("Str2 is greater than Str1");
    else System.out.println("Both are equal");
    }
    
    static void Convert(String s){
    int len = s.length();
    String ans = "";
    for(int i=0;i<len;i++){
        char ch = s.charAt(i); 
        if(Character.isLowerCase(ch)){ ch = Character.toUpperCase(ch); }
        else if(Character.isUpperCase(ch)){ ch = Character.toLowerCase(ch); }
        ans += ch;
        }
    System.out.println("Converted String : "+ ans);
    } 
    
    static void contain_sub(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter substring : ");
        String sub = sc.nextLine();
        boolean ans = s.contains(sub);
        if(ans == true){
            System.out.println(sub +" is a part of "+ s);
            String f = s.replace(sub, "Hello");
            System.out.println("After replacing : " + f);
        }
        else {System.out.println(sub +" is not  a part of "+ s);}
        
    }
    
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String s = sc.nextLine();
    int n; 
    System.out.println("Enter\n1: Compare two Strings\n2: Convert uppercase char to lower and vice verse");
    System.out.println("3: Display whether an entered string is a substring of the other or not and replace it with hello");
    n = sc.nextInt();
    switch(n){
        case 1: comp(s);break;
        case 2: Convert(s); break;
        case 3: contain_sub(s);break;
        default: System.out.println("Wrong Value ");
    }
    
    
    }    
}
