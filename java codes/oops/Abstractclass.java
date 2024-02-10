package oops;


public class Abstractclass {
    public static void main(String [] args){
        dog dg = new dog();
        dg.eat();
        dg.color();
        dg.breaths();

    }  
}

abstract class Animals{
 //abstract methods
    abstract void eat();
    abstract void color();
    // non abstract method
    void breaths(){
        System.out.println("this is a non abstact method = breathes");
    }
}
class dog extends Animals{ 
    void color(){
       System.out.println("abstract method = brown");
    }
    void eat(){
            System.out.println("abstract method = roti");
    }
    
    }
    
