package edu.control.loop;

/**
 * 루프 기능 실행용 클래스
 */
public class LoopRun {
    // 메인 실행 메서드 작성 후
    // 프로그램 실행 시 수행할
    // 클래스와 메서드를 중괄호 내부에 작성
    public static void main(String[] args) {
        LoopEx ex = new LoopEx();
        // HEAP(코드창고) 영역에 존재하는
        // 개발자가 작성한 기능이나 데이터를 가져와서 객체형태로 수행.
        // 수행할 때 매번 new LoofEx() 구문을 작성하기 번거롭기 때문에
        // ex 라는 명칭으로 사용

//        ex.method1(); // LoofEx 파일 내에 존재하는 메서드 기능을 가져와서 실행
//        ex.method2();
//        ex.method3();
//        ex.method4();

        LoopEx2 ex2 = new LoopEx2();
//        ex2.method1();

        LoopEx3 ex3 = new LoopEx3();
//        ex3.method1();
//        ex3.method2();
//        ex3.method3();
//        ex3.method4();
//        ex3.method5();
//        ex3.method6();
//        ex3.method7();
        ex3.method8();


    }
}
