package week4.day3.functionalInterface;

public class PrintMain {
    public static void main(String[] args) {
        MyPrinter myPrinter = msg -> {
            System.out.println("출력: " + msg);
            
        };
        myPrinter.print("람다로 출력");
    }
}
