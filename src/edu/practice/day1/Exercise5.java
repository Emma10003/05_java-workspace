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
        System.out.printf("\n현재 나이  : %2d세", currentAge);
        System.out.printf("\n10년 후    : %2d세", futureAge);
        System.out.printf("\n성인 여부  : %2b", isAdult);

    }

}
