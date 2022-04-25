// 410 Split array largest sum
// int[] arr = {7,2,5,10,8}
// m = 2; (no. of split part)
// output = 18;
// the best way to split
// {7,2,5} {8,10}
// Output: largest sum = 18


public class Ch4_4_splitArrayLargestSum410 {

    public static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;
        for(int i = 0; i<arr.length-1;i++){
            start = Math.max(start, arr[i]); //In the end of the loop will contains the max item from the array 
            end = end+arr[i];
        }

        // nor we have start and end , so simpally do binary search
        while(start<end){

            //try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in withthis max sum

            int sum = 0;
            int pieces = 1;

            for(int num: arr){
                if(sum + num > mid){
                    //you can not add in this subarray, make a new one
                    // sya you add this num in new subarray, then sum = num
                    sum = num;
                    pieces ++;
                }
                else {
                    sum = sum + num;
                }
            }

            if(pieces > m){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }
        return end; //here start ==end
    }

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr, 2));
    }
    
}

