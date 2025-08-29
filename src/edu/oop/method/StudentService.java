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
     * displayMenu 메서드가 html 화면으로 데이터를 보내는 역할이라고 생각!
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
            // java 언어로만 데이터 출력과 저장을 확인할 때만 label 태그 대신 사용
            System.out.print("메뉴 선택 :");
            input = sc.nextInt(); // input type = number 대신 사용

            switch(input){
                case 1:
                    System.out.println("학생을 등록할 변수를 선택하세요.");
                    System.out.print("1=std1 / 2=std2   :");
                    int select = sc.nextInt();
                    if(select == 1){
                        System.out.println("이미 학생이 등록되어 있는 번호입니다.");
                    } else {
                        System.out.println("조회되는 학생의 정보가 존재하지 않습니다.");
                        System.out.println("학생 등록을 시작하겠습니다.");
                        std2 = createStudent();
                    }
                    break;
                case 2:
                    System.out.println("학생 정보를 확인합니다.");
                    System.out.println("학생 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1=std1 / 2=std2   :");
                    select = sc.nextInt();
                    if(select == 1) System.out.println( studentInform(std1));
                        // 하나의 기능으로 작성하고 기능을  재사용 하는 방식으로 변경
//                        System.out.println("학생이름 "  +  std1.getName());
//                        System.out.println("학생학번 "  +  std1.getStudentNumber());
//                        System.out.println("학생성별 "  +  std1.getGender());
                    else  System.out.println( studentInform(std2));
                    // html 화면 대신  System.out.print 출력 화면으로 데이터가 무사히 나오고 있는지 확인
                    //studentInform(std2); -> html 연결 후에는 이와 같은 형태로 데이터 html 전달
//                        System.out.println("학생이름 "  +  std2.getName());
//                        System.out.println("학생학번 "  +  std2.getStudentNumber());
//                        System.out.println("학생성별 "  +  std2.getGender());
                    break;
                case 0: System.out.println("프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }

    private Student createStudent() {
        System.out.print("이름 :" );
        String createName = sc.next();
        System.out.print("학번 :" );
        String createNumber = sc.next();
        System.out.print("성별(남/여) :" );
        char createGender = sc.next().charAt(0);
        // sc.next().charAt(0);  sc.next()로 입력받은 문자열 중에서
        // 0 번째 인덱스 번째 문자 하나를 반환 받아 createGender 변수에 저장

        return new Student(createName, createNumber, createGender);
    }



    /**
     *  매개 변수로 전달 받은 학생의 정보를 문자열로 만들어서 반환
     * @param 특정학생 : std1 또는 std2 변수명칭의 데이터가 들어올 자리    param = 파라미터 줄임말 = 매개변수
     * @return 학생 정보가 작성된 문자열  // html 연결 후에는 ㅇㅇㅇ 주소로 이동시켜서 데이터 전달하겠다 와 같은역할
     *
     * private void studentInform(Student 특정학생){
     */
    private String studentInform(Student 특정학생){
        // String.format("패턴",변수)
        // - 패턴 모양의 문자열을 반환하는 String 메서드

        // Student 클래스 모형으로 담겨져 있는 학생의 데이터가 존재하면 존재하는 값이 출력
        // 존재하지 않으면 null 이나 숫자의 경우 0 의 형태로 출력

        String a=        String.format("%s / %s / %c",
                특정학생.getName(), 특정학생.getStudentNumber(), 특정학생.getGender());
        return  a;
    }
}
