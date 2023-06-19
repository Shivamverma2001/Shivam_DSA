public class ArrangePositiveAndNegativeAlternatively {
    public static void main(String[] args) {
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, -8 };
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (i <= arr.length - 1 && arr[i] > 0) {
                i++;
            }
            while (j >= 0 && arr[j] < 0) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i == 0 || i == arr.length) {
            System.out.println(arr);
        } else {
            int k = 0;
            while (k < arr.length && i < arr.length) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k += 2;
            }
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
