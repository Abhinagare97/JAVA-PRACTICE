package newarrays;

//its just practice just dont refer this
import java.util.*;

class newarrays {
    public static void main(String[] args) {
        int ary[] = new int[20];
        ary[1] = 20;
        System.out.println("enter the 5 array elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int a = 0;
            a = sc.nextInt();
            ary[i] = a;
        }
        System.out.println("the array is:");
        int b = 0;
        for (int i = 0; i < 5; i++) {
            b = ary[i];
            System.out.print(b + ", ");
        }
    }
}
