package stacks;
import java.util.ArrayList;
// IMPLEMENT STACK USING LINKEDLIST
public class eg1 {
    static class stack{
        static ArrayList <Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int n){
            list.add(n);
        }

        public static int pop(){
            int num = list.get(list.size()-1);
            list.remove(list.size()-1);
            return num;
        }

        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String [] args){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
