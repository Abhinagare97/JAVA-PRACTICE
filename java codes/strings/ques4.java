package strings;

public class ques4 {

    public static String substrings(String str, int startindex, int endindex){
        String str1 = "";

        for ( int i = startindex; i< endindex; i++){
            str1 += str.charAt(i);
        } 
        return str1;
    }
    public static void main(String[] args){
        String str = "hello world";

        System.out.println(substrings(str, 0,5));
        System.out.println(str.charAt(2));

    }
    
}
