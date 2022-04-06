public class Ch2_4_maxIn2DArray {
    public static int max(int[][] arr) { //int[] because we have to initialize new array to store the index
        // 1.Using For loop
        int max = arr[0][0];
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col]; //we simpally not return row, col. First we have to initialize new arr[]
                }

            }
        }
        return max;
    }

    // 2. Using enhance for loop
    public static int maxx(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for(int element : row){
             if(element>max){
                 max = element;

                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] arr = {{23,4,1},{18,1002,3,9},{77,99,34,56},{132,454}};
        System.out.println(max(arr));
        System.out.println("Maximun element is: "+maxx(arr));
    }

   
    
}

