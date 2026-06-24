public class StringLength {
    public static int getStringLength(String s) {
        if(s == null ) return -1;
        if(s.isEmpty()) return 0;
    
        return s.length();
    }
}