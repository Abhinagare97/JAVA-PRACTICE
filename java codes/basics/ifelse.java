import java.util.*;
public class ifelse {
    public static void main(String args[]){
        System.out.println("Input your age:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a<18){
            System.out.println("you are not allowed");

        }else{
            System.out.println("you are allowed");
        }
    }
    
}
