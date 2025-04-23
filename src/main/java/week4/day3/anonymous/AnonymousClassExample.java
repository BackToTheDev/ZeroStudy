package week4.day3.anonymous;

interface Greeting {
    void sayHello();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("안녕하세요!");
            }
        };
        greeting.sayHello();
    }
}
