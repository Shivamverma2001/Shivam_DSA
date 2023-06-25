import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char ch[] = s.toCharArray();
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (!h.containsKey(ch[i])) {
                h.put(ch[i], 1);
            } else {
                h.put(ch[i], h.getOrDefault(ch[i], 0) + 1);
            }
        }
        System.out.println(h);

    }
}
// g,2
// 2,4