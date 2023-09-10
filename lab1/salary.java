import java.util.*;
class salary
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   double bs,da,hra,gs,ded,net;
   System.out.println("Enter Basic Salary :");
   bs = sc.nextDouble();
   da = bs*0.2;
   hra = bs*0.08;
   gs = bs + da + hra;
   ded = gs*0.1;
   net = gs-ded;
   System.out.println("DA is "+da+" rupees");
   System.out.println("HRA is "+hra+" rupees");
   System.out.println("Gross Salary is "+gs+" rupees");
   System.out.println("Deduction is "+ded+" rupees");
   System.out.println("Net Salary is "+net+" rupees");
   
  }
}
