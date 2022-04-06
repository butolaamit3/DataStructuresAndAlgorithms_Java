public class Ch3_0_binarySearchAlgorithm {

    // this function is used to Return the index
    public static int binarySearch(int[] arr, int target){

        // If there is none element in the array
        if(arr.length==0){
            return -1;
        }

        int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            // find the middle element
            // int mid = start+end/2;  
            // integer has a fixed size // might be possible the start + end value exceed the range of int in java
            int mid = start+(end-start)/2;

            // if the target is found on mid return arr[mid]
            if(arr[mid]==target){
                return mid;
            }

            // If target is less than mid element and in ascending order
            if(target<arr[mid]){
                end = mid-1;
            }

            // if target is greater than mid elemnt and in ascending order
            else{
                start = mid+1; 
            }
            
        }
        // if the element you search is not present in the array return -2
        return -2;

    }

    public static void main(String[] args) {
        int [] arr = {-12,-10,-7,-4,-1,0,1,4,6,12,14,16,20};
        System.out.println(binarySearch(arr, 12));

    }

}
