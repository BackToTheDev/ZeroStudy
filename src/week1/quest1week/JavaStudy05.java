package week1.quest1week;
// BE 36기_권준성
public class JavaStudy05 {
    public static void main(String[] args) {
        int score = 85;
        
        if (score >= 60) {
            System.out.println("합격!");
        } else {
            System.out.println("불합격!");
        }

        String result = score >= 60 ? "합격!" : "불합격!";
        System.out.println("삼항 연산자 : " + result);
    }
}
