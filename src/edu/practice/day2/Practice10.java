package edu.practice.day2;

import java.util.Scanner;

/**
 * 문제 10 : 간단한 로또 번호 생성기
 * 1~20 사이의 중복되지 않는 5개의 숫자를 생성하는 프로그램을 만드세요.
 * - Math.random() 활용하여 1~20 범위의 숫자 생성
 * - 중복 숫자 제거 로직 구현
 * - 5개 숫자가 모두 다를 때까지 반복
 * - 생성된 번호 출력
 * =================================
 * <실행예시>
 * === 간단 로또 번호 생성기 ===
 * 생성된 번호: 3 7 12 18 20
 * 다시 생성하시겠습니까? (y/n): y
 * 생성된 번호: 1 5 9 15 19
 * 다시 생성하시겠습니까? (y/n): n
 * 프로그램을 종료합니다.
 */
public class Practice10 {
    Scanner sc = new Scanner(System.in);
    int[] lotto = new int[6];
    int randomNum;
    boolean isDuplicate;
    String playAgain;

    public void method1() {
        System.out.println("=== 간단 로또 번호 생성기 ===");
        while (true) {
            for (int i = 0; i < lotto.length; i++) {
                while (true) { // 중복 검사 확인
                    randomNum = (int) (Math.random() * 45) + 1;
                    isDuplicate = false;
                    for (int j = 0; j < i; j++) {
                        if (lotto[j] == randomNum) {
                            isDuplicate = true; // 랜덤번호가 기존 번호들이랑 동일하다면
                            break; // 중복을 찾았으니 for문 탈출
                        }
                    }
                    // 중복되지 않았다면 번호를 배열에 저장
                    if (!isDuplicate) {
                        lotto[i] = randomNum;
                        break;
                    }
                }
                // 생성된 번호 출력
                System.out.print(lotto[i] + " ");
            }

            System.out.print("\n다시 생성하시겠습니까? (y/n) : ");
            playAgain = sc.next();
            if (playAgain.equals("n")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
