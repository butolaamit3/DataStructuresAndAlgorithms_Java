import java.util.Arrays;
import java.util.Scanner;

public class Ch1_3_multidimentionalArray {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        // Multidimentional array is array of array, means in row 1 it is array1 row 1
        // is array2 and so on upto n.
        // Row1-->arr1 of element0,element1, element2 and so on upto n.

        System.out.print("Enter ther element: ");
        Scanner sc = new Scanner(System.in);
        // int [][] arr = new int[3][]; // You have to define no. of rows beacuse it is
        // mandatory, no. of column in not mandatory.
        // int[][] arr1 = {{1,2,3},{4,5},{6,7,8,9}};

        int[][] arr2 = new int[3][3];

        // Taking Input of 2D array

        for (int row = 0; row < arr2.length; row++) { // For each row
            for (int col = 0; col < arr2[row].length; col++) { // For each column,
                //  here arr2[row].length means every array at that row, the length of that array
                // arr2[row] --> Individual size of the row and .lenght--> length of thaat row
                arr2[row][col] = sc.nextInt();

            }

        }


        // 1. To print the array using for loop
        for (int row = 0; row < arr2.length; row++) { // For each row
            for (int col = 0; col < arr2[row].length; col++) {
                // For each column, here arr2[row].length means every array at that row the
                // length of that array

                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();

        }


        // 2. To print using .toString() method
        for(int row = 0;row<arr2.length;row++){
            System.out.println(Arrays.toString(arr2[row]));
        }



        // 2. Enhance for loop
        for(int[] a:arr2){  //int[]--> every single element in this array is itself is an array.
            System.out.println(Arrays.toString(a));
        }

    }

}
