import java.util.*;
class large_2
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 int a,b;
 System.out.println("Enter first number :");
 a = sc.nextInt();

 System.out.println("Enter second number :");
 b = sc.nextInt();

 if(a>b){
   System.out.println("The largest number is "+a);
  }

 
 else if(a<b){ 
    System.out.println("The largest number is "+b);
  }

 
 else if(a==b){
   System.out.println("Both numbers are equal");
  }
 
 }
}