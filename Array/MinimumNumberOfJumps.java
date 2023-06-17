public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int n = arr.length;
        int pos = 0, reachable = 0, jump = 0;
        for (int i = 0; i < n; i++) {
            if (reachable < i)
                System.out.println(-1);
            reachable = Math.max(reachable, i + arr[i]);
            if (pos == i && i != n - 1) {
                pos = reachable;
                jump++;
            }
        }
        System.out.println(jump);
    }
}
