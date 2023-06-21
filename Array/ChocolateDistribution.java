import java.util.ArrayList;
import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int n = 7, m = 3;
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(7, 3, 2, 4, 9, 12, 56));
        Collections.sort(a);
        int i = 0, j = m - 1;
        int ans = Integer.MAX_VALUE;
        while (j < n) {
            ans = Math.min(ans, a.get(j) - a.get(i));
            i++;
            j++;
        }
        System.out.println(ans);
    }
}
