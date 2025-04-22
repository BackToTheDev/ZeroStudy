package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LottoApplication {
    private static final List<Set<Integer>> lottoHistory = new ArrayList<>();

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        while (true) {
            Set<Integer> lottoNumbers = generator.generate();
            System.out.println(lottoNumbers);
            lottoHistory.add(generator.generate());
        }
    }
}
