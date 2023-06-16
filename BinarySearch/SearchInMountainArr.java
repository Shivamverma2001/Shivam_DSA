package BinarySearch;

public class SearchInMountainArr {
    /*
     * 1095. Find in Mountain Array
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 5, 3, 1 };
        int target = 1;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int first = orderAgnoisticBs(arr, target, 0, getPeak(arr));
        if (first != -1)
            return first;
        else
            return orderAgnoisticBs(arr, target, getPeak(arr) + 1, arr.length - 1);
    }

    static int getPeak(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m + 1] > arr[m])
                s = m + 1;
            else
                e = m;
        }
        return s; // return e
    }

    static int orderAgnoisticBs(int[] arr, int target, int s, int e) {
        //n = sizeof(arr) / sizeof(arr[0])
        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {
            int m = (s + e) / 2;

            if (arr[m] == target)
                return m;


            if (isAsc) {
                if(arr[m] < target)
                    s = m + 1;
                else
                    e = m - 1;
            }
            else {
                if(arr[m] < target)
                    e = m - 1;
                else
                    s = m + 1;
            }
        }
        return -1;

}
