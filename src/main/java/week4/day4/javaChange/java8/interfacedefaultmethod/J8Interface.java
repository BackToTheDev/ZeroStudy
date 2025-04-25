package week4.day4.javaChange.java8.interfacedefaultmethod;

public interface J8Interface {
    default void printClassName() {
        System.out.println(getClass().getSimpleName());
    }
}
