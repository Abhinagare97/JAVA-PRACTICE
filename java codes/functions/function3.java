package functions;

public class function3 {
    public void method1(){
        //THIS METHOD HAS NO RETURN TYPE HENCE VOID IS USED
        System.out.println("Method with no parameters");
    }
    public static int method2(int a ){
        System.out.println("method with parameters "+ a);
        return 0;
    }
    public static void main(String [] args){
        // method1();
        method2(2); 

    }
}
