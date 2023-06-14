import java.util.*;

//283
public class ArrayList {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a[] = { 0, 0, 1, 0, 5, 3, 0, 3 };

        // 1st way

        int ans[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                ans[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                ans[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(ans[i] + " ");
        }

        // 2nd way

        // int i = a.length - 1;
        // int j = a.length - 2;
        // while (j >= 0) {
        // if ((a[i] == 0) && (a[j] == 0)) {
        // j--;
        // } else if (a[i] == 0) {
        // int temp = a[i];
        // a[i] = a[j];
        // a[j] = temp;
        // i--;
        // j--;
        // } else if (a[i] != 0) {
        // i--;
        // }
        // }
        // for (i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }
    }
}
