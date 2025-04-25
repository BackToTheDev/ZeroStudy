package week4.day3.functionalInterface.practice;

@FunctionalInterface
public interface MessageFilter {
    boolean filter(String message);
}
