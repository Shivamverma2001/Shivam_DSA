public class MinimumStepsToMakePalindromString {
    static int addMinChar(String str) {
        int i = 0, j = str.length() - 1, res = 0;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                res++;
                i = 0;
                j = str.length() - res - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "AACECAAAA";
        System.out.println(addMinChar(str));
    }
}
