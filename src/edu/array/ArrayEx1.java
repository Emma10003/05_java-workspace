package edu.array;

import java.util.Scanner;

/**
 * 배열 기능용 클래스
 */
public class ArrayEx1 {
    /* 배열 (자료구조)
        - Java 에서의 배열
          : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
          - 생성된 배열의 요소는 index를 이용해서 구분
          - 생성된 배열을 활용하기 위해서는
            배열을 참조하는 "참조형 변수"를 이용한다.
            
        [참조형 변수]
        - 주소를 저장하는 변수
        - 변수 사용 시 저장된 주소로 찾아가서 그 곳에 위치한 배열, 객체를 참조한다.
        - 기본 자료형 8개를 제외한 나머지는 모두 참조형 변수.
            기본 자료형 (boolean, byte, short, int, long, char, float, double)
            
        참조형 변수란 ? -> 개발자가 만들어놓은 클래스 파일을 참조하는 변수이름.
     */

    /**
     * 배열 선언, 할당, 초기화
     */
    public void method1(){
        // 변수 선언
        int num;
        // Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고
        // 그 변수의 이름을 "num"으로 지정
        
        // 배열 선언
        int[] arr;
        // Stack 영역에 int[] 자료형을 참조할 변수를 생성하고 (주소 저장)
        // 그 변수의 이름을 "arr"으로 지정
        
        // 배열 할당
        arr = new int[4];
        // Heap 영역에 int 4개짜리 배열을 할당 후
        // 생성된 배열의 주소를 "arr" 변수에 대입
        
        // -> arr을 이용해서 배열을 참조해서 arr에 저장된 데이터를 사용할 수 있음

        // 배열 초기화

        // 1) 초기화 전 -> 0이 대입되어 있는지 확인
        System.out.println("초기화 전 배열의 상태");
        System.out.println("arr가 위치한 컴퓨터 내의 주소명칭: " + arr);
        System.out.println("arr의 초기값의 길이: " + arr.length);
        System.out.println("arr[0]의 초기화 전 값 : " + arr[0]);
        System.out.println("arr[1]의 초기화 전 값 : " + arr[1]);
        System.out.println("arr[2]의 초기화 전 값 : " + arr[2]);
        System.out.println("arr[3]의 초기화 전 값 : " + arr[3]);

        // * bug : 프로그램 수행 중 발생하는 오류 (== error)
        // * debug : 프로그램 수행 중
        //           특정 시점에 어떤 값을 지니고 있는지 확인하는 것
        //                  -> 코드 상태, 오류 등을 분석할 수 있음.

        // 2) 인덱스를 이용한 초기화
        arr[0] = 100;
        arr[1] = 10000;
        arr[2] = 3;
        arr[3] = 777;
        /*
        arr[4] = 5555; // 문제가 발생할 것
        arr가 위치한 컴퓨터 내의 주소명칭: [I@2f4d3709
        arr의 초기값의 길이: 4
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
            at edu.array.ArrayEx1.method1(ArrayEx1.java:61)
            at edu.array.ArrayRun.main(ArrayRun.java:10)
        ------------------------------------------------------------------------------------------------------
        Index 4 out = index 배열이 배치될 수 있는 칸은 4칸인데, 4칸 이상을 작성해서 발생하는 예외상황
        자바스크립트에서는 length 의 길이보다 데이터가 많은 경우 자연스럽게 데이터가 추가되면서 
            length의 길이도 커지지만,
        자바는 최초로 지정한 칸 수를 그대로 유지하며, 칸 수를 초과할 경우 예외상황 발생

        추후 ArrayList 로 자바스크립트처럼 최초로 지정한 칸 수에 관계없이 데이터를 추가할 수 있는
        class 파일을 자바 개발자가 만든 후 자바 버전을 업그레이드 하였고,
        개발자들은 ArrayList와 같은 기능을 활용해서 유연하게 데이터를 추가하고 삭제할 수 있음
         */
        System.out.println("초기화 후");
        System.out.println("arr[0]의 초기화 후 값 : " + arr[0]);
        System.out.println("arr[1]의 초기화 후 값 : " + arr[1]);
        System.out.println("arr[2]의 초기화 후 값 : " + arr[2]);
        System.out.println("arr[3]의 초기화 후 값 : " + arr[3]);
        /*
        디버그 모드 : 확인하고 싶은 코드 다음 줄에 break point 추가해서 문제 확인할 것!
         */
    }

    /*
    정수 4개를 입력 받아 배열에 차례대로 대입 후
    for문을 활용해 배열 값 확인
     */
    public void method2(){
        Scanner sc = new Scanner(System.in);
        // 배열 선언 + 할당
        int[] arr = new int[4];

        // 배열이름.length = 배열의 총 길이
        // index는 length-1 한 값
        // index 0번부터 length-1번 까지만 추가할 것
        for (int i = 0; i < arr.length; i++){
            System.out.print(i + "번째 인덱스");
            arr[i] = sc.nextInt();
        }
        System.out.println("--- 배열에 추가된 값 확인 ---");
        // for문을 활용해서 배열에 추가된 숫자값 확인
        for (int i = 0; i < arr.length; i++){

        }
    }
}
