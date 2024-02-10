package newarrays;

public class arrays1 {
    public static int Linersearch(int ary[], int key) {
        for (int i = 0; i < ary.length; i++) {

            if (ary[i] == key) {
                return (i);

            }

        }
        return -1;

    }

    public static void main(String args[]) {

        int ary[] = { 1, 3, 4, 45, 54, 54, 6, 7, 76, 4, 33, 454, 65, 65, 90, 4, 546, };
        int key = 76;
        int index = Linersearch(ary, key);
        System.out.println("the key is present at " + index);
    }

}
