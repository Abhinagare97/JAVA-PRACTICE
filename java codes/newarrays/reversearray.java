public class reversearray {
    
    public static int reverse(numbers[]){
        int starrt= 0, end = numbers.length-1;
        while(starrt<last){
            int temp = numbers[end];
            numbers[end]= numbers[starrt];
            numbers[starrt]= temp;
            starrt++;
            end--;

        }
    }

    public static void main(String [] args){
        int numbers[] = {1,3,4,6,8,10};
        reverse(numbers);

    }
    
}
