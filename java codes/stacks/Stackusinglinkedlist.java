package stacks;
import java.util.*;
public class Stackusinglinkedlist {
    public class Node{
        public int data;
        public Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }
        public static class Stack{
        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            
        }
        //pop
        public static int pop(){
            Node newNode = new Node(int data){
                if(isempty){
                    return -1;
                }
                int val = head.data;
                head = head.next;
                return val;
            }
        }

    }
    public static void main(String [] args){
        Stack s = new Stack();
        s.push(4);
    }
    
}
