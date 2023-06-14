public class Matrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 5, 3, 7, 8 }, { 10, 15, 16, 19, 20 }, { 31, 33, 35, 40, 45 }, { 60, 61, 63, 67, 80 } };
        for (int i = 0; i < a.length; i++) {
            if (a[i].length >= i) {
                System.out.println(a[i][i]);
            }
        }
    }
}
