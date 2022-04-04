import java.util.ArrayList;
import java.util.Scanner;

public class Ch1_4_arrayListExample {
    public static void main(String[] args) {
        System.out.print("Enter the elements: ");

        Scanner sc = new Scanner(System.in);
        
        // Syntax

        ArrayList<Integer> list = new ArrayList<>(10); // You can also write the dataType in the object <> but it is not mandatory
        // We gives the initial capactity ofr 10 but you can store as many as elements you want
        list.add(43);
        list.add(24);
        list.add(32);
        list.add(44);
        list.add(34);
        list.add(40);
        list.add(28);
        list.add(2);
        

        // To print the ArrayList
        System.out.println(list);

        // To check the element contains or not
        System.out.println(list.contains(32));

        // To change the value of element at specific index
        list.set(0, 105);
        System.out.println(list);

        // to remove the value at specific index
        System.out.println(list.remove(0));
        System.out.println(list);


        // To take input from user
        for(int i = 0;i<5;i++){
            list.add(sc.nextInt());
        }  


        // To print to arrayList
        for(int i = 0; i<5;i++){
            System.out.print(list.get(i)+" "); // Pass index here
        }

         
    }
    
}
