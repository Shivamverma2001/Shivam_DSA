public class RotateArrayBy1 {
    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int arr[], int n) {
        reverse(arr, 0, n - 2);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        rotate(A, n);
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}
