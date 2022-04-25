// Q.744-> Find the smallest letter greater than target.(ceiling) 
// And if there is no smallest element greater than target return index1 this is called warpAround

public class Ch3_5_leetCode744 {

    // This function is used to find the ceiling of a number
    public static char ceiling(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        


        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        
        if(start==letters.length){
            return letters[0];
        }
        else{

            // this means arr[the modified start index%lenght of array = 2 % 4 = 2 ]
            return letters[start%letters.length];
        }
    }
    
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};

        System.out.println(ceiling(arr,'j'));


    }
}
