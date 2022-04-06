import java.util.Scanner;

public class Ch1_8_searchinhArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array which you want to create: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the elements of aan array: ");

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the element you want ot search: ");
        int num = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("Elements found at index: "+i);
            }

        }
    }
    
}
