package week4.day3.anonymous;

public class AnonymousCallbackExample2 {
    public static void main(String[] args) {
        Downloader2 downloader2 = new Downloader2();


        downloader2.download("ondisk", filename -> {
            System.out.println("다운로드 완료: " + filename);
        });
    }
}
