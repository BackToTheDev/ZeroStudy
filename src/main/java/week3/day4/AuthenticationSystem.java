// BE 36_권준성

package week3.day4;

public class AuthenticationSystem implements Runnable{
    private static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "");
    private String userName;

    public AuthenticationSystem(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        threadLocal.set(userName);
        System.out.println(Thread.currentThread().getName() + threadLocal.get());
        threadLocal.remove();
    }

    public static void main(String[] args) {
    Thread thread1 = new Thread(new AuthenticationSystem("사용자 A"), "Thread-1 로그인: ");
    Thread thread2 = new Thread(new AuthenticationSystem("사용자 B"), "Thread-2 로그인: ");
    thread1.start();
    thread2.start();


    }
}
