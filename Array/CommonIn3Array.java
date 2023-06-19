import java.util.ArrayList;

public class CommonIn3Array {
    public static void main(String[] args) {
        int n1 = 6;
        int[] A = { 1, 5, 10, 20, 40, 80 };
        int n2 = 5;
        int[] B = { 6, 7, 20, 80, 100 };
        int n3 = 8;
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (!a.contains(A[i])) {
                    a.add(A[i]);
                }
                i++;
                j++;
                k++;
            } else {
                if (B[j] <= A[i] && B[j] <= C[k])
                    j++;
                else if (C[k] <= A[i] && C[k] <= B[j])
                    k++;
                else
                    i++;
            }
        }
        System.out.println(a);
    }
}
