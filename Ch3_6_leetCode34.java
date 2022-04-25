// Q34. Find the first and last position of element in sorted array

public class Ch3_6_leetCode34 {

    static int[] firstAndLast(int[] nums , int target){

        //  If the target is not found return this 
        int[] ans = {-1,-1};

        // we have to run the same function for first occurance and last occurance so we made it to a seperate function.
        
        ans[0] = search(nums, target, true); // this runs for the first occurance 
        if(ans[0]!=-1){

            ans[1] = search(nums, target, false); // this runs for the last occurance
        }


        return ans;

    }

    // this function runs twice and return the index vakue of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end  = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            // if the target is found on mid potentail answer is found
            if(nums[mid]==target){
                ans = mid;
                if(findStartIndex==true){
                    end = mid-1;

                }
                else{
                    start = mid+1;
                }
            }

            // If target is less than mid element and in ascending order
            if(target<nums[mid]){
                end = mid-1;
            }

            // if target is greater than mid elemnt and in ascending order
            else{
                start = mid+1; 
            }
            
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,12,12,12,10};
        System.out.println(firstAndLast(arr, 12 ));
    }

    
}