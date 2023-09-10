class employee{
    String empnam;
    String city;
    int basic;
    int da;
    int hra;

    void get_data(String e,String c,int b, int d, int h){
        empnam = e;
        city = c;
        basic = b;
        da = d;
        hra = h;
    }
    
    double compute(){
        return (basic + (basic * da /100) + (basic * hra /100));
    }

    void display(){
        System.out.println("Total Salary = " + compute());
    }

}


public class Class_emp {
    public static void main(String args[]){
        employee e = new employee();
        e.get_data("Harsh","Mumbai",100000,3,3);
        e.compute();
        e.display();

    }
}
