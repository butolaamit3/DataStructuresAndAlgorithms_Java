import java.util.Arrays;

public class Ch5_1_sortedMatrixBS1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12,13}};
        System.out.println(Arrays.toString(search(arr, 13)));
    }

    public static int[] search(int[][] matrix, int target) {

        // if there is no element in the matrix
        if(matrix.length==0){
            return new int[]{-1,-1};

        }

        int row = matrix.length; // = 3

        // always take the row which have maximum col like here all have same no. of element so we take 0.
        int col = matrix[0].length; // = 4


        int start = 0;
        int end = (row * col)-1; // = 11

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[mid / col][mid % col] == target) {
                return new int[] { mid / col, mid % col };
            }
            if (target > matrix[mid / col][mid % col]) {
                start = mid + 1;
            } 
            else {
                // target < matrix[mid/col][mid%col]
                end = mid-1;
            }
        }
        return new int[] {-1,-1};
    }

}
