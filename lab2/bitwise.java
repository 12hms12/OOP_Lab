import java.util.*;
class bitwise{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n;
   System.out.println("Enter a  number :");
   n = sc.nextInt();
   int div = n>>1 ;
   int  mul = n<<1 ;
   System.out.println(n + " divided by two is "+ div );
   System.out.println(n + " multiplied by two is "+ mul );
 }
}
