public class SearchInMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 5;
        int i = 0, rows = matrix.length, j = matrix[0].length - 1;
        while (i < rows && j > -1) {
            if (matrix[i][j] == target) {
                System.out.println("True");
                break;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
    }
}
