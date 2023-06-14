import java.util.*;
import java.util.ArrayList;

public class LetterCombinationRecursion {
    // public static String getValue(char c) {
    // if (c == '2')
    // return "abc";
    // if (c == '3')
    // return "def";
    // if (c == '4')
    // return "ghi";
    // if (c == '5')
    // return "jkl";
    // if (c == '6')
    // return "mno";
    // if (c == '7')
    // return "pqrs";
    // if (c == '8')
    // return "tuv";
    // if (c == '9')
    // return "wxyz";
    // return "";
    // }

    // public static List<String> letterCombinations(String digits) {
    // if (digits.length() == 0)
    // return new ArrayList<>();
    // String firstDigitValue = getValue(digits.charAt(0));
    // List<String> smallerAns = letterCombinations(digits.substring(1));
    // if (smallerAns.size() == 0) {
    // smallerAns.add("");
    // }
    // List<String> mainAns = new ArrayList<>();
    // for (int i = 0; i < firstDigitValue.length(); i++) {// abc
    // for (int j = 0; j < smallerAns.size(); j++) {// {x}
    // String mainCombination = firstDigitValue.charAt(i) + smallerAns.get(j);//
    // [ax,bx,cx]
    // mainAns.add(mainCombination);
    // }
    // }
    // return mainAns;
    // }

    static ArrayList<String> possibleWords(int a[], int N) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        ArrayList<String> al = new ArrayList<>();
        func(0, "", a, map, al);
        return al;
    }

    static void func(int i, String s, int[] a, Map<Integer, String> map, ArrayList<String> res) {
        if (i == a.length) {
            res.add(s);
            return;
        }
        for (int k = 0; k < map.get(a[i]).length(); k++) {
            String str = s + map.get(a[i]).charAt(k);
            func(i + 1, str, a, map, res);
        }
    }

    public static void main(String[] args) {
        // List<String> ans = letterCombinations("234");
        int arr[] = { 2, 3, 4 };
        ArrayList<String> ans = possibleWords(arr, 3);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
