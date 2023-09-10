class Time{
    int hrs,min,sec;
    Time(){
        int hrs=0;
        int min=0;
        int sec=0;
    }
    Time(int h,int m, int s){
        hrs = h;
        min = m;
        sec = s;
    }
    void display(){
        System.out.println("Time = "+hrs + ":" + min + ":"+sec);
    }
    void add(Time t1, Time t2)
    {
        sec = (t1.sec + t2.sec) % 60;
        min = (t1.min + t2.min + (t1.sec + t2.sec) / 60) % 60;
        hrs = (t1.hrs + t2.hrs + (t1.min + t2.min + (t1.sec + t2.sec) / 60) /60) % 24;
    }

}


public class Class_Time {
    public static void main(String args[]){
        Time t1 = new Time(3,33,40);
        t1.display();
        Time t2 = new Time(12,45,36);
        t2.display();
        Time t3 = new Time();
        t3.add(t1,t2);
        t3.display();

    }
}
