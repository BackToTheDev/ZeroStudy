package week1.day4;

public class MatrixArrayExample {

    public static void main(String[] args) {
        // 문제 : 이차원 배열에 저장된 일차원 배열의 문자열을 조합해 하나의 문장을 만들어 보는 문제
        // 이차원 문자열 배열 생성
        String[][] words = {
                {"어제", "내일"},
                {"나는", "동생은"},
                {"여행을", "학교에"},
                {"다녀왔다", "갈 예정이다"}
        };

        // 위 문장을 가지고 아랠의 완성된 문장을 만들어보세요.
        // 어제 나는 여행을 다녀왔다.
        // 내일 동생은 학교에 갈 예정이다.

        for (int i = 0; i < words[0].length; i++) {
            for (int j = 0; j < words.length; j++) {
                    System.out.print(words[j][i] + " ");
            }
            System.out.println();
        }
    }
}
