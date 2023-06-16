public class LargestSum {
    /**
     * Kadanes's Algo
     */
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = { 1, 2, 3, -2, 5 };
        long max = -1000, sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Arr[i];
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;
        }
        System.out.println(max);
    }
}
