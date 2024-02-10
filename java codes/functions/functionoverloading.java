package functions;
public class functionoverloading{
    public static void add(int a, int b){
        System.out.println("this calls the first function with two parameters passed a+b");
    }

    public static void add( int a, int b, int c){
        System.out.println("this fuction calls the fuction with three parameters a+b+c");
    }
    public static void main(String [] args){
        add(2,4);
      //  add(2,3,4);
    }
}