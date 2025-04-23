package week4.day3.anonymous;

public class Downloader {
    public void download(String filename, DownloadCallback callback) {
        System.out.println(filename + " 다운로드 중...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        callback.onSuccess(filename);
    }
}
