import java.util.*;
public class gstques
{
    
    public static void main(String args[]){
        int sum=0;
        
    System.out.println("enter the total items purchased: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    for(int i=0; i<number; i++){
        System.out.println("enter the price of the items that you have purchased: ");
        int price =sc.nextInt();
        sum =sum + price;
    }      
    System.out.println("the sum is: "+ sum);
    int gst = (sum*20)/100;
    int lastprice= sum+gst;
    System.out.println("the total price after applying the gst is: "+lastprice);

}
}
