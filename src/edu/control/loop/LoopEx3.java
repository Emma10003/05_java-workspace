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
}
