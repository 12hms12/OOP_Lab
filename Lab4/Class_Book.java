import java.util.* ;
class book{
    String name,author;
    int edition;
    book(String a, String b, int e){
        name = a;
        author = b;
        edition =e;
    }

}

public class Class_Book {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
    book[] b = new book[6];
    b[0] = new book("Harry Potter 1","jkrowling",1);
    b[1] = new book("Harry Potter 2","jkrowling",3);
    b[2] = new book("Lord Of The Rings","tolkien",4);
    b[3] = new book("Harry Potter 3","jkrowling",1);
    b[4] = new book("Percy Jackson","rickriordan",1);
    b[5] = new book("Harry Potter 4","jkrowling",1);
    System.out.println("Name of author: ");
    String auth = sc.next();
        for(book i: b)
        {
            if(auth.equals(i.author))
                System.out.println(i.name);
        }


    }
    
}
