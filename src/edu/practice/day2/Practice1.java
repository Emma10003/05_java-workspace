package edu.practice.day2;

import java.util.Scanner;

/**
 * 문제 1 : 짝수만 출력하기
 * 사용자로부터 두 개의 정수를 입력받아,
 * 첫 번째 수부터 두 번째 수까지의 범위에서 짝수만 출력하는 프로그램을 작성하세요.
 * - 두 개의 정수를 입력받기
 * - Math.min(), Math.max() 사용하여 작은 값부터 큰 값까지 처리
 * - for문을 활용하여 짝수만 출력
 * =============================
 * <실헁예시>
 * 첫 번째 숫자: 3
 * 두 번째 숫자: 10
 *
 * 3부터 10까지의 짝수
 * 4 6 8 10
 *
 */
public class Practice1 {
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int input1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int input2 = sc.nextInt();

        int min = Math.min(input1, input2);
        int max = Math.max(input1, input2);

        System.out.printf("%d부터 %d까지의 짝수\n", min, max);

        for(int i = min; i <= max; i++){
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // int Enter 처리

    }
}
