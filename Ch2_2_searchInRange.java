public class Ch2_2_searchInRange {
    public static int rangeSearch(int[] arr, int target, int start, int end){
        for(int i =start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
            if(arr.length==0){
                return -1;
            }
        }
        return -2;
    }
    public static void main(String[] args) {
        int[] arr = {1,31,76,34,86,8,35,12,432,867,};
        System.out.println(rangeSearch(arr, 1, 2, 7));
    }
}
