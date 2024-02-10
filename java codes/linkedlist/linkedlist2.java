package linkedlist;

public class linkedlist2 {
    public static class Node{
        int data; 
        Node next;

        Node (int data){

            this.data = data;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data){
            Node newnode = new Node (data);
            size++;
            if(head ==null){
                head = tail= newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public void addLast(int data){
            Node newnode = new Node(data);
            size++;
            if( head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;

        }
        public void add(int data , int idx){
            Node newnode = new Node(data);
            size++;
            int i = 0;
            Node temp = head;
            while (i<idx-1){
                i++;
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;

        }  
        public static int removefirst(){
            if (size ==0){
                System.out.println("the size of the list is empty");
                return Integer.MIN_VALUE;
            }
            if (size == 1){
                int val = head.data;
                head = tail= null;
                size = 0;
                return val;

            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
            
        }
        public static int removelast(){
            if (size == 0){
                head = tail = null;
                System.out.println("the size of the list is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                int val = head.data;

                head = tail= null;
                size = 0;
                return val;

            }
            Node  prev = head;
            for (int i =0; i< size-2; i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;  
            size--;
            return val;
            
        }
        public static void printlist(){ 
            if (head == null){
                return;
            }
            Node temp = head;
            while(temp != null){
            System.out.print(temp.data+" > ");
            temp = temp.next;
            }System.out.println(" ");
        }
        // itterative search
        public static int itrsearch(int a ){
            int i =0;
            Node temp = head;
            while ( temp != null){
                
            if (temp.data == a){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

        }
        //Recursive Search
        public static int helper(int key, Node head){
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return 0;
            }
            int idx = helper(key, head.next);
            if(idx== -1){
                return -1;
            }
        
            return idx+1;
        }
        public static int recsearch(int key){
            return helper(key, head);
        }
    
        
       
        public static void main(String [] args){
            linkedlist2 ll = new linkedlist2();
           
            ll.addFirst(4);
            System.out.println("the size is "+ ll.size);
            ll.addFirst(5);
            ll.addLast(3);
            ll.addLast(2);
           // ll.printlist();
            ll.add(1,4);
            ll.printlist();
            ll.removefirst();
            ll.removefirst();
            ll.removelast();
            ll.printlist();
            
            System.out.println("the size is "+ ll.size);
            ll.printlist();
            System.out.println(ll.itrsearch(2));
            System.out.println(ll.recsearch(3));

        }

    }
    
     