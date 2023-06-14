public class PalindromRrcursion {
    public static boolean palindrom(String s, int start, int end) {
        if (start >= end)
            return true;
        return (s.charAt(start) == s.charAt(end) && palindrom(s, start + 1, end - 1));
    }

    public static void main(String[] args) {
        String s = "abbabba";
        System.out.println(palindrom(s, 0, s.length() - 1));
    }
}