public class RowWithMax1 {
    public static void main(String[] args) {
        int n = 4, m = 4;
        int arr[][] = { { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };
        int j = m - 1, row = -1;
        while (j >= 0 && arr[0][j] == 1) {
            j--;
            row = 0;
        }
        for (int i = 1; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                row = i;
            }
        }
        System.out.println(row);
    }
}