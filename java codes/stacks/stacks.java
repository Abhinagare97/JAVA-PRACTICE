package stacks;
import java.util.*;
// IMPLEMENT STACK USING ARRAYLIST
public class stacks {
    static class stackss{
    static ArrayList <Integer> List = new ArrayList<>();
        // public boolean isEmpty(){
        //     return List.size()==0;
        // }
        // push operation
        public static void push(int data){
            List.add(data);
        }

        // pop
        public static int pop(){
            int top = List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;

        }//peek
        public int peek(){
            return List.get(List.size()-1);
        }
        
    }

public static void main(String[] args){
    stackss s = new stackss();
    
    //System.out.println(s.isEmpty());
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    s.peek();

    
}
}