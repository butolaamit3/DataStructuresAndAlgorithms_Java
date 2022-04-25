// 33. Search the element index in the rotated distinct sorted array
// Distinct means no duplicate element

public class Ch4_2_rotatedBinarySearch33 {

    // this function is use to find the target element
    public static int search(int[] nums, int target){

    
        int pivot = findPivot(nums);

        // If pivot is not found this means this is not a rotated array
        if(pivot ==-1){
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);

        }
        // if pivot is found you means you have two ascending sorted array
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            // This checks in between start 0  to end pivot-1, we have to ignore the right part
            // Start = 0, End = pivot-1
            return binarySearch(nums, target, 0, pivot-1);
        }
        // this is because the element ia in the right side of pivot and we have to ignore the left array 
        // if(target<=arr[0])
        // Start = pivot+1, End = arr.length-1
        return binarySearch(nums, target, pivot+1, nums.length-1);

    }
    

    // this function is use to find the pivot
    // and this is only for non duplicate values
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            // Case 1.
            if(mid<end && arr[mid]>arr[mid+1]){ //what if mid is the last element of the array and mid+1 is out of bound
                // thats why mid<end

                return mid;
            }


            // Case 2.
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            // Case 3.
            if(arr[mid]<=arr[start]){ //ignore element from mid to laste because the are smaller 
                end = mid-1;

            }
            // Case 4. 
            else{
                //arr[mid]>=arr[start] ,,,,,,>= because what is there is only one element in the array
                start = mid+1;
            }
        }
        return -1;
    }


    // This method is used to find pivot if there are duplicate elements in the array
    public static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            // Case 1.
            if(mid<end && arr[mid]>arr[mid+1]){ //what if mid is the last element of the array and mid+1 is out of bound
                // thats why mid<end
                return mid;
            }

            // Case 2.
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            
            // if elements at middle, start, end are equal just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]== arr[end] ){
                // what is the elements at start and end were the pivot??
                
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                // skip start because if start is not pivot then skip it
                start++;

                if(arr[end]<arr[end-1]){ 
                    return end-1;

                }
                end--;

            }
            // left side is sorted so pivot is in the right side because if the pivot is in the left side it caught in previou cases
            else if(arr[start] < arr[mid] ||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }
            else{
                end = end -1;
            }
        }
        return -1;
    }

    

    public static int binarySearch(int[] arr, int target,int start, int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                // answer found target ==mid
                return mid;
            }
        }
        // if answer not found
        return -1;

    }


    public static void main(String[] args) {
        // int [] arr = {3,4,5,6,0,1,2};
        // System.out.println(search(arr, 0));

        int [] arr1 = {2,2,9,1,2,2,2,2,2};
        System.out.println(findPivotWithDuplicate(arr1));
    }
}
