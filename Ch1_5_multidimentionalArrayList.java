import java.util.ArrayList;
import java.util.Scanner;

public class Ch1_5_multidimentionalArrayList {
    public static void main(String[] args) {
        System.out.println("Enter the elements: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        // Initialisation
        for(int i = 0;i<3;i++){ // this is to add array1 in to the arrayList, because first it is empty [Al(null),Al(null),Al(null)]
            list.add(new ArrayList<>());
        }

        // Add elements
        for(int row = 0;row<3;row++){
            for(int col = 0;col<3;col++){
                list.get(row).add(sc.nextInt());
            }
        }

        // Print out the ArrayList
        System.out.println(list);

    }
    
}
