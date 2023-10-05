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
public class Lab9_q2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s,r,rep;
    System.out.println("Enter String : ");
    s = sc.nextLine();
    System.out.println("Enter word to replace : ");
    r = sc.nextLine();
    int n = r.length();
    rep = "";
    for(int i=0;i<n;i++){
        rep = rep + 'a';
    }
    String Nstring = s.replaceAll(r, rep);
    System.out.println("After Replacing : " + Nstring );
   
    }
}


