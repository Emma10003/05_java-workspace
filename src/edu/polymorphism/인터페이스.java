package edu.polymorphism;

// 추후 작성해야 하는 기능 위주로 설정하는 문서.
public interface 인터페이스 {
    /*
    멤버변수, 인스턴스 변수 속성을 작성할 때
    임의의 공간이 설정된 속성이 아닌 데이터가 들어있는 상수이름만 생성 가능.
    private 불가!!!
    String name = "김개발"; 과 같은 리터럴 형태만 가능.
    
    인터페이스에서 작성하는 모든 필드명은 자동으로 public static final 로 처리됨.
    
    static : main(String[] args) 실행 시 모든 상황에서 접근 가능한 위치.
                => 반드시 public 이다!
    final : 값을 변경할 수 없는 상수.
            필드명에 들어있는 데이터를 변경할 수 없음.

    인터페이스에서는 주로 추후에 작성해야 하는 메서드(기능)만 정의함.
    */

    // static으로 작성해야 하는 데이터는 나중에 '설정파일'이라는 곳에 한 번에 작성할 예정

    // public 생략 가능 -> 어차피 반드시 public 이기 때문!
    //                 => private, default, protected 모두 사용 불가능하기 때문.
    // why? ~> 무조건 나중에 재설정해야 하는 메서드만 나열하기 때문에,
    // 해당 메서드들에 접근할 수 있도록 public.
    // 메서드 작성 형식 ----------------------
    // public void/자료형 기능명칭();  => {}가 붙은 메서드는 작성 불가능.
    void fly();
    public void land();

    // public void map(){}; // {} 가 작성된 메서드는 작성 불가능

}
