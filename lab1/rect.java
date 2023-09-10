import java.util.*;
class rect
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int l,b;
    System.out.println("Enter length :");
    l = sc.nextInt();

    System.out.println("Enter breadth:");
    b = sc.nextInt();
    
   System.out.println("The area of the rectangle is "+l*b+ " sq units");
   System.out.println("The circumference of the rectangle is " + 2*(l+b) + " units" );
  }
}


