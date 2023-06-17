import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        long n = 4, arr1[] = { 1, 3, 5, 7 };
        long m = 5, arr2[] = { 0, 2, 6, 8, 9 };
        int i = 0, j = 0, k = (int) (n - 1);
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                i++;
            } else {
                long temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
