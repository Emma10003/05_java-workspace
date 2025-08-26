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
}
