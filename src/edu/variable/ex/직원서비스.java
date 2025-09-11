package edu.variable.ex;

import static edu.variable.ex.더조은회사.*;

public class 직원서비스 {
    // static 으로 작성한 필드 명칭은 앞에 클래스 명칭이 없어도 됨
    // 중복되는 명칭의 필드들이 존재한다면
    // 문서 명칭으로 구분지어서 사용.
    public static void 회사정보(){
        System.out.println("회사: " + 회사이름);
        System.out.println("주소: " + 회사주소);
        System.out.println("총 사원 수: " + 사원수);
    }
}
