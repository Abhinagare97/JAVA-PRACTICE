package functions;

public class primeno {
    public static boolean isprime( int n){
        boolean isprime = true;
        for( int i =2; i < n; i ++ ){
            if( n % i ==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void primerange( int n ){
        for( int i =2; i< n; i++){
            if( isprime(i) ){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String [] args){
       // System.out.println(isprime(2));
       primerange(20);
    }
}
