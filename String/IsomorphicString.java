import java.util.HashMap;

public class IsomorphicString {
    public static boolean areIsomorphic(String str1, String str2) {
        // Your code here
        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Character> h = new HashMap();
        for (int i = 0; i < str1.length(); i++) {
            if (h.containsKey(str1.charAt(i))) {
                if (h.get(str1.charAt(i)) != str2.charAt(i)) {
                    return false;
                }
            } else {
                if (h.containsValue(str2.charAt(i))) {
                    return false;
                } else {
                    h.put(str1.charAt(i), str2.charAt(i));
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        System.out.println(areIsomorphic(str1, str2));
    }
}
