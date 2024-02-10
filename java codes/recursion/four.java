package recursion;

public class four {
    // in these lines of code we will look at Fibonacchi series.
    public static int fibo(int n) {
        int nm1, nm2;
        if (n == 0 || n == 1) {
            return n;
        }
        nm1 = fibo(n - 1);
        nm2 = fibo(n - 2);

        int fn = nm1 + nm2;
        return fn;

    }

    // rewriting the program
    public static int recu(int n) {
        int i, j;
        if (n == 1 || n == 0) {
            return n;
        }
        i = recu(n - 1);
        j = recu(n - 2);
        int fn = i + j;
        return fn;
    }

    public static void main(String args[]) {
        System.out.println(fibo(25));
        System.out.println(recu(25));
    }

}
