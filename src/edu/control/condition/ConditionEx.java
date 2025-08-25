package edu.control.condition;
// 폴더 위치 : edu폴더 > control폴더 > condition 폴더

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {
    /*
     * 나이를 입력받아
     * 19세 이상은 성인, 미만은 성인이 아닙니다.
     */
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        // 만약에 19세 이상이라면
        if (age >= 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("성인이 아닙니다.");
        }
    }

    /*
     * 나이를 입력받아
     * 13세 이하면 어린이
     * 13세 ~ 18세 이하면 청소년
     * 18세 초과는 성인
     * {}를 생략한 if문으로 작성하시오.
     * 기능명칭 : method2
     * 기능 반환여부 : X
     * 변수 명칭 : age      result 이용해서 결과 작성
     */
    public void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        String result = (age<=13) ? "어린이" : (age<=18) ? "청소년" : "성인";
        /*
        String result;
        if (age >= 18) result = "성인";
        else if (age < 18) result = "청소년";
        else result = "어린이";
         */

        System.out.println(result);
    }

    /**
     * method 3
     *
     * 달(월)을 입력받아 해당 계절 출력
     * 봄 : 3, 4, 5
     * 여름 : 6, 7, 8
     * 가을 : 9, 10, 11
     * 겨울 : 12, 1, 2
     *
     * 그 외 : 잘못 입력
     * 변수이름 : sc
     *           int month
     *           String result
     */
    public void method3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("달(월)을 입력하세요 : ");
        int month =  sc.nextInt();
        String result;

        if (month >= 3 && month <= 5) result = "봄";
        else if (month >= 6 && month <=  8) result = "여름";
        else if (month >= 9 && month <=  11) result = "가을";
        else if (month == 12 || month == 1 || month == 2) result = "겨울";
        else result = "잘못된 입력입니다.";

        // else if (month == 12 || month < 3) result = "겨울";
        // -> 이 경우 month 가 음수일 때도 해당 결과가 나올 수 있음.

        System.out.println(result);
    }

    // 한 클래스 내에서 동일한 명칭의 메서드를 사용하기 위해서는
    // 매개변수를 각각 다르게 설정하거나
    // void -> return 전달받는 형식으로 변경하는 방법 이외에는 에러 발생!
    public void method4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("달(월)을 입력하세요 : ");
        int month =  sc.nextInt();
        
        /*
        * 입력값이 잘못 되었을 경우 메서드 기능을 중간에 종료시키기
        * */
        if(month <= 1 || month > 12) {
            System.out.println("잘못 입력하였습니다.");
            return; // 아래 기능 수행하지 못하게 돌려보내기
        }

        String result;
        if (month >= 3 && month <= 5) result = "봄";
        else if (month >= 6 && month <= 8) result = "여름";
        else if (month >= 9 && month <= 11) result = "가을";
        else result = "겨울";

        // else 에서는 result 에 해당하는 데이터값이 존재하지 않아 발생하는 에러 표기
        System.out.println(result);
    }
}
