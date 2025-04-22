package week1.quest1week;
// BE 36기_권준성
public class JavaStudy07 {
    public static void main(String[] args) {
        String[][] arrayStudy = {
                {"어제", "내일"},
                {"나는", "동생은"},
                {"여행을", "학교에"},
                {"다녀왔다", "갈 예정이다."}
        };

        for (int i = 0; i < arrayStudy[i].length; i++) {
            System.out.print("문장 " + (i + 1) + " : ");
            for (int j = 0; j < arrayStudy.length; j++) {
                System.out.print(arrayStudy[j][i] + " ");
            }
            System.out.println();
        }
    }
}
