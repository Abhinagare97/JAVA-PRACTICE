package recursion;

public class three {
    public static int sumofn(int n ){
        if(n==1){
            return 1;
        }
        sumofn(n-1);
        int sum = n + sumofn(n-1);
        return sum;

    }   
    public static void main(String [] args){
        System.out.println(sumofn(5));
    } 
}
