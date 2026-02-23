// # 정렬 전 주식 목록:
    // SKALA 에듀
    // SKALA AI
    // K-테크
    // SKALA 테크
    // N-솔루션

// # 정렬 후 주식 목록:
    // K-테크
    // N-솔루션
    // SKALA AI
    // SKALA 에듀
    // SKALA 테크

package lambda;

public class StockSorter {
        public static void main(String[] args) {
        var stocks = java.util.Arrays.asList("SKALA 에듀", "SKALA AI", "K-테크", "SKALA 테크", "N-솔루션");
        
        System.out.println("정렬 전 주식 목록:");
        stocks.forEach(System.out::println);
        
        stocks.sort(String::compareTo);
        
        System.out.println("\n정렬 후 주식 목록:");
        stocks.forEach(System.out::println);
    }   
}
