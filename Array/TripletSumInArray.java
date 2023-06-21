import java.util.Arrays;

public class TripletSumInArray {
    public static void main(String[] args) {
        int n = 6, X = 13;
        int A[] = { 1, 4, 45, 6, 10, 8 };
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                if (A[i] + A[j] + A[k] == X) {
                    System.out.println("True");
                    break;
                } else if (A[i] + A[j] + A[k] > X) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        System.out.println("False");
    }
}
