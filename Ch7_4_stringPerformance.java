public class Ch7_4_stringPerformance {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);
            series = series+ch;
        }
        System.out.println(series); 
        // This is not the correct way because it while adding the new characted to the string it always make a new string
        // because string is immutable. ie - internaly it make a, ab,abc,abcd,abcde...so on.
        // thats why er use string builder
        
    }
    
}
