package week10;

public class ExceptionTest {
    public static void checkInput(String input) {


        if (input == null) {
            throw new IllegalArgumentException("잘못된 입력!");
        }
        System.out.println("입력값: " + input);
    }

    public static void main (String[] args) {
        checkInput("null");
    }
}
