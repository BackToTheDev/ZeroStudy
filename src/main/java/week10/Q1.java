package week10;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i]);
            }
            } catch(IndexOutOfBoundsException e){
            System.out.println("잘못된 참조입니다.");
                System.out.println("에러 메시지: " + e.getMessage());
            }

    }
}
