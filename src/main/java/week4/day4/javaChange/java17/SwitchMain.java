package week4.day4.javaChange.java17;

public class SwitchMain {
    public static void main(String[] args) {
        String day = "MONDAY";
        String type = switch (day) {
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "WorkDay";
        };
        System.out.println(type);
    }
}
