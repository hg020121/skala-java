package chaining;

public class ChainingExample {
    public static void main(String[] args) {
        // 1. String 클래스의 기본 체이닝 활용
        String result = "   hello java  "
                .trim()
                .toUpperCase()
                .replace("JAVA", "SKALA");

        System.out.println(result); // HELLO SKALA

        // 2. 직접 만든 Chain 클래스의 체이닝 활용
        Chain chain = new Chain();
        chain.setName("Example")
                .setCount(10)
                .setConnector("실버");
                
        System.out.println(chain.toString()); // Name: Example, Count: 10, Connector: 실버
    }
}