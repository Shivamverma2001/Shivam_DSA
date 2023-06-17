public class StockButAndSell {
    /*
     * for 1 day only
     */
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int minSoFar=prices[0],maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minSoFar=Math.min(minSoFar,prices[i]);
            int profit=prices[i]-minSoFar;
            maxProfit=Math.max(profit,maxProfit);
        }
        System.out.println(maxProfit);
    }
}
