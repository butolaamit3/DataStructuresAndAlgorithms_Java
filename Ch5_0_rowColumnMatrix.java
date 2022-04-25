import java.util.Arrays;

// Search in a sorted matrix

public class Ch5_0_rowColumnMatrix {
    public static void main(String[] args) {
        int [][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(search(arr, 50)));
        
        
    }

    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target){
                return new int[]{row,column};
            }

            // in this if my target is greater than [row][column] we have to eleminate that complete row
            if(target>matrix[row][column]){
                row++;
            }
            else{
                // in this if my target is smaller than [row][column] we have to eleminate complete column
                // target<matrix[row][column]
                column--;
            }

        }
        return new int[]{-1,-1};

    }
    
}
