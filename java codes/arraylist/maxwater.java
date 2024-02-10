package arraylist;
import java.util.*;
public class maxwater {

    public static int maximum(ArrayList <Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<list.size(); i++){
            for(int j= i+1; j< list.size();j++){
                int height = Math.min(list.get(i), list.get(j));

                int width = j-i;

                int waterstored = height*width;
                
                max = Math.max(waterstored , max);
            }
        }
        return max;
    }
    public static void main(String [] args){
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);list.add(6);list.add(2);list.add(5);list.add(4);
        list.add(8);list.add(3);list.add(7);

        System.out.println(maximum(list));
    }
}
