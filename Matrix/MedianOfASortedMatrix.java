public class MedianOfASortedMatrix {
    public static int countSmallerThanMid(int[] matrix, int mid, int n) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int md = l + (h - l) / 2;
            if (matrix[md] <= mid) {
                l = md + 1;
            } else {
                h = md - 1;
            }
        }
        return l;
    }

    static int median(int matrix[][], int r, int c) {
        // code here
        int low = 1;
        int high = 100000000;
        int n = r, m = c;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += countSmallerThanMid(matrix[i], mid, c);
            }
            if (count <= (n * m) / 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int R = 3, C = 3;
        int M[][] = { { 1, 3, 5 },
                { 2, 6, 9 },
                { 3, 6, 9 } };
        System.out.println(median(M, R, C));
    }
}
