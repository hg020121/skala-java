package core;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int value = 10 / 0;
        } catch (Exception e) {
            System.out.println("예외 발생: " + e.getMessage());
            System.out.println(e);
        }
    }

}
