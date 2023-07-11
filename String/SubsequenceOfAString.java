public class SubsequenceOfAString {
    public static void subsequence(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        subsequence(s.substring(1), ans);
        subsequence(s.substring(1), ans + s.charAt(0));
    }

    public static void main(String[] args) {
        String s = "abc";
        subsequence(s, "");
    }
}