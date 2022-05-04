import java.util.ArrayList;

public class Ch7_3_stringOperators {
    public static void main(String[] args) {

        System.out.println("a"+"b"); // This is combine a and b like: ab because they are string.

        System.out.println('a'+'b'); // This will give the sum of there Ascii valus because they are character.

        System.out.println('a'+3); // It gives the sum of 3 and Ascii value of a

        System.out.println((char)('a'+3)); // First it gives the sum of 3 and ascii value of a then typecast to char

        System.out.println("a"+1+2); //This will print as usual is: a12
        // the integer 1 and 2 will be converted to raper class integer (bigger Integer) that will call toString()

        System.out.println("Amit"+ new ArrayList<>()); // this will return an empty array of amit


        // System.out.println(50 + new ArrayList<>()); 
        // error because all the two object are complex to make it correct you should use atleast one string object
        System.out.println(50 +""+ new ArrayList<>()); // + operator only work for primitive

        System.out.println("a"+'b'); // If one of the data type is string , answer will be string


    }
    
}
