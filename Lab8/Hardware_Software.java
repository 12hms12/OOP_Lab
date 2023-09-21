/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author student
 */
interface sales{
    static int TotalSales(){return 0;}
}

class Hardware implements sales{
    String cat,manu;
    static int sales =0;
    public static int TotalSales(){
     return sales;
    }
    Hardware(String c, String m){
    cat = c;
    manu = m;
    sales++;
    }
    
}

class Software implements sales{
    String os,type;
    static int sales =0;
    public static int TotalSales(){
     return sales;
    }
    Software(String o,String t){
    os = o;
    type = t;
    sales++;
    }
}

public class Hardware_Software {
    public static void main(String args[]){
        Hardware h1 = new Hardware("mouse","logitech");
        Hardware h2 = new Hardware("monitor","dell");
        Hardware h3 = new Hardware("cpu","intel");
        Software s1 = new Software("Antivirus","Windows");
        Software s2 = new Software("Antivirus","Macintosh");
        System.out.println("Total Hardware sales : "+ Hardware.TotalSales());
        System.out.println("Total Software sales : "+ Software.TotalSales());
    
    }
}
