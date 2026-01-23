package intro;

import java.util.Arrays;
import java.util.List;

public class StockLoop {

    // for-each 문법을 사용하여, "삼"으로 시작하는 종목명을 출력
    String[] stocks = {"삼성전자", "카카오", "삼성바이오", "네이버"};

    // stockList의 stream() 메서드를 사용하여, "삼"으로 시작하는 종목명을 출력
    List<String> stockList = Arrays.asList("삼성전자", "카카오", "삼성바이오", "네이버");
    public void printStocksStartingWithSam() {
        System.out.println("for-each 문법을 사용한 출력:");
        for (String stock : stocks) {
            if (stock.startsWith("삼")) {
                System.out.println(stock);
            }
        }

        System.out.println("\nstream() 메서드를 사용한 출력:");
        stockList.stream()
            .filter(stock -> stock.startsWith("삼"))
            .forEach(System.out::println);
    }
    public static void main(String[] args) {
        StockLoop sl = new StockLoop();
        sl.printStocksStartingWithSam();
    }

}
