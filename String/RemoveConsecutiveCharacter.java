public class RemoveConsecutiveCharacter {
    public static String removeConsecutiveCharacter(String S) {
        if (S.length() <= 1) {
            return S;
        }
        char currChar = S.charAt(0);
        String remString = S.substring(1);
        if (currChar == remString.charAt(0)) {
            return removeConsecutiveCharacter(remString);
        }
        return currChar + removeConsecutiveCharacter(remString);
    }

    public static void main(String[] args) {
        String s = "aabbb";
        System.out.println(removeConsecutiveCharacter(s));
    }
}
