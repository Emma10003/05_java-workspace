package edu.practice.day2;

import java.util.Scanner;

/**
 * 문제 8 : 성적 관리 프로그램
 * 5명의 학생 성적을 입력받아 총점, 평균, 최고점, 최저점을 구하는 프로그램을 작성하세요.
 * - int 배열 사용 (크기: 5)
 * - for문으로 성적 입력받기
 * - 총점, 평균, 최고점, 최저점 계산
 * =================================
 * <실행예시>
 * 5명의 성적을 입력하세요.
 * 1번 학생: 85
 * 2번 학생: 92
 * 3번 학생: 78
 * 4번 학생: 96
 * 5번 학생: 84
 *
 * === 성적 통계 ===
 * 총점: 435점
 * 평균: 87.0점
 * 최고점: 96점
 * 최저점: 78점
 */
public class Practice8 {
    Scanner sc=new Scanner(System.in);
    int[] scores = new int[5];
    int total, min, max;
    double average;

    public void method1(){
        for (int i = 0; i < scores.length; i++){
            System.out.printf("%d번 학생: ", i+1);
            scores[i] = sc.nextInt();
            total += scores[i];
        }
        average = total / 5.0;

        // 최대값, 최소값 구하기
        min = 100;
        max = 0;
        for (int i = 0; i <scores.length; i++){
            min = Math.min(min, scores[i]);
            max = Math.max(max, scores[i]);
        }
        System.out.println();
        System.out.println("=== 성적 통계 ===");
        System.out.println("총점 : " + total + "점");
        System.out.println("평균 : " + average + "점");
        System.out.println("최고점 : " + max + "점");
        System.out.println("최저점 : " + min + "점");
    }
}
