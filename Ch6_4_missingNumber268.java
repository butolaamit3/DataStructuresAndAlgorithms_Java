

public class Ch6_4_missingNumber268 {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingNumber(arr));
        
    }

    public static int missingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1; 
            if(arr[i]<arr.length &&arr[i]!=arr[correct]){ //arr[i]<arr.length it is because if there is index out of bound for that element, skip
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
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;

    }
    
}
