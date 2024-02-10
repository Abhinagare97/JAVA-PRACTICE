import java.util.*;
public class areaofcircle {
    public static void main(String args[]){
        System.out.println("input the radius of the circle");
        Scanner sc=new Scanner(System.in);
        float rad= sc.nextFloat();
        float area = 3.14f *rad*rad;
        System.out.print("the area is: "+ area);
    }
    
}
