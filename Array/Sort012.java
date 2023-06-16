public class Sort012 {
    public static void main(String[] args) {
        int a[] = { 0, 2, 1, 2, 0 };
        int n = a.length;
        // int i=0,j=n-1;
        // for (int k = 0; k <= j;) {
        // if (a[k] == 0) {
        // int temp = a[i];
        // a[i] = a[k];
        // a[k] = temp;
        // i++;
        // k++;
        // } else if (a[k] == 2) {
        // int temp = a[j];
        // a[j] = a[k];
        // a[k] = temp;
        // j--;
        // } else {
        // k++;
        // }
        // }

        int n0 = 0, n1 = 0, n2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                n0++;
            } else if (a[i] == 1) {
                n1++;
            } else {
                n2++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (n0 > 0) {
                a[i] = 0;
                n0--;
            } else if (n1 > 0) {
                a[i] = 1;
                n1--;
            } else {
                a[i] = 2;
                n2--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
