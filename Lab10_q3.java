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
public class Lab10_q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and roll number : ");
        String name = sc.nextLine();
        int rollno = sc.nextInt();
        sc.nextLine();
        String marks[] = new String[3];
        for(int i=0;i<3;i++){
                System.out.println("Enter marks of subject "+(i+1));
                marks[i] = sc.nextLine();
        }
        int per[] = new int[3];
        try{
            for(int i=0;i<3;i++){
             per[i] = Integer.parseInt(marks[i]);
            }
        }
        catch(NumberFormatException e)
        {System.out.println("Error : Wrong Number Format"); System.exit(0);}
        float percent = (per[0]+per[1]+per[2])/3;
        System.out.println("Percentage = "+percent+" %");
        if(percent>=80) System.out.println("Grade : A");
        else if(percent>=60&&percent<80) System.out.println("Grade : B");
        else if(percent>=40&&percent<60) System.out.println("Grade : C");
        else System.out.println("Grade : F");
    }
}
