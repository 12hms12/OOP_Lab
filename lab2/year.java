import java.util.*;
class year {
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int y;
   System.out.println("Enter year: ");
   y = sc.nextInt();
   if(y%4 !=0){
    System.out.println(y + " is not a leap year.")   ;
    
     }
   else if(y%4==0 && y%100!=0){
     System.out.println(y + " is a leap year.")   ;
     
     }
   else if(y%400!=0){
     System.out.println(y + " is not a leap year.")   ;
    
     }

 }
}
