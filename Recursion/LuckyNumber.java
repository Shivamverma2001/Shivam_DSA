public class LuckyNumber {
    public static boolean check(int npos, int c) {
        if (npos < c)
            return true;
        if (npos % c == 0)
            return false;
        return check(npos - (npos / c), c + 1);
    }

    public static void main(String[] args) {
        System.out.println(check(13, 5));
    }
}
