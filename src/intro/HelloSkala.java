package intro;

public class HelloSkala {
    // "스칼라에 오신 것을 환영합니다." 출력}

    public static void main(String[] args) {
        System.out.print("스칼라에");
        try {
            Thread.sleep(1000); // 0.5초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(" 오신 것을 환영합니다.");

    }
}