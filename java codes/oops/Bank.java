package oops;

public class Bank {
    public static void main(String [] args){
        Customer c1 = new Customer();
        c1.setacno(5555);
        System.out.println("acno is "+ c1.getacno());
    }   
}
class Customer{
    private int acno; 
    public void setacno(int newacno){
        acno = newacno;
    }
    public int getacno(){
        return acno;
    }
}
