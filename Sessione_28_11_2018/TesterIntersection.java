import java.util.Scanner;
public class TesterIntersection {

    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        System.out.println("Dammi una stringa");
        String a=t.next();
        System.out.println("Dammi una altra stringa");
        String b=t.next();
        if(MyString.intersection(a, b)) System.out.println("Hanno un carattere in comune");
        else System.out.println("non hanno caratteri in comune");
    }
    
}
