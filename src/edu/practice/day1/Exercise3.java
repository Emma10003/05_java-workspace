package edu.practice.day1;

import java.util.Scanner;

/**
 * [온도 변환기]
 * 섭씨온도를 입력받아 화씨온도로 변환하는 프로그램을 작성하세요.
 * - Scanner로 섭씨온도(실수) 입력받기
 * - 화씨온도 변환 공식: `화씨 = 섭씨 * 9 / 5 + 32`
 * - 결과를 소수점 첫째 자리까지 출력
 * --------------------------------
 * <실행 예시>
 * 섭씨온도를 입력하세요: 25.5
 * 섭씨 25.5도는 화씨 77.9도입니다.
 */
public class Exercise3 {
    public void exercise3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("섭씨온도를 입력하세요 : ");
        double celsius = sc.nextDouble();
        final double RATIO = 9.0 / 5.0; // 상수
        final int OFFSET = 32; // 상수

        double fahrenheit = celsius * RATIO + OFFSET;
//        double fahrenheit = (celsius * 9 / 5 + 32);

        System.out.printf("섭씨 %.1f도는 화씨 %.1f도입니다.", celsius, fahrenheit);
    }
}
