import java.util.Scanner;
class Number
{
    private double a;
    Number(int x)
    {
        a = x;
    }
    Number()
    {
        a = 0;
    }
    boolean isZero()
    {
        return a == 0? true:false;
    }
    boolean isPositive()
    {
        return a > 0? true:false;
    }
    boolean isNegative()
    {
        return a < 0? true: false;
    }
    boolean isOdd()
    {
        return a%2 != 0? true: false;
    }
    boolean isEven()
    {
        return a%2 == 0? true: false;
    }
    boolean isPrime()
    {
        for(int i = 2; i < a; i++)
        {
            if(a % i == 0)
                return false;
        }
        return true;
    }
    boolean isArmstrong()
    {
        double temp = a, x = 0;
        while(temp > 0)
        {
            x += Math.pow((temp % 10), 3);
            temp /= 10;
        }
        if(x == a)
            return true;
        else
            return false;
    }
}

public class Class_Num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Number n1 = new Number(24);
        System.out.println(n1.isZero());
        System.out.println(n1.isPositive());
        System.out.println(n1.isNegative());
        System.out.println(n1.isOdd());
        System.out.println(n1.isEven());
        System.out.println(n1.isPrime());
        System.out.println(n1.isArmstrong());
        

    }
}



