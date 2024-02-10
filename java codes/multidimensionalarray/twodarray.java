package multidimensionalarray;
import java.util.*;

class twodarray {

    public static void main(String [] args){
        int twod [] [] = new int[1][1];

        int n = twod.length;
        int m = twod[0].length;
        //System.out.print(n +" "+ m);
       // System.out.println("enter the numbers you want to enter in the matrix of size 3*3 :");

        for (int i=0; i< n; i++){
        
            for (int j = 0; j < m; j ++){
                Scanner sc = new Scanner(System.in);

                twod[i][j] = sc.nextInt();
            }
        }
       // System.out.println(twod[][]);
       for (int i=0; i< n; i++){
        
        for (int j = 0; j < m; j ++){
            System.out.print(twod[i][j]+" ");
        }
        System.out.println();
    }
    }

}
