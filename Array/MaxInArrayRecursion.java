public class MaxInArrayRecursion {
    public static int maxElement(int a[], int index) {
        if (index == a.length - 1) {
            return a[index];
        }
        int max1 = a[index];
        int maxInSmallerArray = maxElement(a, index + 1);
        int mainAns = Math.max(maxInSmallerArray, max1);
        return mainAns;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 1, 7, 9, 11, 2, 6 };
        System.out.print(maxElement(arr, 0));
    }
}
