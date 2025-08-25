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


}
