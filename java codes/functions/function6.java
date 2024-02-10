package functions;

public class function6 {
     public static int factorial(int n ){
        int result=1;
        for(int i=1; i<=n ; i++){
            result = result *i;
        }
        return result;
     }
    public static void main(String [] args){
        int a = factorial(5);
        System.out.println(a);

    } 
}
