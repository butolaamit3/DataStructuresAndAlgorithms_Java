import java.util.ArrayList;
import java.util.List;

public class Ch6_6_findallDuplicates442 {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
        
    }
    public static List<Integer> findDuplicates(int [] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1; // This is for to get the correct index of element means 1 is at 0 index, 2 is at 1index....
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int index= 0;index<arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
        

    }
    
}
