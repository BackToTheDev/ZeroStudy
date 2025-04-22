package week1.quest1week;
//BE 36기_권준성
public class JavaStudy03 {
    public static void main(String[] args) {
        int intValue1 = 10;
        double doubleValue1 = intValue1;

        double doubleValue2 = 93.7;
        int intValue2 = (int) doubleValue2;

        System.out.println("=== 업캐스팅 ===");
        System.out.println("int 값 : " + intValue1);
        System.out.println("doubleValue 값 : " + doubleValue1);

        System.out.println();
        System.out.println("=== 다운 캐스팅 ===");
        System.out.println("double 값 : " + doubleValue2);
        System.out.println("int 값 : " + intValue2);

    }
}
