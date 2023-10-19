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
class InvalidRegException extends Exception{
    public InvalidRegException(String s){
     super(s);
    }
}

public class Lab10_q4 {
    
    static void validate(int num)throws InvalidRegException {
        if(num<22095300 || num>=220954000) throw new InvalidRegException(num + "is invalid");
        else System.out.println(num+ " is valid");
    }
    
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter registration number : ");
        int reg = sc.nextInt();
        try{
            validate(reg);
        }
        catch(InvalidRegException e)
        {System.out.println("Invalid number");}   
    }    
}
