public class Ch3_2_orderAgnosticBS {

    public static int orderAgnosticBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

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
            if(arr[mid]==target){
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
        int[] arr = {1,2,4,7,12,14,18,21,25,28,30,31,36,38,40,51,53,57};
        int[] arr1 = {99,70,65,61,54,51,49,42,30,20,12,8,5,1,-5};
        System.out.println(orderAgnosticBinarySearch(arr, 4));
        System.out.println(orderAgnosticBinarySearch(arr1, 61));
        
        
    }

}
