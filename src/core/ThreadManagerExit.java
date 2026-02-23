package core;

public class ThreadManagerExit {

// 메인 함수에서 새로운 Thread를 생성하여 실행하고 “메인 함수를 종료합니다“ 출력 후 System.exit(0)
// Thread는 내부적으로 1초간 sleep후 “새로운 스레드 작업을 시작합니다.”  출력
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("새로운 스레드 작업을 시작합니다.");
        });

        thread.start();

        System.out.println("메인 함수를 종료합니다.");
        System.exit(0);
    }
}   
