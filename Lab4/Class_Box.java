class box{
    double length,width,height,vol;
    box(double l, double w, double h){
        length = l;
        width = w;
        height = h;
    }
    double volume(){
        return length*height*width;
    }

}

public class Class_Box {
    public static void main(String args[]){
     box b = new box(1,2,3);
     System.out.println("Volume = " + b.volume());
  }
}



