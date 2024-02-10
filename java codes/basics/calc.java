import java.util.*;
public class calc{
    public static void main(String []args){
        System.out.println("Enter the numbers and then enter the operator ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+': System.out.println("the addition is : " + (a+b));
            break;
            case '-': System.out.println("the sub is : " + ( a-b));
            break;
            case '*': System.out.println("the multiplication is : " + ( a*b));
            break;
            case '/': System.out.println("the division is : " + ( a/b));
            break;
            default : System.out.println("Something went wrong");
        }


    }
}