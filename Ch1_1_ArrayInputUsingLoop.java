import java.util.Arrays;
import java.util.Scanner;

public class Ch1_1_ArrayInputUsingLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("Enter the elements: ");
        Scanner sc = new Scanner(System.in);

        // // Input using for loop
        // for(int i =0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }


        // // 1. Print the lement of an array using for loop
        // System.out.print("The elements of an array are: ");
        // for(int i = 0;i<arr.length;i++){
            
        //     System.out.print(arr[i]+" ");
        // }
        

        // // 2. Enhance for loop (For each loop)
        // for(int num :arr){
        //     System.out.print("\n"+num+" "); //here num represent elements of the array
        // }


        // // 3. To print the array using toString() method which is in Arrays class.
        // System.out.print(Arrays.toString(arr)+" ");



        // String array (To run this Commentout the uper int array code)
        String[] str = new String[5];
        for(int i =0;i<arr.length;i++){
            str[i] = sc.next();

        }

        System.out.println(Arrays.toString(str));

        // To modify string

        str[1] = "Amit"; //str[1] = is the refrence variable so it reflect the change in original object(String).
        System.out.println(Arrays.toString(str));

    }
    
}
