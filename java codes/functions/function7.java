package functions;

public class function7 {
    public static int factorial(int a){
        int result=1;
        for ( int i =1; i<=a; i++){
            result*=i;

        }
        return result;

    }
    public static int facto(int a, int b){
        int nfact = factorial(a);
        int rfact= factorial(b);
        int nmrfact = factorial(a-b);
        System.out.println(nfact);
        System.out.println(rfact);
        System.out.println(nmrfact);
        
        int facto= (nfact/(rfact*nmrfact));
        return facto;
    }
    
    public static void main(String [] args){
      
        System.out.println(facto(5,2));

    }
    
    
    
}
