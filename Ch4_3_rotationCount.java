// Find the rotation count in rotation sorted array
// int[] arr = {15,18,2,3,6,12}
// output: no of rotation = 2, ie. index of pivot+1

public class Ch4_3_rotationCount {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12 };
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        if(pivot ==-1){
            // array is not rotated
            return 0;
        }
        else{
            return pivot +1;
        }
        
    }


    // use whene there is no duplicates in the array
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


    
}
