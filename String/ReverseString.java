public class ReverseString {
    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for (char ch : s) {
            System.out.print(ch + " ");
        }
    }
}