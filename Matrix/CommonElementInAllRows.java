import java.util.HashMap;

public class CommonElementInAllRows {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 1, 4, 8 }, { 3, 7, 8, 5, 1 }, { 8, 7, 7, 3, 1 }, { 8, 1, 2, 7, 9 } };
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int j = 0; j < mat[0].length; j++) {
            h.put(mat[0][j], 1);
        }
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (h.get(mat[i][j]) != null && h.get(mat[i][j]) == i) {
                    h.put(mat[i][j], i + 1);
                    if (i == mat.length - 1) {
                        System.out.println(mat[i][j] + " ");
                    }
                }
            }
        }
    }
}
