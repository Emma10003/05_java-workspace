package edu.practice.day1;

import java.util.Scanner;

/**
 * [계산기 만들기]
 * Scanner를 이용해 두 개의 정수를 입력받고, 사칙연산 결과를 모두 출력하는 프로그램을 작성하세요.
 * - 첫 번째 정수와 두 번째 정수를 Scanner로 입력받기
 * - 덧셈, 뺄셈, 곱셈, 나눗셈 결과 출력
 * - 나눗셈은 실수로 계산하여 소수점 둘째 자리까지 출력
 * <실행 예시>
 * 첫 번째 정수 입력: 10
 * 두 번째 정수 입력: 3
 *
 * === 계산 결과 ===
 * 10 + 3 = 13
 * 10 - 3 = 7
 * 10 * 3 = 30
 * 10 / 3 = 3.33
 */
public class Exercise2 {
    public void exercise2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double)num1 / num2;

        System.out.println("=== 계산 결과 ===");
        System.out.printf("%d + %d = %d \n%d - %d = %d \n%d * %d = %d\n%d / %d = %.2f", num1, num2, add, num1, num2, sub, num1, num2, mul, num1, num2, div);
        /*
         Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
         나누기 : %d 아니고 %.2f 사용
         (문자열 포맷 형태 오류)
         */
    }
}
