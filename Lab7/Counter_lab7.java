/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author student
 */
class employee{
    static int num=0;
    employee(){
     num++;
    }

 }

public class Counter_lab6 {
    public static void main( String args[]){
    employee e1 = new employee();
    employee e2 = new employee();
    employee e3 = new employee();
    System.out.println("Total number of employees : " + employee.num);
    }
}
