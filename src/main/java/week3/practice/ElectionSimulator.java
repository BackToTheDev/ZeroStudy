//BE 36_권준성
package week3.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class NumberOverException extends RuntimeException {
    public NumberOverException(String message) {
        super(message);
    }
}

class NameLengthException extends RuntimeException {
    public NameLengthException(String message) {
        super(message);
    }
}

class NameException extends RuntimeException {
    public NameException(String message) {
        super(message);
    }
}

public class ElectionSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vote = 0;
        System.out.print("총 진행할 투표수를 입력해 주세요: ");
        vote = scanner.nextInt();

        if (vote <= 1 || vote >= 10000) {
            throw new NumberOverException("투표 수는 1이상 10000 이하만 가능합니다. ");
        }

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요: ");
        int election = scanner.nextInt();
        scanner.nextLine();

        if (election <= 2 || election >= 10) {
            throw new NumberOverException("후보자 수는 2명 이상 10명 이하만 가능합니다.");
        }


        List<String> people = new ArrayList<>(election);
        String name;



        for (int i = 1; i <= election; i++) {
            System.out.print(i + "번째 후보자이름을 입력해 주세요: ");
            name = scanner.nextLine();
            people.add(name);

            if (name.length() > 10) {
                throw new NameLengthException("후보자 이름은 10자 미만으로 작성해주세요.");
            }

            if (!name.matches("^[가-힣]+&")) {
                throw new NameException("후보자 이름은 한글로 입력해주세요.");
            }
        }

        int[] votePerCandidate = new int[election];
        for (int i = 0; i < vote; i++) {
            double progress = ((i + 1) / (double) vote) * 100;
            int choice = random.nextInt(election);
            votePerCandidate[choice]++;
            System.out.printf("[투표진행률]: %.1f%%, %d명 투표 => %s\n", progress, (i + 1), people.get(choice));
        }

        int maxIndex = 0;
        int winnerIndex = 0;
        for (int i = 0; i < election; i++) {
            if (votePerCandidate[i] > maxIndex) {
                maxIndex = votePerCandidate[i];
                winnerIndex = i;
            }
        }
        System.out.println("[투표결과] 당선인: " + people.get(winnerIndex));


    }
}
