package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaSort {

    public static void main(String[] args) {
        List<String> stocks = Arrays.asList("SKALA AI", "SKALA 에듀", "SKALA 리서치");

        // 람다식으로 Comparator 구현
        stocks.sort((a, b) -> a.compareTo(b));

        stocks.forEach(s -> System.out.println(s)); //일반적인 lambda expression
        stocks.forEach(System.out::println); // method reference
    }

}
