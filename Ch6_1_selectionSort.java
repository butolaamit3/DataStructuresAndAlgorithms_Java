import java.util.Arrays;

public class Ch6_1_selectionSort {
    public static void main(String[] args) {
        int[] arr = {1,-12,0,12,4,2,8,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selection(int[] arr){
        for(int i = 0;i<arr.length;i++){
            // find the maximum item in the remaining array and swap with correct index.
            int last = arr.length-i-1; // means swap it with last index of remaining array
            int max = 0;
            for(int j = 1;j<=last;j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            swap(arr, max, last);
        }

    }
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // you can also use this function to find max
    // public static int getMaxIndex(int[] arr, int start, int end){
    //     int max = start;
    //     for(int i = start;i<=end;i++){
    //         if(arr[max]<arr[i]){
    //             max = i;
    //         }
    //     }
    //     return max;
    // }
    
}
