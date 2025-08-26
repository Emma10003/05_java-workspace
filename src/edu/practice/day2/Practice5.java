package edu.practice.day2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * 문제 5 : 구구단 선택기
 * 사용자가 원하는 구구단만 출력하거나, 전체 구구단을 출력할 수 있는 프로그램을 작성하세요.
 * - 메뉴 선택 기능 구현 (1: 특정 단, 2: 전체, 0: 종료)
 * - while(true)와 break 사용하여 반복 메뉴
 * - switch문 또는 if-else문 활용
 * =================================
 * <실행예시>
 * === 구구단 프로그램 ===
 * 1. 특정 단 출력
 * 2. 전체 구구단 출력
 * 0. 종료
 * 선택: 1
 * 몇 단을 출력하시겠습니까? 7
 * [7단]
 * 7 × 1 = 7
 * 7 × 2 = 14
 * ...
 * 7 × 9 = 63
 */
public class Practice5 {
    Scanner sc = new Scanner(System.in);
    int menu;
    int dan;

    public void method1(){
        while(true){
            System.out.println("=== 구구단 프로그램 ===");
            System.out.println("1. 특정 단 출력");
            System.out.println("2. 전체 구구단 출력");
            System.out.println("0. 종료");

            System.out.print("선택 (숫자만 입력) : ");
            menu = sc.nextInt();
            switch(menu){
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    System.out.print("몇 단을 출력하시겠습니까? ");
                    dan = sc.nextInt();
                    for(int i = 1; i <= 9; i++) {
                        System.out.printf("%d x %d = %d\n", dan, i, dan * i);
                    }
                case 2:
                    System.out.println("전체 구구단을 출력합니다.");
                    for (int i = 1; i <= 9; i++) {
                        System.out.printf("=== %d단 ===", i);
                        for (int j = 1; j <= 9; j++) {
                            System.out.printf("%d x %d = %d\n", i, j, i*j);
                        }
                        System.out.println();
                    }
            }
        }

    }
}
