import java.util.*;

class List<T>{
    int top=-1;
    ArrayList<T> list = new ArrayList<>();

    void add(T d){
        top++; list.add(top,d);
    }

    void del(int index){
        list.remove(index); top--;
    }

    void disp(){
        System.out.println(list);
    }

}

public class Midsem{
    public static void main(String args[]){
        List<Integer> l = new List<Integer>();
        System.out.println("Integer class :");
        l.add(1); l.add(2); l.add(3); l.add(4);
        l.disp();
        l.del(2);l.disp();      
        List<Double> d = new List<Double>();
        System.out.println("Double class :");
        d.add(3.14); d.add(6.9); d.add(4.20); 
        d.disp();
        d.del(1);d.disp();
        
    }
}


