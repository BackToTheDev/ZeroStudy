package week4.day3.functionalInterface.practice;

import java.util.List;

public class MessageProcessor {
    public static void processMessage(List<String> messages, MessageFilter filter) {
        for (String msg : messages) {
            if (filter.filter(msg)) {
                System.out.println("메시지 출력: " + msg);
            }
        }
    }
}
