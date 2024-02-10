import java.util.*;
public class stars{
    public static void main(String [] args){
        System.out.println("enter the number of lines");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        for( int line=0 ; line<=a; line++){

            for( int stars=1; stars<=line; stars++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}