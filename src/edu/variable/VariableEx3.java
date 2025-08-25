package edu.variable;

public class VariableEx3 {
    public static void main(String[] args) {
        /* **** 강제 형변환 ****
            1. 값의 범위가 큰 자료형은 작은 자료형으로 강제로 변환
                -> 데이터 손실 고려
            2. 의도적으로 자료형을 다른 자료형으로 변환시킬 때

                [작성법]
                (자료형) 변수이름 || 값;  // 지정된 자료형으로 변경됨
        */
        // 강제 형변환 확인 1
        // -> 자료형 변환 + 데이터 손실
        int num1 = 290;
        // byte : -128 ~ 127 까지 가능 (0 포함)
        byte result1 = (byte)num1;
        System.out.println("num1 : " + num1); // 290
        System.out.println("result1 : " + result1); // 34

        // 강제 형변환 확인 2
        // - 실수를 정수로 변환해서 소수점을 없애기
        // (데이터 손실을 활용)
        double num2 = 123.123456789;
        int result2 = (int)num2;
        System.out.println("num2 : " + num2); // 123.123456789
        System.out.println("result2 : " + result2); // 정수로 강제형변환 하여 소수점 아래 숫자 제거 : 123
        
        /* 난수 + 강제 형변환 */
        // 난수 : Math.random();
        // -> 0.0 <= x < 1.0
        // 1 ~ 10 사이의 난수 발생시키기
        int random = (int)(Math.random()* 10 + 1); // 0 ~ 9 까지 숫자 생성 -> +1 해서 1 ~ 10으로 변경

        // 강제 형변환 확인 3
        // 문자(char) <-> 유니코드(int)
        System.out.println("=== 컴퓨터 상에서 각 문자의 숫자번호 ===");
        System.out.println("A의 번호 : " + (int)'A'); // 문자 A를 숫자로 변환하여 몇 번째 숫자 자리인지 확인
        System.out.println("a의 번호 : " + (int)'a'); // 문자 a를 숫자로 변환하여 몇 번째 숫자 자리인지 확인
        System.out.println("'가'의 번호 : " + (int)'가'); // 문자 '가'를 숫자로 변환하여 몇 번째 숫자 자리인지 확인
        System.out.println("84번의 문자 : " + (char)84); // 숫자 84가 몇 번째 문자인지 확인
        /* ========== 출력 구문 ==========
            === 컴퓨터 상에서 각 문자의 숫자번호 ===
            A의 번호 : 65
            a의 번호 : 97
            '가'의 번호 : 44032
            84번의 문자 : T
        */

        /* ASCII 코드 값
        *** ASCII 코드 값이란? ***
        : 문자와 숫자, 기호, 제어문자를 숫자로 표현하는 표준 구분표.

            1 ~ 31 : 제어문자 -> 출력 안됨
            32 : 스페이스 (공백)
            33 ~ 64 : 특수문자 및 숫자 일부
        */

    }
}