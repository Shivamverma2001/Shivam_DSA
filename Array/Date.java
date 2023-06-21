public class Date {
    public static void main(String[] args) {
        String a = "2024-03-09";
        String[] s = a.split("-");
        int y = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), d = Integer.parseInt(s[2]);
        int month = 0;
        if (m == 2) {// j
            month = 31;
        } else if (m == 3) {// f
            month = 59;
        } else if (m == 4) {// mar
            month = 90;
        } else if (m == 5) {// apr
            month = 120;
        } else if (m == 6) {// may
            month = 151;
        } else if (m == 7) {// jun
            month = 182;
        } else if (m == 8) {// jul
            month = 212;
        } else if (m == 9) {// aug
            month = 243;
        } else if (m == 10) {// sep
            month = 273;
        } else if (m == 11) {// oct
            month = 304;
        } else if (m == 12) {// nov
            month = 334;
        }
        if ((y % 4 == 0 || y % 400 == 0) && (m > 2)) {
            month--;
        }

        System.out.println(d + month);
    }
}
