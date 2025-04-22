//BE 36_권준성
package week3.day3;

class DownloadThread extends Thread{

    private String fileName;

    public DownloadThread(String fileName) {
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

public class MultiThreadDownload {
    public static void main(String[] args) {
        DownloadThread downloadThread1 = new DownloadThread("파일_1.zip");
        DownloadThread downloadThread2 = new DownloadThread("파일_2.mp4");
        DownloadThread downloadThread3 = new DownloadThread("파일_3.pdf");
        downloadThread1.start();
        downloadThread2.start();
        downloadThread3.start();

    }
}
