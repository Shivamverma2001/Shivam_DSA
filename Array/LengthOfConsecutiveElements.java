import java.util.HashSet;
import java.util.PriorityQueue;

public class LengthOfConsecutiveElements {
    public static void main(String[] args) {
        int nums[] = { 100, 4, 200, 1, 3, 2, 150, 5 };
        int n = nums.length;
        int maxLength = 0;
        HashSet<Integer> a = new HashSet<>();
        for (int i : nums) {
            a.add(i);
        }
        for (int i : nums) {
            if (!a.contains(i - 1)) {
                int num = i;
                int length = 1;
                while (a.contains(num + 1)) {
                    length++;
                    num++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        System.out.println(maxLength);
    }
}
