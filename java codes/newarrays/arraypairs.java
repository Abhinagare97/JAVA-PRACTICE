package newarrays;

import javax.xml.namespace.QName;

public class arraypairs {
    public static void arraypair(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int second = numbers[j];
                System.out.print("(" + curr + "," + second + ")");
            }
            System.out.println(" ");
        }
    }

    public static void arraypair2(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int latest = numbers[j];
                System.out.print("(" + cur + "," + latest + ")");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        arraypair(numbers);
        arraypair2(numbers);
    }

}