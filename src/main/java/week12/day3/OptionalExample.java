package week12.day3;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        OptionalExample ex = new OptionalExample();
        String raw = String.valueOf(ex.getUsername2(2));
        if (raw != null) {
            System.out.println(raw);
        }
    }

    // null 반환
    public String getUsername1(int id) {
        if (id == 1) return "JUN";
        else return null;
    }

    public Optional<String> getUsername2(int id) {
        if (id == 1) {
            return Optional.of("JUN");
        } else {
            return Optional.empty();
        }
    }


}
