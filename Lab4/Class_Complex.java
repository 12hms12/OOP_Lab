class complex{
    int real,imag;
    complex(){
        real = imag =0;
    }
    complex(int r,int i){
        real = r;
        imag = i;
    }
    void add(int a,complex b){
        real = a + b.real;
        imag = b.imag;
    }
    void add(complex a,complex b){
        real =a.real + b.real;
        imag = b.imag + a.imag;
    }
    void display(){
        System.out.println("Number = "+ real +"+" + imag +"i");
    }
}

public class Class_Complex {
    public static void main(String args[]){
        complex c1 = new complex(2,3);
        c1.display();
        complex c2 = new complex(1,9);
        c2.display();
        complex c3 = new complex();
        c3.add(4,c2);
        c3.display();

    }
}
  

 