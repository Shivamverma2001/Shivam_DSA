package BitManipulationSV;

public class FindFirstSetBit {
    public static void main(String[] args) {
        int n = 18;
        if (n == 1) {
            System.out.print("1");
        }
        if (n == 0) {
            System.out.print("0");
        }
        int count = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                System.out.print(count);
                break;
            } else {
                count++;
                n = n >> 1;
            }
        }
        System.out.print(count);
    }
}
