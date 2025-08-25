package edu.control.condition;
// 폴더 위치 : edu폴더 > control폴더 > condition 폴더
// 같은 폴더 내에 존재하는 클래스는 import 해서 가져오지 않아도 됨
// 다른 폴더인 경우 import 를 이용해서 class 파일 명칭을 가져와야 함.
/**
 * 조건문 실행용 클래스
 */
public class ConditionRun {
    public static void main(String[] args) {
        ConditionEx ex = new ConditionEx(); // new ConditionEx 파일을 사용하겠다 - ex라는 명칭으로
        /*
        Function 이라면  method1();     형태로 단독 사용 가능
        method   라면   객체.method1(); 형태로 특정 클래스나 예약어에 존재하는 기능 사용
        자바에서는 Class 형태가 기본이기 때문에 메서드 형태로 모든 기능 작성.
         */
        ex.method1();
        System.out.println();
        ex.method2();
        System.out.println();
        ex.method3();
    }
}
