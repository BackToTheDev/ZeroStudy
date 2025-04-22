package week4.day2.annotation.general.safevarargs;

public class SafeVarargsExample {
    @SafeVarargs
    public static <T> void printMessage(T... messages) {
        for (T message : messages) {
            System.out.println();
        }
    }
}
