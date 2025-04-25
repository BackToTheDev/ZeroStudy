package week4.day4.javaChange.java8;

public interface Printer {
    default void print(String msg) {
        System.out.println("[Info] " + msg);
    }


    class ConsolePrinter implements Printer {
    }

    ConsolePrinter cp = new ConsolePrinter();

}


