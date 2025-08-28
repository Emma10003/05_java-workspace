package edu.practice.day4;

public class PracticeRun {
    public static void main(String[] args) {
        System.out.println("=== Java 4일차 OOP 실습문제 실행 ===");

        // 문제 1: 학생 클래스
         testPractice1();

        // 문제 2: 도서관 도서 관리
        // testPractice2();

        // 문제 3: 카페 주문 관리
        // testPractice3();

        // 문제 4: 계산기 클래스
        // testPractice4();

    }

    public static void testPractice1() {
        System.out.println("\n=== 문제 1: 학생 클래스 테스트 ===");

        // 기본생성자로 생성
        Student s1 = new Student();
        s1.setName("김자바");
        s1.setStudentId("2024001");
        s1.setScore(85);

        // 필수생성자로 생성
        Student s2 = new Student("박코딩", "2024002", 45);

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }
}
