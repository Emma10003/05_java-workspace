package edu.oop.field.pack1;

/**
 * [정리]
 * public    : 모든 곳에서 사용 가능 (가장 개방적)
 * protected : 같은 패키지 + 자식 클래스에서 사용 가능
 * default   : 같은 패키지에서만 사용 가능
 * private   : 같은 클래스에서만 사용 가능 (가장 제한적)
 *
 * 개방성 : public > protected > default > private
 */
public class FieldEx {
    // 필드(Field)
    // - 객체의 속성을 나타냄

    // - 필드 == 멤버변수

    // * 작성법 *
    // [접근제한자] [예약어] 자료형 변수명 [=초기값];

    // 접근제한자 별 필드 선언 가능
    public        int  publicValue = 10;
    protected     int  protectedValue = 10;
    /* default */ int  defaultValueOne = 10;
                  int  defaultValueTwo = 10;

    /* default 는 생략
     * 제어자 'default'은(는) 허용되지 않습니다.
     * default int  defaultValueThree = 10;
     */

    private       int  privateValue = 10;

    // 모든 접근 제한자가 같은 클래스 내부에 접근 가능하기 때문에 오류 없음
    public void method1(){
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValueOne);
        System.out.println(privateValue);
    }
}
