import java.util.Arrays;

public class Ch6_3_cyclicSort {
    public static void main(String[] args) {
        int[] arr= {4,3,6,2,1,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void cyclic(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1; // This is for to get the correct index of element means 1 is at 0 index, 2 is at 1 index....
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct]=temp;
            }
            else{

                i++;
            }
        }

    }
    
}
