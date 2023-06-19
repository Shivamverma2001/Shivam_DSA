import java.util.*;

public class PairsWhoseSumIsGivenElement {
    public static void main(String[] args) {
        int n = 4, k = 6;
        int arr[] = { 1, 5, 7, 1 };
        int count = 0;
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (a.containsKey(k - arr[i])) {
                count += a.get(k - arr[i]);
            }
            a.put(arr[i], a.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(count);
    }
}
