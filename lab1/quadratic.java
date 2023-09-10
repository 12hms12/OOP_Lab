import java.util.*;
class quadratic{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  Double a,b,c,D,r1,r2,i1,i2;
  System.out.println("Enter coefficient a :");
  a = sc.nextDouble();
  System.out.println("Enter coefficient b :");
  b = sc.nextDouble();
  System.out.println("Enter constant c :");
  c = sc.nextDouble();
  if(b*b>4*a*c){
    D = Math.sqrt(b*b - 4*a*c);
    r1 = (-b+D)/2*a;
    r2 = (-b-D)/2*a;
    System.out.println("Roots are real and disctinct. The first root is "+r1+" and the second root is "+r2 );
   }
  
  else if(b*b==4*a*c){
      System.out.println("Roots are real and equal. The value of the root is " + -b/2*a);
   }

  else{
    i1 = Math.sqrt(4*a*c - b*b)/2*a;
    i2 = -Math.sqrt(4*a*c - b*b)/2*a;
    r1 = -b/2*a;
    System.out.println("Roots are imaginary. The first root is "+r1 + " +"+ i1+"i and the second root is "+r1 + i2+"i" );
   }
  

  }

}