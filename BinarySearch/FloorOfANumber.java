public class FloorOfANumber {
    public static void main(String[] args) {
        int a[] = { 2, 4, 8, 16, 18, 20 };
        int target = 19;
        int left = 0, right = a.length;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] <= target) {
                ans = Math.max(ans, a[mid]);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}