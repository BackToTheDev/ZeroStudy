package week4.day3.anonymous;

public class AnonymousCallbackExample {
    public static void main(String[] args) {
        Downloader downloader = new Downloader();

        downloader.download("zero-study.zip", new DownloadCallback() {
            @Override
            public void onSuccess(String filename) {
                System.out.println("다운로드 완료: " + filename);
            }
        });
    }
}
