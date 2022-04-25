import java.util.Arrays;

public class Ch5_1_sortedMatrixBS {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(search(arr, 9)));
        

    }

    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        // if there is no element in the matrix
        if(matrix.length==0){
            return new int[]{-1,-1};

        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        // run the loop till two rows are remaining
        int rStart = 0;
        int rEnd = rows-1; // rEnd= 2
        int cMid = cols / 2; //cMid = 1
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int rmid = rStart + (rEnd + rStart) / 2;
            if (matrix[rmid][cMid] == target) {
                return new int[] { rmid, cMid };
            }

            if (target > matrix[rmid][cMid]) {
                rStart = rmid; // Ignoring the above matrix  
            } 
            else { //target<matrix[mid][cMid]
                rEnd = rmid; // Ignoring the below matrix

            }

        }
        // now we have only two rows remaining
        // Chel weather the target is in the colm of 2nd rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }

        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        // Otherwise search in 1st half

        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);

        }

        // Otherwise search in 2nd half
        if(target>=matrix[rStart][cMid+1] && target <=matrix[rStart][cols-1]){
           return binarySearch(matrix, rStart, cMid+1, cols-1, target);
            
        }

        // Otherwise search in 3rd half
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
            
        }

        // Otherwise search in 4th half
        else{
            // target>=matrix[rStart+1][cMid+1]
            return binarySearch(matrix, rStart+1, cMid-1, cols-1, target);
            
        }

    }

    // this function is for to search in the particular row
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (target < matrix[row][mid]) {
                cEnd = mid - 1;
            } else {
                // target>matrix[row][mid]
                cStart = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

}
