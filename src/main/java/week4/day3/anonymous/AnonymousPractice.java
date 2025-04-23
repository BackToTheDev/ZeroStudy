package week4.day3.anonymous;

public class AnonymousPractice {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("쾅쾅");
            }
        };
        animal.sound();
    }
}
