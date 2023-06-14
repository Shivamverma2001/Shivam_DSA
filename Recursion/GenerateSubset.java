public class GenerateSubset {
    public static void subset(String s, String cur, int i) {
        if (i == s.length()) {
            System.out.print(cur + " ");
            return;
        }
        subset(s, cur, i + 1);
        subset(s, cur + s.charAt(i), i + 1);
    }

    public static void main(String[] args) {
        String s = "ABC";
        subset(s, "", 0);
    }
}