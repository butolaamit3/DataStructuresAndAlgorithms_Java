public class Ch2_5_EvenDigitsLeetCode {

    // Function to count the even number digit
    public static int findNumber(int[] nums){
        int count =0;
        for(int element: nums){
            if(digit(element)%2==0){
                count++;
            }
        }
        return count;
    }

    
    // Count number of digits in a number

    public static int digit(int num){
        int count = 0;
        if(num ==0){
            return 1;
        }
        // to conver negative integer into Positive
        if(num<0){
            num =  num*-1;
        }
        while(num>0){
            count ++;
            num = num/10;
        }
        return count;
    }

    // 2. way to find the number of digits
    public static int digit2(int num){
        if(num ==0){
            return 1;
        }
        // to conver negative integer into Positive
        if(num<0){
            num =  num*-1;
        }
        
        return (int)(Math.log10(num))+1;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
        System.out.println(digit(-123));
        System.out.println(digit2(1234));
        
        
    }
    
}
