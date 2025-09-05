package edu.exception.pack3.ex2.개발자Exception;

public class 회사에서만든예외문서 extends Exception {
    public 회사에서만든예외문서() {
        super("회사에서 공식적으로 출력하는 예외에 대한 설명입니다.");
    }

    // 회사에서 공식적으로 출력하는 예외에 대한 설명을
    // 잠시 수정해서 활용해야 할 경우에는 message 라는 파라미터가 들어간
    // 매개변수 생성자를 이용해서 일시적으로 출력문을 변경할 수 있다.
    public 회사에서만든예외문서(String message) {
        super(message);
    }
}
