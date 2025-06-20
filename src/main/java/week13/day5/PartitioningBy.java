package week13.day5;
import java.util.Map;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        List<String> list = List.of("Seoul", "Sydney", "New York", "Shanghai", "London", "Los Angeles");

        Map<Boolean, List<String>> cities = list.stream()
                .collect(Collectors.partitioningBy(s -> s.startsWith("S")));

        String result = cities.entrySet().stream()
                .map(entry -> {
                    String label = entry.getKey() ? "[S로 시작]: " : "[그 외]: ";
                    String nameList = entry.getValue().stream()
                            .sorted()
                            .collect(Collectors.joining(", "));

                    return label + nameList;
                }).collect(Collectors.joining("\n"));

        System.out.println(result);
    }
}
