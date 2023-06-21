public class SearchKth {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, low = matrix[0][0], high = matrix[n - 1][n - 1];
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = numberLessThan(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int numberLessThan(int[][] matrix, int mid) {
        int count = 0, n = matrix.length, i = n - 1, j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > mid) {
                i--;
            } else {
                count = count + i + 1;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        System.out.println(kthSmallest(matrix, 8));
    }
}
