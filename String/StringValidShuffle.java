public class StringValidShuffle {
    public static void main(String[] args) {
        String s1 = "XY";
        String s2 = "12";
        String s = "X1Y2";
        int i = 0, j = 0, k = 0;
        while (k < s.length()) {
            if (i < s1.length() && s.charAt(k) == s1.charAt(i)) {
                i++;
            } else if (j < s2.length() && s.charAt(k) == s2.charAt(j)) {
                j++;
            } else {
                System.out.println("False");
                return;
            }
            k++;
        }
        if (i < s1.length() || j < s2.length()) {
            System.out.println("False");
            return;
        } else {
            System.out.println("True");
        }
    }
}
