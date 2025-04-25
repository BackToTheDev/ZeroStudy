package week4.day4.javaChange.java11;

public class StringMain {
    public static void main(String[] args) {
        String multiline = "Java/nSpring\nGPT";
        multiline.lines().forEach(System.out::println); // 줄 단위 분리 출력

        System.out.println("   공백    ".strip()); // 앞 뒤 공백 제거
        System.out.println("Hello ".repeat(3)); // repeat 반복
    }
}
