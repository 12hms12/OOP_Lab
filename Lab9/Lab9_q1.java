import java.util.*;
public class Lab9_q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a String : ");
        String sent = sc.nextLine();
        System.out.println("Characters = "+sent.length());
        int count_word=1,count_vow=0, count_line=0 ;
        sent = sent.toUpperCase();
        char[] ch = sent.toCharArray();
        for(int i=0;i<sent.length();i++){
            if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') count_vow++ ;
            if(ch[i] == ' ') count_word++;
            if(ch[i]=='.') count_line++;
        }
        System.out.println("Vowels = "+count_vow);
        System.out.println("Words = "+count_word);
        System.out.println("Lines = "+count_line);
    }
}
