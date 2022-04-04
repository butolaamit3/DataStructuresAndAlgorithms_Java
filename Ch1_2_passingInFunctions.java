import java.util.Arrays;

public class Ch1_2_passingInFunctions {
    public static void change(int[] arr){
        arr[2] = 99;
    }

    public static void main(String[] args) {
        int [] nums = {2,4,5,14};
        System.out.println(Arrays.toString(nums));

        change(nums); //it changes the number at the given index because the change function use refrence of an array
        System.out.println(Arrays.toString(nums));
    }
    
}
