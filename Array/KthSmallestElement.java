import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int a[] = { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            pq.add(a[i]);
        }
        while (k-- > 1) {
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
