import java.util.*;

public class SplitBinary01 {
    public static void main(String[] args) {
        String s = "0000000";
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (st.size() == 0) {
                st.push(s.charAt(i));
            } else {
                if (st.peek() != s.charAt(i)) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
                if (st.size() == 0) {
                    ans++;
                }
            }
        }
        if (ans == 0 && st.size() > 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
