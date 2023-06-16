public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = { 22, 14, 8, 17, 35, 3 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
