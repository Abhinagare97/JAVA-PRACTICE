package newarrays;

public class binsearch {
    public static int binSearch(int arrayy[], int key) {
        int start = 0;
        int end = arrayy.length - 1;
        // int mid = (start + arrayy.length) / 2;
        while (start <= end) {
            int mid = (start + arrayy.length) / 2;
            if (mid == key) {
                return mid;
            }
            if (mid > key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arrayy[] = { 2, 4, 5, 6, 8, 8, 9, 12, 32, 43, 54, 65, 82, 84, 94, 98, 99 };
        int key = 54;
        System.out.println("the element is aat the index" + binSearch(arrayy, key));
        System.out.println("the element is aat the index");
    }

}
