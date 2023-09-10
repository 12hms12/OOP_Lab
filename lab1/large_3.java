import java.util.*;
class large_3
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   int a,b,c;
   System.out.println("Enter first number :");
   a = sc.nextInt();

   System.out.println("Enter second number :");
   b = sc.nextInt();
  
   System.out.println("Enter third number :");
   c = sc.nextInt();
  
   if(a>b && a>c){
    System.out.println("The largest number is " + a);
   }
   
  else if(a>b && a<c){
    System.out.println("The largest number is " + c);
   }
   

  else if(a<b && b<c){
    System.out.println("The largest number is " + c);
   }

  else if(a<b && b>c){
    System.out.println("The largest number is " + b);
   }

  }
}