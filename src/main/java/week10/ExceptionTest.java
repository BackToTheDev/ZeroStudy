package week10;

public class ExceptionTest {

    public static void main (String[] args) {
        try {
            throw new IllegalArgumentException("잘못된 입력!");
        } catch (IllegalArgumentException e){
            System.out.println("에러 메시지: " + e.getMessage());
        }
    }
}
