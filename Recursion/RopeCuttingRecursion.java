public class RopeCuttingRecursion {
    /**
     * time complexity is O(3^n)
     * 
     * @param n
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int ropeCutting(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n <= -1)
            return -1;
        int res = Math.max(ropeCutting(n - a, a, b, c),
                Math.max(ropeCutting(n - b, a, b, c), ropeCutting(n - c, a, b, c)));
        if (res == -1)
            return -1;
        return res + 1;
    }

    public static void main(String[] args) {
        int n = 13, a = 11, b = 1, c = 12;
        System.out.print(ropeCutting(n, a, b, c));
    }
}
