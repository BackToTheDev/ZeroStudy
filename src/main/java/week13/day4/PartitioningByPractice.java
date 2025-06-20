package week13.day4;
import java.util.Map;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PartitioningByPractice {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Andrew", "Brian", "Betty", "Carl", "Catherine", "Daniel", "Diana");

        Map<Boolean, List<String>> partitioning =
                names.stream()
                        .collect(Collectors.partitioningBy(s -> s.startsWith("A")));



        String result = partitioning.entrySet().stream()
                .map(entry -> {
                    String label = entry.getKey() ? "[A로 시작하는 이름]: " : "[그 외]: ";
                    String nameList = entry.getValue().stream()
                            .sorted()
                            .collect(Collectors.joining(", "));
                    return label + nameList;
                })
                .collect(Collectors.joining("\n"));

        System.out.println(result);




    }
}
