package oops;

public class Superkeyword {
    public static void main(String [] args){
        dog d = new dog();
        
    }
    static class animal{
        animal(){
            System.out.println("animal constructor is called");0
        }
        void eats(){
            System.out.println("eats");
        }

    }
    static class dog extends animal{
        dog(){
        super();
            System.out.println("dog constructor is called");
        }
    }
}
