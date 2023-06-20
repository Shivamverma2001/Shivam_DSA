public class MaxProductOfASubarray {
    public static void main(String[] args) {
        int n = 5, arr[] = { 6, -3, -10, 0, 2 };
        long ans = 1, maxAns = -1000;
        for (int i = 0; i < n; i++) {
            ans *= arr[i];
            maxAns = Math.max(ans, maxAns);
            if (ans == 0)
                ans = 1;
        }
        ans = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans *= arr[i];
            maxAns = Math.max(ans, maxAns);
            if (ans == 0)
                ans = 1;
        }
        System.out.println(maxAns);
    }
}
