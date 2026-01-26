package util;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        Stock[] stocks = {
            new Stock("SKALA 에듀", 12000),
            new Stock("SKALA AI", 18000),
            new Stock("SKALA 에너지", 9500)
        };
        // 주식 목록을 ArrayList로 관리
        ArrayList<Stock> stockList = new ArrayList<>();

        // 주식 추가
        stockList.add(stocks[0]);
        stockList.add(stocks[1]);
        stockList.add(stocks[2]);

        System.out.println("거래 가능한 주식 목록:");
        for (Stock stock : stockList) {
            stock.printInfo();
        }
    }

}
