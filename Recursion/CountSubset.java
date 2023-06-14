public class CountSubset {
    public static int countSubset(int[] arr, int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        // including excluding element
        return countSubset(arr, n - 1, sum) + countSubset(arr, n - 1, sum - arr[n - 1]);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 15 };
        System.out.println(countSubset(arr, arr.length, 25));
    }
}
