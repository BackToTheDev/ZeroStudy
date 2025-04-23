package week4.day2.annotation;

public class Hello {

    @Deprecated
    public void oldMethod() {
        System.out.println("이 메서드는 더 이상 사용하지 마세요.");
    }

    @SuppressWarnings("unused")
    public void warnFree() {
        String unusedVar = "나는 안 쓰이지만 경고 안 나옴!";
        System.out.println(unusedVar);
    }

    @Override
    public String toString() {
        return "Hello";
    }
}
