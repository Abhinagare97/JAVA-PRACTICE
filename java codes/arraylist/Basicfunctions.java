package arraylist;
import java.util.*;
public class Basicfunctions {
    public static void main (String[]args){
    ArrayList <Integer> List = new ArrayList<>();
    // add function
    List.add(1);
    List.add(2);
    List.add(3);
    List.add(4);
    List.add(5);
    List.add(6);
    System.out.println(List);
    // get function
    System.out.println(List.get(1));
    // set function
    List.set(0, 5);
    System.out.println(List);
    //delete function
    List.remove(5);
    System.out.println(List);
    //contains  method   returns true
    System.out.println(List.contains(5));
    }
}
