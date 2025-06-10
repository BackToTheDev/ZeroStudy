package week12.day1;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamWithExceptionHandling {
    public static void main(String[] args) {
        //읽을 파일 경로 지정
        Path path = Path.of("src/main/resources/numbers.txt");

        //try-with-resources로 스트림 열기
        try(Stream<String> lines = Files.lines(path)) {
            lines.map(StreamWithExceptionHandling::parseIntSafely) // 문자열 -> 정수로 변환
                    .filter(n -> n != null && n % 2 == 0) // null 제거 및 짝수 필터
                    .map(n -> n * n) // n 제곱 계산
                    .forEach(System.out::println); // 출력
        } catch(IOException e) {
            System.err.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }
    }

    //문자열을 정수로 파싱, 실패시 null
    private static Integer parseIntSafely(String line) {
        try {
            return Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
            System.err.println("정수로 변환 실패: '" + line + "'");
            return null;
        }
    }
}
