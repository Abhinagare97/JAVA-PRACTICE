public class reverseanumber {
    public static void main(String[]args){
        int a = 12345;
        while ( a>0){
            int b = a%10;
            System.out.print(b);
            a=a/10;
        }
    }
    
}

