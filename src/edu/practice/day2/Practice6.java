package edu.practice.day2;

import java.util.Scanner;

/**
 * 문제 6 : 숫자 맞히기 게임 (1~50)
 * 1~50 사이의 랜덤 숫자를 맞히는 게임을 만드세요.
 * - Math.random() 활용하여 1~50 범위의 정수 생성
 * - 힌트 제공 (입력한 숫자보다 정답이 크다/작다)
 * - 시도 횟수 제한 (7회)
 * - 정답을 맞히거나 횟수 초과 시 게임 종료
 * =============================
 * <실행예시>
 * 1~50 사이의 숫자를 맞혀보세요!
 * 시도 1/7: 25
 * 입력한 숫자보다 정답이 큽니다.
 * 시도 2/7: 40
 * 입력한 숫자보다 정답이 작습니다.
 * 시도 3/7: 32
 * 정답입니다! 정답: 32, 시도횟수: 3회
 */
public class Practice6 {
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1~50 사이의 숫자를 맞혀보세요!");
        int answer = (int)(Math.random()*50) + 1; // 1~50
        int count = 0;

        for (int i = 1; i <= 50; i++) {
            count++;
            System.out.printf("시도 %d/7: ", count);
            int input =  sc.nextInt();
            if(answer == input){
                System.out.printf("정답입니다! 정답 : %d, 시도횟수: %d회", answer, count);
                break;
            } else if(answer < input) {
                System.out.println("입력한 숫자보다 정답이 작습니다.");
            } else {
                System.out.println("입력한 숫자보다 정답이 큽니다.");
            }

            if(count >= 7) {
                System.out.println("시도 횟수를 초과하였습니다. 프로그램이 종료됩니다.");
                break;
            }
        }
    }
}
