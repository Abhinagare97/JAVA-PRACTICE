package stacks;

    public class Eg3 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }

    }
    
    public static class Stack {
        static Node head;
        // CHECK IF THE STACK IS EMPTY
        public static boolean isEmpty(){
            return head == null;
        }
        //PUSH
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }
        //pop 
        public static int pop(){
            if(head == null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek 
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static void main(String [] args){
            Stack st = new Stack();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            System.out.println(st.peek());
        }
    }
    
}
