package edu.control.loop;

import java.util.Scanner;

/**
 * 루프 기능 설정용 클래스
 * 중첩 반복문
 */
public class LoopEx2 {

    // 스캐너 변수 이름을 지역변수가 아닌 전역변수로 작성해서 사용
    /*
     * 지역변수와 전역변수
     * : 변수의 선언 위치에 따라 접근 범위가 달라지는 것을 의미
     *
     * 멤버변수 = 필드 = 인스턴스 변수 = 전역변수(global variable)
     *
     * 인스턴스 변수
     * : 객체가 생성될 때 메모리에 올라감
     * - static 키워드 없이 선언
     * - class 내에 중괄호 다음에 바로 작성하는 변수 명칭
     *
     * 클래스 변수
     * : 프로그램 실행 시 한 번만 생성되고, main 내에 존재하지 않더라도
     * heap이 아닌 static 내에 존재
     * [선언]
     * static int 변수이름 = 데이터
     */

    Scanner sc = new Scanner(System.in);
    // 스캐너를 최초 1회 작성 후 모든 메서드 내에서 sc 라는 명칭으로 사용

    /**
     * 2단부터 9단까지 모두 출력
     * method1
     */
    public void method1(){
        for(int x = 2; x <= 9; x++) { // 행(==단 2~9단까지 반복해서 출력)
            System.out.printf("=== %d단 ===\n", x);
            for (int num = 1; num <= 9; num++) {
                System.out.printf("%d X %d = %2d\n", x, num, x*num);
            }
        }
    }

}
