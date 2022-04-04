public class Ch1_7_maxInArray {
    public static int max(int[] arr) {
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,45,24,265344,21,42,54};
        System.out.println(max(arr));
        
    }

    
    
}
