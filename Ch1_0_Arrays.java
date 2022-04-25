import java.util.Scanner;

import javax.print.attribute.SupportedValuesAttribute;

public class Ch1_0_Arrays {
    public static void main(String[] args) {
        
        // Q: Store a roll number
        int rol = 34;


        // Q: Store a person's name

        String name = "Amit Butola";

        // Q: Storr 5 roll numbers
        int rno1 = 45;
        int rno2 = 46;
        int rno3 = 47;
        int rno4 = 48;
        int rno5 = 49;

        // To store all the roll no. in one place without initiliazong to new variable we use Array

        // Array Syntax

        // dataType[] variableName = new dataType[size];

        // To store 5 roll no.

        int[] rno = new int[5];

        // int[] rno-->Decleration of an array and rno is a refrence here. rno is getting defined in the stack. It is at compiletime
        // new int[5]-->initialization, this is the object and it is being created in heap. It is at runtime
         
        rno[0] = 45;
        rno[1] = 46;
        rno[2] = 47;
        rno[3] = 48;
        rno[4] = 49;

        // or directly
        int[] rnol = {45,46,47,48,49};

        // Check array is sorted or not
        System.out.println("Enter the size of array you want: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of an array: ");
        
        // Input elements
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // to find array is sorted or not
        boolean isSort = true;

        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSort = false;
            }
        }
        if(isSort==true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    
    }


    
}
