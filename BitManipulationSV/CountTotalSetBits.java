package BitManipulationSV;
// package BitManipulation;

public class CountTotalSetBits {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countSetBits(n));
    }

    public static int countSetBits(int n) {

        // Your code here
        if (n == 0)
            return 0;
        int x = largestPowerOf2InRange(n);
        int btill2x = x * (1 << (x - 1));// (2^x-1)*x
        int msb2xton = n - (1 << x) + 1;// n-2^x+1
        int rest = n - (1 << x);// n-2^x
        int ans = btill2x + msb2xton + countSetBits(rest);
        return ans;
    }

    public static int largestPowerOf2InRange(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }
}
