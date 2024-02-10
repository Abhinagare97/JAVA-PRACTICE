package arraylist;
import java.util.*;
public class eg3 {
    public static void main (String [] args){
        ArrayList <ArrayList <Integer> > list = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        for (int i = 1 ; i<=5 ; i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }

        list.add(list1);
        list.add(list2);
        list.add(list3);

        System.out.println(list);
        System.out.println(list1.get(0));
    }
    
}
