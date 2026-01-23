package util;

import java.util.HashMap;
import java.util.Scanner;

public class StockHash {
    // 모든 실행 로직은 main 메소드 안에 있어야 합니다
    public static void main(String[] args) {
        
        // 1. 초기 보유 종목 등록
        HashMap<String, Integer> portfolio = new HashMap<>();
        portfolio.put("SKALA Edu", 12);
        portfolio.put("SKALA AI", 8);
        portfolio.put("SKALA Energy", 5);

        Scanner scanner = new Scanner(System.in);

        // 2. 입력 및 조회 루프
        while (true) {
            System.out.print("조회할 주식 이름을 입력하세요 (종료하려면 'exit' 입력): ");
            String stockName = scanner.nextLine();

            // 3. 종료 조건
            if (stockName.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 4. getOrDefault() 활용
            int quantity = portfolio.getOrDefault(stockName, 0);
            System.out.println("[" + stockName + "] 주식을 " + quantity + "주 보유 중입니다.");
        }
        
        scanner.close();
    }
}