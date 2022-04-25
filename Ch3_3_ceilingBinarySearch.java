// Q. find the ceiling of a number in an array
// Ceiling--> smallest element which is greater or equal to the target element;

// int [] arr = {1,5,8,12,14,16,21,25,26,30,31,34,37};
// ceiling(27) == 30 because 30 is the only samllest number which is greater or equal to 27
// ceiling(22)== 25


public class Ch3_3_ceilingBinarySearch {

    // This function is used to find the ceiling of a number
    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        // nut what if the target is the greatest than the greatest element in an array
        // means  int [] arr = {2,3,5,9,14,16,18}; in this our target is 19 and there is no greater element than 19.
        if(target>arr[arr.length-1]){
            return -1;
        }

        while(start<=end){

            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return arr[mid];

            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
// If we does not found the target element then while loop terminated because start>end by(start = mid+1) and answer is new start
        return arr[start];
    }
    
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,7));
        
    }
}
