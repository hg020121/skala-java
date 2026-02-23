package intro;

public class EchoMessage {
    // 사용자가 입력한 문자열을 그대로 출력하는 프로그램 작성
    // 콘솔에서 입력을 받고, 입력받은 문자열을 다시 콘솔에 출력
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();
        System.out.println("입력한 문자열: " + input);
        scanner.close();
    }
}