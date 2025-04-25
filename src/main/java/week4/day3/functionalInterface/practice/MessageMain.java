package week4.day3.functionalInterface.practice;

import java.util.List;

public class MessageMain {
    public static void main(String[] args) {
        List<String> messages = List.of("자바가 뭔가요", "오이", "사과", "자바는 껌이다", "호랑이 굴");

        MessageFilter lengthFilter = msg -> msg.length() >= 5;

        MessageFilter containsJavaFilter = msg -> msg.contains("자바");

        System.out.println("=== 길이 필터 적용 ===");
        MessageProcessor.processMessage(messages, lengthFilter);

        System.out.println("=== 자바 필터 적용 ===");
        MessageProcessor.processMessage(messages, containsJavaFilter);

    }
}
