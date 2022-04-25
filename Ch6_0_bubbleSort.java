import java.util.Arrays;

public class Ch6_0_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6};
        
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void bubble(int[] arr){
        boolean swapped; // this is for if array is swapped so no need to run for i = 1,2,3 and till arr.length
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            
            // run the step n-1 (array length -1) times
            // for each steps, max items will come at the last respected index
            for(int j=1;j<arr.length-i;j++){
                // swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped= true;
                }


            }
            // if you did now swap for a particular value of i, this means array is sorted hence stop the program
            if(swapped = false){

                break;
            }



        }
    }
    
}
