package week14.day2;
import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        Optional<String> email = Optional.ofNullable(null);

        String result = email.orElse("기본 이메일 사용");
        System.out.println(result);
    }
}
