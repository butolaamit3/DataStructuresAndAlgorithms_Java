
public class Ch2_0_linearSearchAlgorithms {
    // Search in the array: return the index if the element found
    // Othetrwise return -1, if the element not found
    public static int linearSearch(int[] arr, int target){
        // If there is no element in that array return 0
        if(arr.length ==0){
            return -2;
        }

        for(int i =0;i<arr.length;i++){
            // Check for target at every index
            if(arr[i]==target){
                return i;

            }

        }
        // this l,ine will execute if none of the return statement above have executed
        // hence target not found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,34,64,86,23,97,46,0,-435};
        System.out.println(linearSearch(arr,86));
        
    }
    
}
