package intro;

public class NumberBox {
    // 기본형 int a와 b는 100으로 초기화
    // 래퍼 클래스 Integer A와 B도 100으로 초기화 되었을 때 비교(==, equals()) 결과 출력
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        Integer A = 200;
        Integer B = 200;

        System.out.println("기본형 int 비교:");
        System.out.println("a == b: " + (a == b)); // true
        System.out.println("a.equals(b): " + Integer.valueOf(a).equals(Integer.valueOf(b))); // true

        System.out.println("\n래퍼 클래스 Integer 비교:");
        System.out.println("A == B: " + (A == B)); // true, -128~127 캐싱 범위 내
        System.out.println("A.equals(B): " + A.equals(B)); // true
    }
}
