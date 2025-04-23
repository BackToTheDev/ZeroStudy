package week4.day3.anonymous;

public class Downloader2 {
    public void download(String filename, DownloaderCallback2 callback2) {
        System.out.println(filename + " 다운로드 중...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        callback2.onSuccess(filename);
    }

}
