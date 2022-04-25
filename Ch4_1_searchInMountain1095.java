// 1095. Find in mountain array

public class Ch4_1_searchInMountain1095 {

    public static int search(int[] arr, int target){
        int peak = peakIndexMountainArray(arr);
        int firstTry=orderAgnosticBinarySearch(arr, target, 0 ,peak);

        if(firstTry != -1){
            System.out.println("FirstTry"+firstTry);
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }


    // This function is used to get the peak because we have to find the start and end of both asc and desc array
    public static int peakIndexMountainArray(int [] arr ){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in decreasing part of array
                // this may be the answer, but search in the left part
                end  = mid;
                
            }
            else{
                // you are in asce part of array
                start = mid+1; // because you that mid is smaller than mid+1, so start is mid+1
            }
        }
        // In the end start == end loop break , pointing to the largest number
        return start;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){

        // return idf there is none element in the array
        if(arr.length==0){
            return -2;
        }
        
        // To check weather the array is in ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }

        while(start<=end){
            int mid = start +(end-start)/2;

            // if the target is found on mid return arr[mid]
            if(target==arr[mid]){
                return mid;
            }

            // if the array is in ascending order and target is less than mid element
            if(isAsc==true){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }      
            }

            // if the array is in descending order and target is greater than mid element
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        // return if the element is not present in the array
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(search(arr, 4));
    }

    

    
}
