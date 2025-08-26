package edu.practice.day1;

import java.util.Scanner;

/**
 * [나이 계산 및 정보 출력]
 * 출생년도를 입력받아 현재 나이를 계산하고, 다양한 정보를 출력하는 프로그램을 작성하세요.
 * - 출생년도를 입력받기 (2025년 기준으로 계산)
 * - 현재 나이 계산
 * - 10년 후 나이 계산
 * - 성인 여부 판단 (20세 이상)
 * - 결과를 표 형태로 깔끔하게 출력
 * ----------------------------------------
 * <실행 예시>
 * 출생년도를 입력하세요: 2000
 *
 * ========= 나이 정보 =========
 * 출생년도    : 2000년
 * 현재 나이   :   25세
 * 10년 후     :   35세
 * 성인 여부   :   true
 * ============================
 */
public class Exercise5 {

    /**
     * 기본 요구사항 버전 기능
     */
    public void exercise5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력하세요 : ");
        int birthYear = sc.nextInt();
        final int CURRENT_YEAR = 2025;

        int currentAge = CURRENT_YEAR - birthYear;
        int futureAge = currentAge + 10;
        boolean isAdult = currentAge >= 20;

        System.out.println("========= 나이 정보 =========");
        System.out.printf("출생년도   : %d년", birthYear);
        System.out.printf("\n현재 나이  : %4d세", currentAge);
        System.out.printf("\n10년 후    : %4d세", futureAge);
        System.out.printf("\n성인 여부  : %4b\n", isAdult);
        System.out.println("============================");

    }

    /**
     * 추가 요구사항 버전 기능
     * 띠 계산 포함 버전
     */
    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력하세요 : ");
        int birthYear = sc.nextInt();
        final int CURRENT_YEAR = 2025;

        int currentAge = CURRENT_YEAR - birthYear;
        int futureAge = currentAge + 10;
        boolean isAdult = currentAge >= 20;

        // 띠 계산
        //                현재 나이 % 12 -> 해당하는 띠의 숫자로 계산.
        //      + 더하기 - 빼기 * 곱하기 / 나누기(몫) % 나누기(나머지)
//        int zodiacIndex = currentAge % 12; -> 현재 나이이므로 띠가 변함
        int zodiacIndex = birthYear % 12;
        String[] zodiacAnimals = {
                "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"
        };
        String zodiac =  zodiacAnimals[zodiacIndex];

        // 출생에 해당하는 띠를 포함해서 출력
        System.out.println("========= 나이 정보 =========");
        System.out.printf("출생년도   : %d년", birthYear);
        System.out.printf("\n현재 나이  : %4d세", currentAge);
        System.out.printf("\n10년 후    : %4d세", futureAge);
        System.out.printf("\n성인 여부  : %6b", isAdult);
        System.out.printf("\n띠        : %4s띠\n", zodiac);
        System.out.println("============================");
    }
}
