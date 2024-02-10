package strings;

// In this problem we are checking the largest string in the array of strings in this case we are using
// the compareTo function which uses the lexographic technique in which only the first letter in the array is 
// examined. If the first letter is larger then the value is directly stored in the largest variable.
// It also has a function  compareToIgnoreCase
public class ques5 {
    public static void main(String [] args){
        String fruits[] = {"mango", "cheeku", "atermelon", "papaya", "apple", "lemons"};
            String largest = fruits[0];
        for (int i =1 ; i < fruits.length; i++){
           
            if(largest.compareToIgnoreCase(fruits[i] ) < 0 ){
                largest = fruits[i];
            }

        }
        System.out.println(largest);

    }
    
}
