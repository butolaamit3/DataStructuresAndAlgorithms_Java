// Q. find the target element in an infinit size of array

public class Ch3_8_infinitArray {

    // This function use to get the size (start and end index) of an array
    public static int findingRange(int [] arr, int target){


        // start with the chunk of (array size) 2
        int start = 0;
        int end = 1;

        // condition for target to lie in the range
        while(target>arr[end]){

            // here new start ris end+1
            int temp = end+1;
            // and double the box value

            // end = previouszEnd+SizeOfBox*2 
            end = end+(end-start+1)*2;
            // 1+(1-0+1)*2 = 5 (Size of next index)index 2 to index 4 total 4 elements

            start = temp;
        }
        return binarySearch(arr, target, start, end);

    } 

    public static int binarySearch(int[] arr, int target,int start, int end){



        while(start<=end){

            // find the middle element
            int mid = start+(end-start)/2;

            // if the target is found on mid return arr[mid]
            if(target == arr[mid]){
                return mid;
            }

            // If target is less than mid element and in ascending order
            else if(target<arr[mid]){
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
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,175,179,182,190};
        System.out.println(findingRange(arr,130));  

        
    }
    
}
