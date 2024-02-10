package linkedlist;

public class LinkedList1{
    public static class Node{
        int data;
        Node next;

      public Node (int data ){
        this.data = data;
        this.next = null; 
      } 
    }
        public static Node head;
        public static Node tail;

        public void addfirst(int data){
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
        

    }
    public static void main(String [] args){
        LinkedList1 ll = new LinkedList1();
        ll.addfirst(4);
    }
}