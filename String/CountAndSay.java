public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        if (n == 1) {
            System.out.println("1");
            return;
        } else if (n == 2) {
            System.out.println("11");
            return;
        }
        String s = "11";
        for (int i = 3; i <= n; i++) {
            String t = "";
            s = s + "&";
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(j - 1)) {
                    t += count;
                    t += s.charAt(j - 1);
                    count = 1;
                } else {
                    count++;
                }
            }
            s = t;
        }
        System.out.println(s);
    }
}
