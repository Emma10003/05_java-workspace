package edu.oop.method;

import java.util.Scanner;

/**
 * Student 속성을 활용한 기능 제공 클래스
 */
public class StudentService {
    // 필드
    private Scanner sc = new Scanner(System.in);

    /**
     * 메인 메뉴를 제공하는 화면 = html 대신 활용하고 있는 상황
     * displayMenu 를 html 화면으로 데이터를 보낸다고 생각!
     */
    public void displayMenu(){
        int input; // Scanner로 입력받은 메뉴 번호를 저장할 변수, 기본값 = 0;
        
        // 학생 객체를 참조할 참조형 변수 2개 선언
        // null = 참조할 객체가 없음
        Student std1 = new Student("홍길동", "112233", '남');
        Student std2 = null; // name, studentNumber, gender, java, html 와 같은 속성, 변수명칭 자체가 없는 상태
//        Student std3 = new Student(); // name, studentNumber, gender, java, html 와 같은 속성, 변수명칭은 쓸 수 있도록 존재하는 상태.

        while(true){
            // Scanner = input textarea 대신 사용하는 것
            // System  = <div>, <p>, <span>, <a> 등을 대신 사용하는 것  ===>  html 과 java를 연결하고 나서는 html 화면을 활용
            //  => 나중엔 Scanner 는 사용하지 않고, System은 개발자가 데이터를 무사히 전달하고, 사용하고 있는지 확인하는 용도로만 사용
            System.out.println("""
=== 학생 관리 프로그램 ===
1. 학생 등록
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. HTML 공부하기
6. Java 역량 비교하기
7. HTML 역량 비교하기
0. 프로그램 종료
                    """);
            // java 언어로만 데이터 출력/저장을 확인할 때만 label 태그 대신 사용
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt(); // <input type = number> 대신 사용

            switch(input){
                case 1:
                    System.out.println("학생을 등록할 변수를 선택하세요: ");
                    System.out.print("1 = std1 / 2 = std2    : ");
                    int select = sc.nextInt();
                    if(select == 1){
                        System.out.println("이미 학생이 등록되어 있는 번호입니다.");
                    } else {
                        System.out.println("학생 등록을 시작합니다.");
                        // 학생 등록을 위한 메서드 호출
                    }
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }
}
