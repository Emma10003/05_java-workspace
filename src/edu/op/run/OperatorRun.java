package edu.op.run;

/*
* 실행용 클래스
*/

import edu.op.ex.OperatorEx;

public class OperatorRun {
    public static void main(String[] args) {
        /*
        * OperatorEx = 코드가 작성된 클래스 이름(=파일명)
        * op  : 참조변수 이름
        * new : 프로그램을 실행하기 위하여 새로 생성해서 사용하겠다
        * */

        OperatorEx op = new OperatorEx();
        // ex 폴더에서 만들어놓은 OperatorEx 파일을 가져와서 사용
        // 가져와서 OperatorRun 클래스 내부에서 사용할 때
        // op 라는 별칭을 붙여준 후 사용.
        // 기존에 어떤 개발자가 만들어놓은 파일을 가져와서
        // 파일에 작성된 기능이나 변수값을 활용해 코딩하려고 할 때 사용.
        op.test();
        op.method1();
    }
}
