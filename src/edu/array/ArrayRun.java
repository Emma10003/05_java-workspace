package edu.array;

/**
 * 배열 실행용 클래스
 */
public class ArrayRun {
    // 반드시 main 메서드로 실행할 구문 작성
    public static void main(String[] args) {
        // new 연산자 : HEAP(창고) 메모리 영역에 공간을 새롭게 할당해서
        //                                         객체나 배열을 할당.
        ArrayEx1 ex1 = new ArrayEx1();
//        ex1.method1();
//        ex1.method2();

        ArrayEx2 ex2 = new ArrayEx2();
//        ex2.method1();
        ex2.method2();
    }
}
