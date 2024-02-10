package strings;

public class ques3 {
    public static void main(String [] args){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        //  COMPARING TWO STRINGS 
        if ( str1 == str2){
            System.out.println("they are equal");
        if (str1 == str3){
            System.out.println("they are equal");
        }
    else {
        System.out.println("they are not equal");

    }
        }

        if ( str1.equals(str3)){
            System.out.println("Now the two strings are equal");
        }
    }
    
}
