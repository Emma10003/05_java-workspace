package edu.practice.day1;

import java.util.Scanner;

/**
 * [학점 계산기]
 * 세 과목의 점수를 입력받아 평균을 구하고, 학점을 출력하는 프로그램을 작성하세요.
 * - 국어, 영어, 수학 점수를 각각 입력받기
 * - 평균 점수 계산 (소수점 둘째 자리까지)
 * - 평균에 따른 학점 출력:
 *     - 90점 이상: A
 *     - 80점 이상: B
 *     - 70점 이상: C
 *     - 60점 이상: D
 *     - 60점 미만: F
 * ---------------------------
 * <실행 예시>
 * 국어 점수: 85
 * 영어 점수: 90
 * 수학 점수: 88
 *
 * 평균: 87.67점
 * 학점: B
 */
public class Exercise4 {
    
    // 변수이름을 선언하거나 변수이름에 데이터를 넣는 것은
    // 메서드 내부에 작성하지 않고
    // 보통은 class 파일이름 바로 아래에 작성
    Scanner sc = new Scanner(System.in);
    int korean, english, math;
    public void exercise4() {

        System.out.print("국어 점수 : ");
        korean = sc.nextInt();
        System.out.print("영어 점수 : ");
        english = sc.nextInt();
        System.out.print("수학 점수 : ");
        math = sc.nextInt();

        double average = (korean + english + math) / 3.0;

        char grade;
        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'E';

        System.out.println("국어 점수: " + korean);
        System.out.println("영어 점수: " + english);
        System.out.println("수학 점수: " + math);
        System.out.println();
        System.out.printf("평균: %.2f점", average);
        System.out.println("\n학점: " + grade);
    }
}
