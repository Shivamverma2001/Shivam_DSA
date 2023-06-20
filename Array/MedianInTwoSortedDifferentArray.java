
public class MedianInTwoSortedDifferentArray {
    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 8 }, b[] = { 10, 12, 14, 16, 18, 20 };
        int n = a.length, m = b.length;
        int m1 = -1, m2 = -1, i = 0, j = 0, count = 0;
        if ((m + n) % 2 == 1) {
            for (count = 0; count <= (m + n) / 2; count++) {
                if (i != n && j != m) {
                    m1 = (a[i] > b[j]) ? b[j++] : a[i++];
                } else if (i < n) {
                    m1 = a[i++];
                } else {
                    m1 = b[j++];
                }
            }
            System.out.println(m1);
        } else {
            for (count = 0; count <= (m + n) / 2; count++) {
                m2 = m1;
                if (i != n && j != m) {
                    m1 = (a[i] > b[j]) ? b[j++] : a[i++];
                } else if (i < n) {
                    m1 = a[i++];
                } else {
                    m1 = b[j++];
                }
            }
            System.out.println((m1 + m2) / 2);
        }
    }
}
