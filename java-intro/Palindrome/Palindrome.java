public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        return s.equals(rev.toString());
    }
}