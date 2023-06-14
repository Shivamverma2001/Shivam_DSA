public class RotateImage {
    public static void giveTransposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // Transpose mthe matrix
        // Reverse the cols
        giveTransposeMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix.length - 1;
            while (left < right) {
                int temp = 0;
                temp = matrix[i][right];
                matrix[i][right] = matrix[i][left];
                matrix[i][left] = temp;
                right--;
                left++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}