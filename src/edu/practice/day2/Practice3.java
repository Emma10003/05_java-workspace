package edu.practice.day2;

import java.util.Scanner;

/**
 * 문제 3 : 팩토리얼 계산기
 * 사용자가 입력한 수의 팩토리얼을 계산하는 프로그램을 작성하세요.
 * - 양의 정수를 입력받기
 * - for문 또는 while문 사용하여 팩토리얼 계산
 * - 팩토리얼 공식: n! = n × (n-1) × (n-2) × ... × 1
 * ====================================
 * <실행예시>
 * 팩토리얼을 구할 숫자를 입력하세요: 5
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 */
public class Practice3 {
    Scanner sc=new Scanner(System.in);
    int num;
    long factorial;

    public void method1(){
        System.out.print("팩토리얼을 구할 숫자를 입력하세요: ");
        num = sc.nextInt();
        factorial = 1;

        System.out.printf("%d! = ", num);
        for (int i = num; i >= 1; i--) {
            System.out.print(i);
            factorial *= i;
            if(i == 1){
                System.out.print(" = ");
                break;
            }
            System.out.print(" x ");
        }
        System.out.println(factorial);

    }
}
