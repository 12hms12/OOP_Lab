import java.util.*;
class calculator{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  float n1,n2;
  char oper,rep='y';
  do{
   System.out.println("Enter first number :");
   n1 = sc.nextFloat();
   System.out.println("Enter second number :");
   n2 = sc.nextFloat();
   System.out.println("Enter * for multiplication, / for division, + for addition or - for subtraction ");
   oper = sc.next().charAt(0);
   switch(oper){
     case'+':
            System.out.println("Addition = "+ (n1+n2) );
            break;
            
     case'*':
            System.out.println("Multiplication = "+ n1*n2 );
            break;
     case'-':
            System.out.println("Subtraction = "+ (n1-n2) );
            break;

     case'/':
           System.out.println("Division = "+ n1/n2 );
           break;
     default:
            System.out.println("Wrong Value Entered");
              }
     System.out.println("Enter y to do another calculation, n to exit");
     rep = sc.next().charAt(0);

     }while(rep=='y');
   
  
 }
}


