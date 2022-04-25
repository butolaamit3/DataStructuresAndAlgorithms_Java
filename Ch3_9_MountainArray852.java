// 852. find the peak index in mountain array

public class Ch3_9_MountainArray852 {
    public static int mountainArray(int [] arr){
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

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,8,5,3,1};
        System.out.println(mountainArray(arr));
    }
    
}
