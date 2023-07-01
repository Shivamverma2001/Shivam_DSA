public class KthSmallestElement {
    public static int countOfSmallestElement(int matrix[][], int mid) {
        int i = matrix.length - 1, j = 0, count = 0;
        while (i >= 0 && j < matrix.length) {
            if (matrix[i][j] > mid) {
                i--;
            } else {
                count += i + 1;
                j++;
            }
        }
        return count;
    }

    public static int kthSmallest(int[][] mat, int n, int k) {
        // code here.
        int i = 0, j = mat[n - 1][n - 1];
        while (i < j) {
            int mid = i + (j - i) / 2;
            int count = countOfSmallestElement(mat, mid);
            if (count < k) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int N = 4;
        int mat[][] = { { 16, 28, 60, 64 },
                { 22, 41, 63, 91 },
                { 27, 50, 87, 93 },
                { 36, 78, 87, 94 } };
        int K = 3;
        System.out.println(kthSmallest(mat, N, K));
    }
}
