package edu.op.ex;

// 폴더위치 + 파일이름 생성방법
// . 을 활용해서 폴더 구분 후 파일명칭 작성
//  edu.op.ex.OperatorEx

/*
*  기능 작성용 클래스
*/

import java.util.Scanner;

public class OperatorEx {
    /* 자바에서는 모든 기능을 class 내부에 작성하기 때문에
    *  대부분의 기능을 메서드 형태로 사용
    *  파일이름.기능이름() <- 과 같은 형태로 사용한다!
    * */

    // 메서드(기능) 호출 테스트
    public void test(){
        System.out.println("test");
    }

    /*
     * 입력받은 정수가 3의 배수가 맞는지 확인하는 기능
     */
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int a = sc.nextInt();

        // boolean 변수 이름 앞에 보통 is 단어를 붙임 -> true / false 를 위한 변수이름임을 표기
        //         위에서 sc.nextInt(); 내부에 소비자가 작성한 숫자입력값을 변수이름 a 에 저장한 후
        //         a를 3으로 나누었을 때 나머지가 0이 맞으면 3의 배수
        boolean isTrue = (a % 3 == 0);

        // %d = decimal     %b = boolean
        System.out.printf("%d는 3의 배수입니다. : %b", a,isTrue );

    }

    // void : 반환할 값이 존재하지 않고, 단순 출력만 진행하는 기능.
    /*
     * 자바 라는 언어는
     *
     * (변수) 바구니에 들어갈 데이터가
     * - 숫자, 문자, 사람이 만든 크기, 실수, 등인지에 따라
     *   데이터를 담을 변수이름의 종류(data type)부터,
     *
     * 기능을 실행할 때
     * - 기능을 실행만 하면 되는 것인지?
     *      public void 기능명칭(매개변수자리, 파라미터의 자리) {
     *          수행할 기능 작성
     *      }
     * - 기능을 실행 후 실행 결과를 어딘가에 전달하는 기능인지?
     *      public 전달할자료형 기능명칭(매개변수 자리, 파라미터의 자리) {
     *          수행할 기능 작성
     *          return 전달할데이터;
     *      }
     *
     * 등
     * 프로그램을 수행하기 전에 정의해야 할 사항이 많음.
     */

    /*
     * method2() 기능
     *  1. 첫 번재 입력 받은 수가 두 번째 입력 받은 수의 배수가 맞는지 확인
     *  2. 변수 이름 :
     *                  int = input1, input2
     *                  boolean = isTrue (%로 비교했을 때 0)
     *
     * printf 활용해서 %d는 %d의 배수가 맞는가? %b 형태로 출력
     */
    public void method2(){
        // Scanner 처럼 동일한 클래스는 최초 1회만 호출 후 여러 번 사용 가능.
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int input1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요 : ");
        int input2 = sc.nextInt();
        boolean isTrue = ((input1 % input2) == 0);
        System.out.printf("%d는 %d의 배수가 맞는가? : %b", input1, input2, isTrue);
    }

    /**
     * 입력 받은 정수가 짝수인지 홀수인지 판별
     * 정수 입력 : {입력값}
     * {입력값}은 짝수/홀수 입니다.
     */
    public void method3(){
        // void = return 없음!!! 오직 실행만!!!
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int input = sc.nextInt();

        boolean isTrue = (input % 2 == 0);

        // 삼항연산자 : 조건식 ? 참 : 거짓;
        /*
         * String result = isTrue ? "짝수" : "홀수";
         *
         * 1. isTrue ? "짝수" : "홀수"
         *      boolean isTrue = (input % 2 == 0); 위에서 input 결과가 true / false 로
         *              isTrue 라는 변수이름에 담겨짐
         *
         * 2. 담겨진 결과를 판별했을 때 ? 참이면 보여지거나 실행할 기능 설정
         *                            : 거짓이면 보여지거나 실행할 기능 설정
         *
         * if (조건식) {
         *      조건식이 true 일 경우 실행
         * } else {
         *      조건식이 false 일 경우 실행
         * }
         *
         * 에서 if 와 (), {} 를 생략하여 = ? : 으로 표현한 연산식.
         */
        String result = isTrue ? "짝수" : "홀수";

        System.out.printf("%d은/는 %s입니다.", input, result);
    }

    /*
     * [홀짝 검사기 v.2]
     * 입력 받은 정수가 홀수 또는 짝수 또는 0인지 판별
     * 정수 입력 : 0
     * -> 0입니다.
     * --------------
     * 정수 입력 : 4
     * -> 짝수입니다.
     * --------------
     * 정수 입력 : 7
     * -> 홀수입니다.
     *
     * 변수이름 : sc,
     *           int = input
     *           boolean = isZero isTrue
     * 삼항연산자 - String result "짝수", "홀수"
     */
    public void method4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int input = sc.nextInt();
        /*
        boolean isZero = (input == 0);
        boolean isTrue = (input%2 == 0);

        // 이중 삼항연산자         0이 맞음  :  0이 아님 -> 짝수/홀수 판별 후 출력
        String result = isZero ? "0입니다." : isTrue ? "짝수입니다." : "홀수입니다.";
        */
        // 한 줄로 작성하기
        // 최종 결과로  input을 1차에서 0인지 확인 : 아니라면 확인해서 짝수인지  :  홀수인지 판별
        String result = input == 0 ? "0입니다." : input%2 == 0 ? "짝수입니다." : "홀수입니다.";

        System.out.println(result);
    }
}
