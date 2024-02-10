package functions;

public class functionoverloading1 {
    
    public static int add(int a, int b){
        int c = a+b;
    return c ;}
    
    public static float add(float a, float b){
        float c= a+b;
    return c;
    }
    public static void main(String [] args){
        System.out.println(add(3,4));
        System.out.println(add ( 4.3f,2.7f));
    }
    
}
