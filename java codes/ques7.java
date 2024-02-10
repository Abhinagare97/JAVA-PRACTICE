public class ques7 {
    // in this file we will understand the string builder class and some of its functions 
    // according to the java course and the geeksforgeeks website
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("hello ");
        for( char ch = 'a'; ch < 'z'; ch ++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
    
}
