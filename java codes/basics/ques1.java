import java.util.*;
public class ques1 {
    //Enter cost of3 items from the user(usingfloatdatatype)-apencil,a pen and an eraser.
    // You have to output the total cost of the items back to the user as their bil
    public static void main(String args[]){
        System.out.println("enter the price of three items");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        
        int total = (a+b+c);
        int gst = (total*18)/100;
        int costwithgst = (total+gst);
        System.out.println("the payable amount after applying 18% gst is:"+ costwithgst);


    }
}
