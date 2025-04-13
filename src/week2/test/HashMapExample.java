//BE 36_권준성
package week2.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<Integer>> gs = new HashMap<>();

        while (true) {
            System.out.println("성적 관리 시스템 (add, remove, grade, average, list, exit)");
            System.out.print("명령 입력: ");
            String select = scanner.nextLine();
            int sum = 0;


            switch (select) {
                case "add":
                    System.out.print("학생 이름: ");
                    String addInput = scanner.nextLine();
                    gs.putIfAbsent(addInput, new ArrayList<>());
                    System.out.println("학생이 추가되었습니다.");
                    break;

                case "grade":
                    System.out.print("성적 추가할 학생 이름: ");
                    String gradeStudent = scanner.nextLine();
                    if (gs.containsKey(gradeStudent)) {
                        System.out.print("성적 입력: ");
                        int grade = Integer.parseInt(scanner.nextLine());
                        gs.get(gradeStudent).add(grade);
                    } else {
                        System.out.println("해당 학생은 존재하지 않습니다.");
                    }
                    break;

                case "list":
                    System.out.println("학생 목록: ");
                    for (String s : gs.keySet()) {
                        System.out.println(s + " - 성적: " + gs.get(s));
                    }
                    break;

                case "average":
                    System.out.print("평균 조회할 학생 이름: ");
                    String avgName = scanner.nextLine();
                    if (gs.containsKey(avgName)) {
                        List<Integer> grades = gs.get(avgName);
                        double avg = grades.stream().mapToInt(i -> i).average().orElse(0.0);
                        System.out.printf("%s의 평균 성적: %.1f\n", avgName, avg);

                        } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;
                case "remove":
                    System.out.print("삭제할 학생 이름: ");
                    String removeName = scanner.nextLine();
                    if (gs.containsKey(removeName)) {
                        gs.remove(removeName);
                        System.out.println("학생이 삭제되었습니다.");
                    } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;
                    
                case "exit":
                    System.out.println("프로그램 종료.");
                    return;
            }

        }

    }

}
