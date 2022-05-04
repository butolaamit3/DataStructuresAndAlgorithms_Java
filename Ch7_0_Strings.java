public class Ch7_0_Strings {
    public static void main(String[] args) {      
        String a = "Amit";
        String b = "Amit";

        // There are tha same object in the string pool so there is no need to create the object
        // System.out.println(b);

        String c = "Don";
        c = "King";
        // Strings are immutable so we can not modify c we just create a new object of c in the string pool
        // and the previous one goes to garbage collection  
        System.out.println(c);
        



        // Comparision of Strings


        String name1 = "Amit";
        String name2 = "Amit";
        System.out.println(name1==name2); //It gives true because object value are in the String pool

        // now if we create another new string with point to any refrence varaible

        String name3 = name1;
        System.out.println(name3==name1); //True


        // How to creater different object with same value


        String z = new String("Ami");
        String x = new String("Amit");
        System.out.println(z==x);// It gives false because both are new object and object value are now stored in heap ont in pool

        // == is a comparator and .equals() is a mathod

        System.out.println(name1.equals(name2));// true because .equals cares about the value not methods
        // means .equals() campares value is "Amit"=="Amit"  Yes. 

        String xyz = "Amit";
        String xyz1 = "Butola";
        System.out.println(xyz.equals(xyz1));// false because the values are different  "Amit"!="Butola".

        System.out.println(xyz.charAt(0));
        


    }
    
}
