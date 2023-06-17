import java.util.Arrays;

public class MaximumHeight {
    public static void main(String[] args) {
        int k = 5;
        int n = 10;
        int arr[] = { 2, 6, 3, 4, 7, 2, 10, 3, 2, 1 };
        Arrays.sort(arr);
        int max = 0, min = 0, r = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= k) {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[i] - k, arr[0] + k);
                r = Math.min(r, max - min);
            }
        }
        System.out.println(r);
    }
}
