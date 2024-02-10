import java.util.*;
public class incometax {
public static void main(String args[]){
    System.out.println("Enter the income of yours in Lakhs: ");
    Scanner sc =new Scanner(System.in);
    int income = sc.nextInt();
    int tax=0;
    if (income < 500000){
        tax = 0;
    }
    else if (income > 500000 && income < 1000000){
        tax = (int)(income * 0.2);

    }
    else if (income > 1000000 && income < 3000000){
        tax= (int)(income * 0.3);
    }
    else{
        tax=income;
        System.out.println("No need to stay in india!!!");
    }
    
    System.out.println("the tax appicable for your income is: "+ tax );
}    
}
