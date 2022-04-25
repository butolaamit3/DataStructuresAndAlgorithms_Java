// Q. Find the first occurance of an number in sorted array

public class Ch3_7_firstOccurance {

    public static int first(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                ans = mid;
                end = mid-1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,5,5,7,6,8,8,10};
        System.out.println(first(arr, 5));
        
    }
    
}
