package BinarySearch;

public class PeakOfMountainArray {
    /*
     * 852 Leetcode
     */
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0 };
        int left = 0, right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
                ans = Math.max(arr[mid], ans);
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
    }
}
