public class aisehi {
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

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 6, 7, 8 };
        arraypair(numbers);
    }

}