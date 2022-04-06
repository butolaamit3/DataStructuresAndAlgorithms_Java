import java.util.Arrays;

public class Ch2_3_searchIn2DArray {
    public static int[] search(int[][] arr, int target) { //int[] because we have to initialize new array to store the index

        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[] {row,col}; //we simpally not return row, col. First we have to initialize new arr[]
                }

            }
        }
        // If now found return this 
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {{23,4,1},{18,12,3,9},{77,99,34,56},{132,454}};
        System.out.println(Arrays.toString(search(arr,454)));
    }

   
    
}
