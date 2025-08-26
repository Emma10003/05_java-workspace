package edu.control.loop;

import java.util.Scanner;

/**
 * 루프 기능용 클래스
 * 문자열 / while문 기능 작성
 */
public class LoopEx3 {
    
    Scanner sc=new Scanner(System.in);

    /**
     * 문자열을 한 글자씩 출력하기
     */
    public void method1(){
        // 문자열.charAt(인덱스) : 인덱스 번째 문자 하나를 얻어와 반환
        // 문자열.length()       : 문자열의 길이(메서드)
        String str = "Hello World!!";
        
        // str 문자열의 총 길이를 length() 메서드를 활용해 가져오고
        // 문자열의 문자를 하나씩 charAt으로 출력하는 기능
        // 문자열 = 문자 +  나열 = String
        for (int i = 0; i < str.length(); i++) {
            System.out.println("i의 값 : " + i);
            System.out.println("i 위치의 문자 확인 : " +  str.charAt(i));
            /*
            str은 문자열이기 때문에 문장 전체에서 자리를 바라본다는 것 자체가 문제
            System.out.println("i 위치의 문자 확인 : " + str(i));
             */
        }
    }

    // while(조건식) : 끝이 확실하지 않은 반복에 사용

    /**
     * -1이 입력될 때 까지 정수를 계속 입력받아
     * 입력받은 수의 합계를 구하기
     *
     * 변수이름 int sum = 0; 합계 누적용 변수
     *          int input = 0; 입력값을 저장할 변수
     *
     * while(조건이 참일 경우에만 지속적으로 실행) {
     *
     * }
     */
    public void method2(){
        int input = 0;
        int sum = 0;

        while(input != -1) { // 입력값이 -1이 아니면 반복
                             // 입력값이 -1이면 while문 종료
            System.out.println("-1을 입력하면 종료됩니다.");
            System.out.print("추가할 수를 입력하세요 : ");
            input = sc.nextInt();
            if (input != -1){
                sum += input;
            }
        }

        System.out.println("입력된 수의 합계 : " + sum);
    }

    /**
     * while문을 활용하여
     * 0이 입력될 때 까지 정수를 계속 입력 받고
     * 0 입력 시 누적된 합계 출력
     *
     * while(true){ // 무한반복
     *     if input = 0 break;
     *     // 반복 종료하는 분기문(break) 활용해서
     *     // while문 종료
     * }
     *
     * 변수이름 : int sum
     *           int input
     */
    public void method3(){
        int input;
        int sum = 0;
        System.out.println("0을 입력하면 프로그램이 종료됩니다.");
        System.out.println("0을 입력하기 전까지 모든 숫자는 더해집니다.");

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            input = sc.nextInt();
            if (input == 0) break;
            sum += input;
        }
        System.out.println("합계 : " + sum);
    }

    /**
     * do ~ while 문
     * 조건식이 뒤에 작성된 while문.
     * 최소 1회 이상은 반복을 무조건 보장
     * while문이 false여도 최초 1회는 무조건 조건이 true일 때 식을 실행
     */
    /*
        0이 입력될 때 까지 정수를 계속 입력받고 0 입력 시 누적된 합계 출력
     */
    public void method4(){
        int sum = 0;
        int input = 0;

        do { // 입력한 값이 0이 아닐 때 반복
            System.out.print("정수를 입력하세요 : ");
            input = sc.nextInt();
            sum += input;
        } while (input != 0); // input이 0이 아닐 때 반복하기 위한 조건 작성
        System.out.println("숫자 합계 : " + sum);
    }

    /**
     * 문자열을 입력받아 i-- 를 활용하여 거꾸로 출력
     *
     * String.charAt() + for문 활용
     * length()
     *
     * 메서드 기능 명칭 : method5()
     * 변수이름 : String str    int i
     */
    public void method5(){
        System.out.println("문장을 입력하면 거꾸로 출력됩니다.");
        System.out.print("문장을 입력하세요 : ");
        String str = sc.nextLine();

        // 문자열의 길이-1 부터 0까지 감소하며 출력
        // index는 0부터 시작하지만 length는 1부터 시작하기 때문에 -1.
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    /**
     * Math.random()                      // 0.0 <= 값 <= 1.0   (double 소수 타입 형태)
     * Math.random() * 10                 // 0.0 <= 값 <= 10.0  (0 이외 1부터 모두 10까지로 범위 증가)
     * (int) Math.random() * 10           // 0 <= 값 <= 10      (정수 형태로 변환)
     * (int) (Math.random() * 10) + 1     // 1 <= 값 <= 10      (정수 형태로 변환)
     *
     * 1 ~ 10 사이의 랜덤 숫자를 맞출 때 까지 반복
     * Math.random() + 난수 -> 정수로 형변환  활용
     *
     * 변수이름 : int answer  input
     *
     * 만약에 정답보다 사용자가 입력한 값이 크다면 -> "작성한 숫자보다 작습니다."
     *       정답보다 사용자가 입력한 값이 작다면 -> "작성한 숫자보다 큽니다."
     *       정답이라면 -> "정답입니다!"
     */
    public void method6(){
        int answer = (int)(Math.random()*10) + 1; // 1 ~ 10 사이의 정수
        int input = 0; // 사용자가 작성한 숫자를 저장할 데이터 변수이름
        int count = 0; // 정답을 맞추기 위해 시도한 횟수를 저장할 데이터 변수이름
        System.out.println("1 ~ 10 사이의 랜덤 숫자를 맞춰보세요!");

        while(true) {
            System.out.print("숫자를 입력하세요 : ");
            input = sc.nextInt();
            count++; // 입력 시도할 때 마다 자동으로 +1 씩 증가한 후 변수이름에 시도횟수 저장

            if (input > answer) System.out.println("작성한 숫자보다 작습니다.");
            else if (input < answer) System.out.println("작성한 숫자보다 큽니다.");
            else {
                // 중괄호 내에 구문이 2개 이상일 경우에는 중괄호 생략 불가
                System.out.println("정답입니다! 시도횟수 : " + count);
                break;
            }
        }
    }
}
