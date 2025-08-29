package edu.oop.method;

public class WithoutMethod {
    public static void main(String[] args) {
        // 학생 1의 성적 처리
        String student1Name = "김철수";
        int student1Korean = 85;
        int student1English = 90;
        int student1Math = 78;

        // 학생 1 총점 계산
        int student1Total = student1Korean + student1English + student1Math;

        // 학생 1 평균 계산
        double student1Average = student1Total / 3.0;

        // 학생 1 학점 계산
        String student1Grade;
        if (student1Average >= 90) {
            student1Grade = "A";
        } else if (student1Average >= 80) {
            student1Grade = "B";
        } else if (student1Average >= 70) {
            student1Grade = "C";
        } else if (student1Average >= 60) {
            student1Grade = "D";
        } else {
            student1Grade = "F";
        }

        // 학생 1 결과 출력
        System.out.println("=== " + student1Name + " 성적표 ===");
        System.out.println("국어: " + student1Korean + "점");
        System.out.println("영어: " + student1English + "점");
        System.out.println("수학: " + student1Math + "점");
        System.out.println("총점: " + student1Total + "점");
        System.out.println("평균: " + String.format("%.2f", student1Average) + "점");
        System.out.println("학점: " + student1Grade);
        System.out.println();


        // 학생 2의 성적 처리 (완전히 중복된 로직)
        String student2Name = "이영희";
        int student2Korean = 92;
        int student2English = 88;
        int student2Math = 95;

        // 학생 2 총점 계산
        int student2Total = student2Korean + student2English + student2Math;

        // 학생 2 평균 계산
        double student2Average = student2Total / 3.0;

        // 학생 2 학점 계산 (동일한 로직 반복)
        String student2Grade;
        if (student2Average >= 90) {
            student2Grade = "A";
        } else if (student2Average >= 80) {
            student2Grade = "B";
        } else if (student2Average >= 70) {
            student2Grade = "C";
        } else if (student2Average >= 60) {
            student2Grade = "D";
        } else {
            student2Grade = "F";
        }

        // 학생 2 결과 출력 (동일한 형식 반복)
        System.out.println("=== " + student2Name + " 성적표 ===");
        System.out.println("국어: " + student2Korean + "점");
        System.out.println("영어: " + student2English + "점");
        System.out.println("수학: " + student2Math + "점");
        System.out.println("총점: " + student2Total + "점");
        System.out.println("평균: " + String.format("%.2f", student2Average) + "점");
        System.out.println("학점: " + student2Grade);
        System.out.println();


        // 학생 3의 성적 처리 (또 다시 중복)
        String student3Name = "박민수";
        int student3Korean = 76;
        int student3English = 82;
        int student3Math = 69;

        // 학생 3 총점 계산
        int student3Total = student3Korean + student3English + student3Math;

        // 학생 3 평균 계산
        double student3Average = student3Total / 3.0;

        // 학생 3 학점 계산 (또 다시 동일한 로직)
        String student3Grade;
        if (student3Average >= 90) {
            student3Grade = "A";
        } else if (student3Average >= 80) {
            student3Grade = "B";
        } else if (student3Average >= 70) {
            student3Grade = "C";
        } else if (student3Average >= 60) {
            student3Grade = "D";
        } else {
            student3Grade = "F";
        }

        // 학생 3 결과 출력 (또 다시 동일한 형식)
        System.out.println("=== " + student3Name + " 성적표 ===");
        System.out.println("국어: " + student3Korean + "점");
        System.out.println("영어: " + student3English + "점");
        System.out.println("수학: " + student3Math + "점");
        System.out.println("총점: " + student3Total + "점");
        System.out.println("평균: " + String.format("%.2f", student3Average) + "점");
        System.out.println("학점: " + student3Grade);
        System.out.println();


        // 전체 통계 계산
        int totalAllStudents = student1Total + student2Total + student3Total;
        double averageAllStudents = totalAllStudents / 9.0; // 총 9과목

        System.out.println("=== 전체 통계 ===");
        System.out.println("전체 학생 수: 3명");
        System.out.println("전체 총점 합계: " + totalAllStudents + "점");
        System.out.println("전체 평균: " + String.format("%.2f", averageAllStudents) + "점");

        // 최고점 학생 찾기 (비효율적인 방식)
        if (student1Average >= student2Average && student1Average >= student3Average) {
            System.out.println("최고 성적: " + student1Name + " (" + String.format("%.2f", student1Average) + "점)");
        } else if (student2Average >= student1Average && student2Average >= student3Average) {
            System.out.println("최고 성적: " + student2Name + " (" + String.format("%.2f", student2Average) + "점)");
        } else {
            System.out.println("최고 성적: " + student3Name + " (" + String.format("%.2f", student3Average) + "점)");
        }
    }
}
