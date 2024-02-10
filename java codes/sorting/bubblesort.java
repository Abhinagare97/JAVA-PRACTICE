package sorting;

public class bubblesort {
    public static void BubbleSort(int arr[]){
        for (int turn = 0; turn< arr.length-1; turn++){
            for(int i =0; i < arr.length-1; i++){
                if (arr[i]> arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
               // System.out.print(arr[i]);
                }
            }
        }
    }
    // selection sort
    public static void SelectionSort(int arr[]){
        for( int i=0; i< arr.length-1; i++){
            int min = i;
            for( int j= i+1; j< arr.length; j++){
                    if ( arr[min] > arr[j]){
                        min= j;
                    }

            }
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i]= temp;  
        }
        
    }
    public static void printsort(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int arr[]={5, 4, 1, 3,9, 8, 2};
       // BubbleSort(arr);
       SelectionSort( arr);
        printsort(arr);
    }
    
}
