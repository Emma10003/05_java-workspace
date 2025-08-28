package edu.practice.day2;

import java.util.Scanner;

/**
 * 문제 4 : 소수 판별기
 * 사용자가 입력한 숫자가 소수인지 판별하는 프로그램을 작성하세요.
 * - 2 이상의 정수를 입력받기
 * - for문으로 2부터 입력받은 수-1까지 나누어 확인
 * - 소수 조건: 1과 자기 자신으로만 나누어떨어지는 수
 * =============================
 * <실헁예시>
 * 숫자를 입력하세요: 17
 * 17은 소수입니다.
 *
 * 숫자를 입력하세요: 15
 * 15는 소수가 아닙니다.
 */
public class Practice4 {
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number =  sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if(number < 2){
                isPrime = false;
            } else {
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.printf("%d는 소수입니다.", number);
        } else {
            System.out.printf("%d는 소수가 아닙니다.", number);
        }

    }
}
