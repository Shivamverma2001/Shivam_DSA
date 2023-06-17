package BitManipulationSV;

public class CheckWhetherKthBitIsSetOrNot {
    public static void main(String[] args) {
        int n = 4, K = 0;
        n = n >> K;
        n = n & 1;
        if (n == 1)
            System.out.println("Yes");
        else
            System.out.println("False");
    }
}