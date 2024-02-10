package arraylist;
import java.util.*;
public class eg1 {
    public static void swap(int a, int b, ArrayList <Integer> List){
        int temp;
        temp = List.get(a);
        List.set(a , List.get(b));
        List.set(b, temp);

    }
public static void main(String[] args){
    ArrayList <Integer> List = new ArrayList<>();
    List.add(1);
    List.add(2);
    List.add(3);
    List.add(4);
    List.add(5);
    List.add(6);

    int indx1=2; int indx2=3;
    System.out.println(List);
    swap(indx1, indx2, List);
  System.out.println(List);
}
}
