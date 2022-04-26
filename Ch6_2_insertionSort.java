import java.util.Arrays;

public class Ch6_2_insertionSort {
    public static void main(String[] args) {
        int [] arr ={23,5,1,8,2,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for(int i = 0;i<=arr.length-2;i++){ //i only run till the 2nd last index
            for(int j = i+1;j>0;j--){ // j run till j>0 because for 0 j-1 will give indexOutOfBound
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    
}
