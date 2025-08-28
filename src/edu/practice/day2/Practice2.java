package edu.practice.day2;

import java.util.Scanner;

/**
 * 문제 2 : 별표 삼각형 만들기
 * 사용자가 입력한 높이만큼 별표(*)로 직각삼각형을 만드는 프로그램을 작성하세요.
 * - 높이를 입력받기
 * - 중첩 for문 사용하여 별표 패턴 출력
 * - 첫 줄은 별 1개, 둘째 줄은 별 2개, ... n줄은 별 n개
 * =============================
 * <실행예시>
 * 높이를 입력하세요: 5
 *
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Practice2 {
    Scanner sc = new Scanner(System.in);
    int height;

    public void method1(){
        System.out.print("높이를 입력하세요 :");
        height = sc.nextInt();
        System.out.println(); // nextInt 남은 버퍼 처리

        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
