package recursion;

public class five {
    public static int firstOccurance(int arr[], int key , int i){
        if(i == arr.length-1){
            return -1;
        }
        
        if( arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
        
    }


//second similar function done for practice
    public static int firstoccurance(int arr[], int key,int i){
        
        if (i ==arr.length-1){
            return arr.length-1;
        }
        if (arr[i]==key){
            return i;
        }

        return firstoccurance(arr,key,i+1);
    }
    public static void main(String [] args){
        int arr[]= {2, 4, 6, 8, 4 ,2, 7 ,8 ,5, 7, 9};
       // System.out.println("the first occurance is "+(firstOccurance(arr, 8,0)));
       System.out.println("the first occurance is "+(firstoccurance(arr, 9,0)));
    }
    
}
