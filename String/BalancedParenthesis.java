import java.util.Stack;

public class BalancedParenthesis {
    static boolean ispar(String x) {
        // add your code here
        Stack<Character> s = new Stack<>();
        int i = 0;
        for (i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '[' || x.charAt(i) == '(' || x.charAt(i) == '{') {
                s.push(x.charAt(i));
            } else if (s.isEmpty()) {
                return false;
            } else {
                if ((x.charAt(i) == ']' && s.peek() == '[') || (x.charAt(i) == ')' && s.peek() == '(')
                        || (x.charAt(i) == '}' && s.peek() == '{')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty() && i == x.length())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(ispar(s));
    }
}
