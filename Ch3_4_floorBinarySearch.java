// Q. find the floor of a number in an array
// floor--> greatest element which is smaller or equal to the target element;

// int [] arr = {1,5,8,12,14,16,21,25,26,30,31,34,37};
// floor(27) == 26 because 30 is the only greatest number which is smaller or equal to 27
// ceiling(22)== 21


public class Ch3_4_floorBinarySearch {

    // This function is used to find the floor of a number
    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // nut what if the target is the smallest than the smaller element in an array
        // means  int [] arr = {2,3,5,9,14,16,18}; in this our target is 1 and there is no smaller element than 1.
        if(target<arr[0]){
            return -1;
        }


        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;

            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
// If we does not found the target element then while loop terminated because start>end by(end=mid-1) and answer is new start
        return arr[end];
    }
    
    public static void main(String[] args) {
        int [] arr = {3,5,8,12,14,16,21,25,26,30,31,34,37};
        System.out.println(ceiling(arr,17));
    }
}
