public class BalanceParenthesesREcursion {
    public static void balanceParentheses(int open, int close, String output) {
        if (open > close)
            return;
        if (open == 0 && close == 0) {
            System.out.println(output);
            return;
        }
        if (open > 0) {
            String balanceString = output + "(";
            balanceParentheses(open - 1, close, balanceString);
        }
        if (close > 0) {
            String balanceString = output + ")";
            balanceParentheses(open, close - 1, balanceString);
        }
    }

    public static void main(String[] args) {
        balanceParentheses(2, 2, "");
    }
}
