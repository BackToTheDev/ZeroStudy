// BE 36_권준성
package week4.day7;

import java.util.*;
import java.util.stream.Collectors;

public class LottoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("[로또 당첨 프로그램]");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int count = scanner.nextInt();

        // 내 로또
        List<List<Integer>> myLottos = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            myLottos.add(generateLotto(random));
        }

        // 당첨 번호
        List<Integer> resultNumber = generateLotto(random);

        // 내 로또 출력
        char lottoName = 'A';
        for (List<Integer> lotto : myLottos) {
            System.out.print(lottoName++ + "    ");

           String result = lotto.stream()
                   .map(String::valueOf)
                   .collect(Collectors.joining(","));
            System.out.println(result);
        }

        // 당첨 번호 출력
        System.out.println("[로또 발표]");
        String winNumber = resultNumber.stream()
                .map(String::valueOf)
                        .collect(Collectors.joining(","));
        System.out.println(winNumber);

        //결과
        System.out.println("[내 로또 결과]");
        lottoName = 'A';
        for (List<Integer> lotto : myLottos) {
            int matchCount = 0;
            for (int num : lotto) {
                if (resultNumber.contains(num)) {
                    matchCount++;
                }
            }
            String lottoResult = lotto.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(","));

            System.out.println(lottoName++ + "    " + lottoResult + " => " + matchCount + "개 일치");
        }
        scanner.close();
    }

    private static List<Integer> generateLotto(Random random) {
        Set<Integer> lottoSet = new HashSet<>(); // set을 사용하는 이유는 저장 순서를 보장하지 않아서.
        while (lottoSet.size() < 6) {
            int num = random.nextInt(45) + 1;
            lottoSet.add(num);
        }
        List<Integer> lottoList = new ArrayList<>(lottoSet);
        Collections.sort(lottoList);
        return lottoList;
    }
}
