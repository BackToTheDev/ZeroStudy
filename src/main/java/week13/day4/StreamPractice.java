package week13.day4;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Map<Boolean, List<Integer>> evenOdd = 
                nums.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        
        System.out.println("짝수 그룹: " + evenOdd.get(true));
        System.out.println("홀수 그룹: " + evenOdd.get(false));
    }
}
