package week14.day2;
import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {
        Optional<String> email = Optional.ofNullable("ej12@gamil.com");

        if (email.isPresent()) {
            System.out.println("메일 발송: " + email.get());
        } else {
            System.out.println("기본 이메일 사용");
        }
    }
}
