public class BooleanMatrix {
    /**
     * set matrix 0 -> 73
     * 
     * @param args
     */
    public static void setMatrix0(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] copyMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copyMatrix[i][j] = matrix[i][j];
            }
        }
        // O(mn*(m+n))
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        copyMatrix[k][j] = 0;
                    }
                    for (int k = 0; k < n; k++) {
                        copyMatrix[i][k] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = copyMatrix[i][j];
            }
        }
    }

    public static void setMatrix0_2nd(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        for (int i = 0; i < m; i++) {
            row[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            col[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setMatrix0_3rd(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isZeroIn0Row=false,isZeroIn0Col=false;
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                isZeroIn0Row = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isZeroIn0Col = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (isZeroIn0Col) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (isZeroIn0Row) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int m = matrix.length;
        int n = matrix[0].length;
        // setMatrix0(matrix);
        setMatrix0_2nd(matrix);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
