public class TransformString {
    static int minOps(String A, String B) {
        if (A.length() != B.length()) {
            return -1;
        }
        char[] c = new char[256];
        for (int i = 0; i < A.length(); i++) {
            c[A.charAt(i)]++;
            c[B.charAt(i)]--;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] != 0) {
                return -1;
            }
        }
        int i = A.length() - 1, j = B.length() - 1, res = 0;
        while (i >= 0) {
            if (A.charAt(i) != B.charAt(j)) {
                res++;
            } else {
                j--;
            }
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        String A = "EACBD";
        String B = "EABCD";

        System.out.println("Minimum number of operations required is " + minOps(A, B));
    }
}
