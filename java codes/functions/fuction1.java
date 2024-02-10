package functions;
import java.util.*;

public class fuction1 {
    public static int addition(int a, int b){
      
        int c = a+b;
        return c;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int d = sc.nextInt();
        int a = addition(c, d);
        System.out.print("addition is"+ a);

    }

}
