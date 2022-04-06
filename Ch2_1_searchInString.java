import java.util.Arrays;

// Search a character in string


public class Ch2_1_searchInString {
    // 1. Using for loop
    public static boolean search(String str, char target){
        for(int i=0;i<str.length();i++){ //here str.lent() has a bracket beacuse it is a function of string class .length is simple variable
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    // 2. Using for each loop
    public static boolean search2(String str, char target){
        // for each loop only used in array thats why we have to convert string into array of character
        for(char a : str.toCharArray()){  //.toCharArray because we have to convert string into arrays
            if(a==target){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Amit";
        System.out.println(search(name,'A'));
        System.out.println(search2(name,'t'));
        System.out.println(Arrays.toString(name.toCharArray()));// used to print the array of character
    }
    
}
