package functions;
public class function5 {
public static int factorial(int n){
    int f= 1;
    for(int i =1;i<n ;i++){
        f=f*i;
    }
    return f;
}

public static void main(String []args){
   int a = factorial(6);
   System.out.println(a);
}

}

    

