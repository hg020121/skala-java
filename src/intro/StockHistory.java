package intro;

import java.text.DecimalFormat;

public class StockHistory {
    DecimalFormat df = new DecimalFormat("#,###");
    StringBuilder sb = new StringBuilder();

    String[] stocks = {"SKALA", "EDUAI", "KQTECH"};
    int[] todayPrices = {12300, 9850, 23000};
    int[] yesterdayPrices = {12000, 10200, 22000};

    public void buildStockHistory() {
        // 헤더: 각 열의 폭을 12칸으로 고정
        sb.append(String.format("%-9s %9s %9s %9s\n", "종목명", "전일가", "현재가", "등락률"));
        sb.append("====================================================\n");

        for (int i = 0; i < stocks.length; i++) {
            double changeRate = ((double)(todayPrices[i] - yesterdayPrices[i]) / yesterdayPrices[i]) * 100;

            sb.append(String.format("%-12s %12s %12s %+11.2f%%\n",
                    stocks[i],
                    df.format(yesterdayPrices[i]),
                    df.format(todayPrices[i]),
                    changeRate));
        }
    }

    public void printStockHistory() {
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        StockHistory sh = new StockHistory();
        sh.buildStockHistory();
        sh.printStockHistory();
    }
}
