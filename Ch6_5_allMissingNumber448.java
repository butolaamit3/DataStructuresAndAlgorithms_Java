import java.util.ArrayList;

public class Ch6_5_allMissingNumber448 {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,1,2};
        System.out.println(allMissing(arr));
        
    }

    public static ArrayList<Integer> allMissing(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
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
                ans.add(index+1);
            }
        }
        return ans;

    }
    
}
