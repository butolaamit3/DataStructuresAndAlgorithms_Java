public class Ch3_1_binarySearchDecending {

    // this function is used to Return the index
    public static int binarySearch(int[] arr, int target){

        // If there is none element in the array
        if(arr.length==0){
            return -1;
        }

        int start = 0;
        int end  = arr.length;
        while(start<=end){
            // find the middle element
            // int mid = start+end/2;  
            // integer has a fixed size // might be possible the start + end value exceed the range of int in java

            int mid = start+(end-start)/2;

            // if the target is found on mid return arr[mid]
            if(arr[mid]==target){
                return mid;
            }

            // If target is less than mid element and array is in descending order
            if(target<arr[mid]){
                start = mid+1; 
            }

            // If target is greater than mid element and array is in descending order
            else{
                end = mid-1;
            }
            
        }
        // if the element you aearch is not present in the array return -2
        return -2;

    }

    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println(binarySearch(arr,4));

    }

}
