package week3.day3;

class RunnableThread implements Runnable {
    private String fileName;

    public RunnableThread (String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println(fileName + " 다운로드 시작...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fileName + " 다운로드 완료!");
    }
}

public class ThreadRun {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableThread("파일_1.zip"));
        Thread thread2 = new Thread(new RunnableThread("파일_2.mp4"));
        Thread thread3 = new Thread(new RunnableThread("파일_3.pdf"));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
