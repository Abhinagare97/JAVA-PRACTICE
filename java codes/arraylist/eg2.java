package arraylist;
import java.util.*;
public class eg2 {
    //creating multidimensional array
public static void main(String[] args){
        ArrayList <ArrayList <Integer>> mainlist = new ArrayList <>();

        // creating second  list
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        mainlist.add(list1);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.add(6);

        mainlist.add(list2);

        for (int i =0; i<mainlist.size();i++){
            ArrayList<Integer> currentlist = mainlist.get(i);
            
            for (int j =0; j< currentlist.size(); j++){
                System.out.print(currentlist.get(j));
            }
            System.out.println(" ");
            
        }

        System.out.println(mainlist);


}
}
