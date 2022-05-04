import java.util.Arrays;

// find duplicate and missing number(745)

public class Ch6_7_setMismatch645 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(setMismatch(arr)));
        
    }
    public static int[] setMismatch(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1; 
            if(arr[i]!=arr[correct]){ 
                int temp = arr[i];
                arr[i] = arr[correct]; 
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        // search for first missing number
        for(int index = 0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return new int[] {arr[index],index+1};
            }

        }
        return new int[] {-1,-1};
    }

    
}
