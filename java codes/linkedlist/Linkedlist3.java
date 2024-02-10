package linkedlist;

public class Linkedlist3 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
            
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp!= null){
        System.out.print(temp.data+" >  ");
        temp= temp.next;
           }
    }

    // iterative search
    public static int itrsearch(int var){
        int i = 0;
        Node temp = head;
        while (temp != null){

            if (temp.data == var){
                return i;
            }
            i++;
            temp=temp.next;
            
        }
        return -1;

    }
    //Recursive search
    public static int helper (int a, Node head){
        if (head == null){
            return -1;
        }
        if (head.data == a){
            return 0;
        }
        int idx = helper( a, head.next );
            if(idx == -1){
                return -1;

            }
            return idx+1;
        }
    
    public static int recsearch (int a ){
        return helper(a, head);

    }

// remove element from list at the first position
    public static int removefirst(){
        
        int val = head.data;
        head = head.next;
        return val;
    }
    public static void main(String[]args){
        Linkedlist3 ll = new Linkedlist3();
        ll.print();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        //ll.removefirst();
        ll.print();
        System.out.println();
        System.out.println(itrsearch(10));
        System.out.println(ll.recsearch(7));

    }
}
