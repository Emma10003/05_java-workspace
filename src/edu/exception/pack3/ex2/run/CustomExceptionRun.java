package edu.exception.pack3.ex2.run;

import edu.exception.pack3.ex2.service.CustomExceptionService;

public class CustomExceptionRun {
    public static void main(String[] args) {
        CustomExceptionService practice = new CustomExceptionService();

        System.out.println("=== 문제 1: 키 입력 검증 ===");
        // practice.problem1();
        //
        // System.out.println("\n=== 문제 2: 비밀번호 길이 검사 ===");
        // practice.problem2();
        //
        // System.out.println("\n=== 문제 3: 시험 점수 검증 ===");
        // practice.problem3();

        System.out.println("\n=== 문제 4: 이름 입력 검증 ===");
        practice.problem4();
        //
        // System.out.println("\n=== 문제 5: 장바구니 상품 개수 ===");
        // practice.problem5();
        //
        System.out.println("\n🎉 모든 연습문제 완료!");
    }
}
