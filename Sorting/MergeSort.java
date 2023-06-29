public class MergeSort {
    public static void merge(int arr[], int low, int mid, int high) {
        int a[] = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                a[k++] = arr[i++];
            } else {
                a[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            a[k++] = arr[i++];
        }
        while (j <= high) {
            a[k++] = arr[j++];
        }
        for (int in = 0, sn = low; in < a.length; in++, sn++) {
            arr[sn] = a[in];
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 1, 3, 2 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
